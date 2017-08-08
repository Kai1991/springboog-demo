package com.meidian.springbootdemo.enums;

public enum ResultEnum {
    UNKONW_ERROR(-1,"位置错误"),

    SUCCESS(0,"成功");



    private Integer code;

    private String message;

     ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
