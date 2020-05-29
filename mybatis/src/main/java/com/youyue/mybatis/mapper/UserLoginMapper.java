package com.youyue.mybatis.mapper;

import com.youyue.mybatis.model.UserLogin;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserLoginMapper {
    List<UserLogin> selectAll();
}
