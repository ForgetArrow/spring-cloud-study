package com.king.feign.controller;

import com.king.feign.service.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjinbo
 * @create 2017-05-24上午 10:48
 */
@RestController
public class FeignHelloController {

    @Autowired
    private FeignHelloService helloService;

    @RequestMapping("/feignHello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}
