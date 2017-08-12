package com.meidian.springbootdemo.controller;

import com.meidian.springbootdemo.aspect.MyAspect;
import com.meidian.springbootdemo.config.TestConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {
    private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);

    @Autowired
    private TestConfig testConfig;

    @Value("${test1}")
    private String congfigOfMy;

    //获取自定义的配置
    @RequestMapping(value = {"/world","/hi"})
    public String test(){
        return congfigOfMy;
    }

    //
    @RequestMapping("testConfig")
    public String testConfig(){
        logger.info("this is testConfig");
        return testConfig.getA();
    }

    @RequestMapping("index")
    public String index() throws Exception{
        throw new Exception("test");
//        return "index";
    }


}
