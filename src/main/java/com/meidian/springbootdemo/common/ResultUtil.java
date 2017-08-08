package com.meidian.springbootdemo.common;

public class ResultUtil  {

    public static ServiceResult success(Object data){
        ServiceResult result = new ServiceResult();
        result.setCode(0);
        result.setMessage("success");
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static ServiceResult success(Object data,String message){
        ServiceResult result = new ServiceResult();
        result.setCode(0);
        result.setMessage(message);
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static ServiceResult error(String message){
        ServiceResult result = new ServiceResult();
        result.setCode(1);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }

    public static ServiceResult error(Integer code,String message){
        ServiceResult result = new ServiceResult();
        result.setCode(code);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }

}
