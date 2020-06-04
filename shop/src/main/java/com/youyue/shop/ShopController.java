package com.youyue.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@RestController
public class ShopController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/pay")
    public String shop() {
        discoveryClient.getServices().forEach(System.out::println);
        List<ServiceInstance> instances = discoveryClient.getInstances("payclient");
        int size = instances.size();
        Random random = new Random();
        ServiceInstance instance = instances.get(random.nextInt(size));
        String host = instance.getHost();
        int port = instance.getPort();
        StringBuilder sb = new StringBuilder("http://");
        sb.append(host).append(":").append(port).append("/pay");
        String response = restTemplate.getForObject(sb.toString(),String.class);
        return response;
    }

    @GetMapping("/pay2")
    public String pay() {
        return restTemplate.getForObject("http://payclient/pay", String.class);
    }

}
