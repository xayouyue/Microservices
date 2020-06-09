package com.youyue.feign;

import org.springframework.stereotype.Component;

@Component
public class HystrixFallback implements HystrixService {
    @Override
    public String test() {
        return "fail test";
    }

    @Override
    public String pay() {
        return "fail pay";
    }

    @Override
    public String shop() {
        return "fail shop";
    }
}
