package com.meidian.springbootdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class MyAspect {

    private static final Logger logger = LoggerFactory.getLogger(MyAspect.class);


    //切点
    @Pointcut("execution(public * com.meidian.springbootdemo.controller.Test.*(..))")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}",request.getRequestURL());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //className
        logger.info("className={}",joinPoint.getSignature().getDeclaringTypeName() + joinPoint.getSignature().getName());
        //param
        logger.info("param={}",joinPoint.getArgs());
        logger.info("shi is my aspect before");
    }

    @After("pointCut()")
    public void after(){
        logger.info("shi is my aspect after");
    }

    //获取返回的信息
    @AfterReturning(returning = "object",pointcut = "pointCut()")
    public void afterReturning(Object object){
        logger.info("response={}",object);
    }
}
