package com.youyue.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(10000);
        return hystrixService.test();
    }
    @RequestMapping("/pay")
    public String pay() {
        return hystrixService.pay();
    }
    @RequestMapping("/shop")
    public String shop() {
        return hystrixService.shop();
    }


}
