package com.youyue.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/test")
    public String test() {
        System.out.println(toString());
        return hystrixService.test();
    }

}
