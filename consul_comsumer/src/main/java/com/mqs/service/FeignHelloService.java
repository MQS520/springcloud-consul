package com.mqs.service;

import com.mqs.service.impl.FeignHelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-producer", fallback = FeignHelloHystrix.class)
public interface FeignHelloService {

    @RequestMapping("/hello")
    public String hello();

}
