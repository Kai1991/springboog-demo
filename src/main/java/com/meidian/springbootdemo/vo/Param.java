package com.meidian.springbootdemo.vo;

import java.io.Serializable;

public class Param implements Serializable {


    private String test;

    private Integer testInt;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public Integer getTestInt() {
        return testInt;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }

}
