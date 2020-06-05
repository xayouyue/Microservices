package com.youyue.payclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/pay")
    public String pay() throws InterruptedException {
        Thread.sleep(5000);
        return instanceId;
    }

}
