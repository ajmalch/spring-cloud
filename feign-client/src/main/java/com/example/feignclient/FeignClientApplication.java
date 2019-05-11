package com.example.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RefreshScope
@EnableFeignClients
@EnableEurekaClient
@RestController
public class FeignClientApplication {

    @Autowired
    private FeignClientSample feignClientSample;

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }


    @GetMapping("/feign-client/hello")
    public String hello(){
        return "From Feign client - " +feignClientSample.hello();
    }

    @GetMapping("/feign-client/hi")
    public String hi(){
        return "Hi From Feign client ";
    }

}
