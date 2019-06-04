package com.mqs.controller;

import com.mqs.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    @Autowired
    private FeignHelloService feignHelloService;

    @RequestMapping("/feign/call")
    public String call(){
        return feignHelloService.hello();
    }

}
