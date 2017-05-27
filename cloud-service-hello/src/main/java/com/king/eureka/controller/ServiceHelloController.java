package com.king.eureka.controller;

import com.king.eureka.service.ServiceHelloIfc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjinbo
 * @create 2017-05-26下午 4:18
 */
@RestController
public class ServiceHelloController {

    @Autowired
    private ServiceHelloIfc serviceHello;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name){
        return serviceHello.sayHi(name);
    }
}
