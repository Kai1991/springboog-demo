package com.meidian.springbootdemo.handle;

import com.meidian.springbootdemo.common.ResultUtil;
import com.meidian.springbootdemo.common.ServiceResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一的异常处理类
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ServiceResult handle(Exception e){
        return ResultUtil.error(500,e.getMessage());
    }
}
