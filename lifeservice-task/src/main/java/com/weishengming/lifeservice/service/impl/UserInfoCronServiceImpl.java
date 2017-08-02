package com.weishengming.lifeservice.service.impl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.weishengming.lifeservice.service.UserInfoCronService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;

@Service("userInfoCronService")
public class UserInfoCronServiceImpl implements UserInfoCronService {
    private static final Logger   LOGGER = LoggerFactory.getLogger(UserInfoCronServiceImpl.class);
    @Override
    public void testAA() {
        System.out.println("testAA");

    }



}