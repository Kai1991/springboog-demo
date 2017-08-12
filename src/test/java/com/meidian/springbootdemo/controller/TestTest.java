package com.meidian.springbootdemo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestTest {
    @Autowired
    MockMvc mvc;

    //Controller的单元测试
    @Test
    public void test1() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/test/hi"))
        .andExpect(MockMvcResultMatchers.status().isOk());//期望返回的状态码为200
    }

}