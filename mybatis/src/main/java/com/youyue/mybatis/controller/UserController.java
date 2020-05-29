package com.youyue.mybatis.controller;

import com.youyue.mybatis.mapper.UserLoginMapper;
import com.youyue.mybatis.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @GetMapping("/users")
    @PostMapping("/pusers")
    public List<UserLogin> users() {
        return userLoginMapper.selectAll();
    }

}
