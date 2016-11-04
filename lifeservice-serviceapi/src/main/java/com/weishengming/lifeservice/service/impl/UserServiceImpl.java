package com.weishengming.lifeservice.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.weishengming.hessian.lifeservice.api.bean.UserBean;
import com.weishengming.hessian.lifeservice.api.service.UserService;
import com.weishengming.lifeservice.dao.entities.User;
import com.weishengming.lifeservice.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
    private static final Logger logger      = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository      userRepository;
    @Value("${secret.ket}")
    private String              secret_key;                                                  //秘钥
    final static String         ISSUER      = "com.weishengming";
    final static String         AUD         = "WEI-SHENG-MING";
    final static String         SUB_TAG     = "sub";
    final static String         ISS_TAG     = "iss";
    final static String         IAT_TAG     = "iat";
    final static String         EXP_TAG     = "exp";
    final static String         AUD_TAG     = "aud";
    final static String         USER_ID_TAG = "userId";

    @Override
    public Integer saveUser(String mobile, String password) {
        User user = new User();
        user.setMobile(mobile);
        user.setPassword(password);
        logger.error("保存用户{}", user.toString());
        return userRepository.save(user);
    }

    @Override
    public Boolean checkMobile(String mobile) {
        return userRepository.checkMobile(mobile);
    }

    @Override
    public Boolean checkMobileAndPassword(String mobile, String password) {
        return userRepository.checkMobileAndPassword(mobile, password);
    }

    @Override
    public Map<String, String> validToken(String userId, String token, long time, Map<String, String> resultMap) {
        try {
            logger.info("validToken-->token:" + token);
            final JWTVerifier verifier = new JWTVerifier(secret_key);
            Map<String, Object> claims = null;
            try {
                claims = verifier.verify(token); //验证是否篡改
            } catch (Exception e) {
                resultMap.put("code", "-10");
                resultMap.put("msg", "该用户不存在！");
                logger.info("validToken1-->token不存在:-->token:" + token);
                return resultMap;
            }
            if (claims != null && claims.size() > 0) {
                resultMap.put("userId", claims.get("userId").toString());
                if (userId == null) {// 
                    resultMap.put("code", "-10");
                    logger.info("validToken2-->token不存在:-->token:" + token);
                    resultMap.put("msg", "该用户不存在！");
                    return resultMap;
                }
                //其他判断过期情况
                if (Long.parseLong(claims.get("exp").toString()) <= new Date().getTime()) {//是否过期
                    resultMap.put("code", "-30");
                    resultMap.put("msg", "亲，您的token已过期啦，请重新登录！");
                    logger.info("validToken-->token过期:-->token:" + token);
                    return resultMap;
                }
                /**给数据库的token进行比对**/
                String token_db = getTokenByUserId(userId);
                if (StringUtils.isBlank(token_db)) {
                    resultMap.put("code", "-10");
                    logger.info("validToken2-->token不存在:-->token:" + token);
                    resultMap.put("msg", "该用户不存在！");
                    return resultMap;
                } else {
                    if (!token.equals(token_db)) {
                        resultMap.put("code", "-10");
                        logger.info("validToken2-->token无效:-->token:" + token);
                        resultMap.put("msg", "该用户不存在！");
                        return resultMap;
                    }
                }
            }
        } catch (Exception e) {
            resultMap.put("code", "-40");
            resultMap.put("msg", "请重新登录！");
            logger.error("-->UserServiceImpl类中validToken方法报错，信息如下：" + e.getMessage());
            return resultMap;
        }
        resultMap.put("code", "200");
        resultMap.put("msg", "验证通过，可以登陆");
        return null;
    }

    @Override
    public String getTokenByMobile(String mobile) {
        User user = userRepository.findOneByMobile(mobile);
        if (null != user) { //每次登陆都生成新的token
            final JWTSigner signer = new JWTSigner(secret_key);
            final Map<String, Object> claims = new HashMap<String, Object>();
            claims.put(ISS_TAG, ISSUER);
            Date date = new Date();//签发时间
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 1);
            claims.put(IAT_TAG, date.getTime());
            claims.put(EXP_TAG, c.getTime().getTime());//设置过期时间
            claims.put(AUD_TAG, AUD);//设置接收方
            claims.put(USER_ID_TAG, user.getUserId());//保存用户id
            String token = signer.sign(claims);
            user.setToken(token);
            userRepository.save(user);
            return token;
        }
        return null;
    }

    @Override
    public String getTokenByUserId(String userId) {
        User user = userRepository.findOneByUserId(userId);
        if (null != user && StringUtils.isNotBlank(user.getToken())) {
            return user.getToken();
        }
        return null;
    }

    @Override
    public UserBean findUserByUserId(String userId) {
        User user = userRepository.findOneByUserId(userId);
        if (null != user) {
            UserBean bean = new UserBean();
            BeanUtils.copyProperties(user, bean);
            return bean;
        }
        return null;

    }

}
