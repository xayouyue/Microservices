package com.youyue.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(name = "hystrix",fallbackFactory = HystrixFallbackFactory.class)
public interface HystrixService {

    @RequestMapping("/test")
    String test();
    @RequestMapping("/pay")
    String pay();
    @RequestMapping("/shop")
    String shop();

}
