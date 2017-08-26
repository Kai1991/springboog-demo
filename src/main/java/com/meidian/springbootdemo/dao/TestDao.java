package com.meidian.springbootdemo.dao;

import com.meidian.springbootdemo.entity.Access;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    public Access select();
}
