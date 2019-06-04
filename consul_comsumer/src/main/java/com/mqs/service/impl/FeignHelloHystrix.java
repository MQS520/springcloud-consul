package com.mqs.service.impl;

import com.mqs.service.FeignHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class FeignHelloHystrix implements FeignHelloService {

    @Override
    @RequestMapping("/hello")
    public String hello() {
        return "sorry, this service call failed !";
    }
}
