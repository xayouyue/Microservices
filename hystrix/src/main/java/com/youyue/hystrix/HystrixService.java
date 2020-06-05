package com.youyue.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

@Service
public class HystrixService {

    //当该方法出现异常，则降级为fallback方法
    @HystrixCommand(fallbackMethod = "fallback",
            commandProperties = {
            @HystrixProperty(name="execution.isolation.strategy",value="THREAD"),
            @HystrixProperty(name="",value="")
    }, threadPoolProperties = {
            @HystrixProperty(name="",value="")
    }
    )
    public String test() {
        double a = 1/0;
        return "success";
    }

    private String fallback() {
        return "fail";
    }

}
