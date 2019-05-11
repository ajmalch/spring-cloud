package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("config-client-sample")
public interface FeignClientSample {

    @GetMapping("/config-client/sayHi")
    String hello();
}
