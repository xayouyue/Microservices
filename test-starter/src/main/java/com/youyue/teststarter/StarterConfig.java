package com.youyue.teststarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TestProperties.class)
public class StarterConfig {

    @Autowired
    private TestProperties testProperties;

    @Bean
    public YouyueDataSource youyueDataSource() {
        YouyueDataSource youyueDataSource = new YouyueDataSource();
        youyueDataSource.setUrl(testProperties.getUrl());
        youyueDataSource.setUser(testProperties.getUser());
        youyueDataSource.setPwd(testProperties.getPwd());
        return youyueDataSource;
    }


}
