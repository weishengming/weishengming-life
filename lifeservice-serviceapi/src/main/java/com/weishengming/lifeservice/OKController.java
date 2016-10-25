package com.weishengming.lifeservice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/")
@Api(description = "监控接口")
public class OKController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OKController.class);

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    public String ok() {
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format1.format(new Date());
        return "ok," + s;
    }
}
