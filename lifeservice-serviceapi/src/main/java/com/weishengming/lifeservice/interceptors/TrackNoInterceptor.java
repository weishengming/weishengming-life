package com.weishengming.lifeservice.interceptors;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.weishengming.lifeservice.hessian.HessianHeaderContext;

/**
 * 代码跟踪
 * @author yangtianci
 * @version $Id: TrackNoInterceptor.java, v 0.1 2016年10月25日 下午5:19:11 yangtianci Exp $
 */
@Component
public class TrackNoInterceptor implements HandlerInterceptor {

    /** 
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        //从请求header中获取跟踪号，如果没有则服务端生成
        String strTrackNo = request.getHeader("TrackNo");
        String userAgent = request.getHeader("user-agent");
        if (StringUtils.isBlank(strTrackNo)) {
            strTrackNo = UUID.randomUUID().toString().replaceAll("-", StringUtils.EMPTY);
        }
        //设置 trackNo
        HessianHeaderContext.getContext().addHeader("TrackNo", strTrackNo);
        HessianHeaderContext.getContext().addHeader("userAgent", userAgent);
        MDC.put("tid", strTrackNo);
        MDC.put("userAgent", userAgent);
        return true;
    }

    /** 
     * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    /** 
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {

    }

}
