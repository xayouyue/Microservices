package com.youyue.springboot;


import com.youyue.test.Student;
import com.youyue.teststarter.StarterConfig;
import com.youyue.teststarter.TestProperties;
import com.youyue.teststarter.YouyueDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//将一个配置作为其他类被扫描时的依赖载入
//@Import(com.youyue.springboot.config.FirstConfig.class)
public class TestController {

    @Autowired
    private YouyueDataSource youyueDataSource;

    @Autowired
    private BeanTest beanTest;

    @Autowired
    private Student student;

    @RequestMapping("/test")
    public String a() {
        System.out.println(youyueDataSource.getUrl());
        System.out.println(youyueDataSource.getUser());
        System.out.println(youyueDataSource.getPwd());
        return beanTest.getName();
    }

}
