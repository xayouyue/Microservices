package com.youyue.springboot.config;

import com.youyue.test.Student;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//当在application配置文件中找到该属性，则装配该配置类
@ConditionalOnProperty(name = "a.b.c",havingValue = "123",matchIfMissing = true)
@Configuration
@ComponentScan("com.youyue.test")
public class FirstConfig {

    //只要在配置类中的方法写上Bean注解，就会把这个方法的返回值作为Bean注册到Spring容器
//    @Bean
//    public Student student() {
//        Student student = new Student();
//        student.setId(1);
//        student.setName("kissli");
//        return student;
//    }

}
