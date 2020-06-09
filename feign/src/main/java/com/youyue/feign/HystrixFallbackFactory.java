package com.youyue.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HystrixFallbackFactory implements FallbackFactory<HystrixService> {

    @Autowired
    private Fallback fallback;

    @Override
    public HystrixService create(Throwable throwable) {
        throwable.printStackTrace();
        return fallback;
    }

    @Component
    public class Fallback implements HystrixService {

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
}
