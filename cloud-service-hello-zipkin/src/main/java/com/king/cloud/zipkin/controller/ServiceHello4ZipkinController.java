package com.king.cloud.zipkin.controller;

import com.king.cloud.zipkin.service.ServiceHello4ZipkinIfc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjinbo
 * @create 2017-08-09下午 2:25
 */
@RestController
public class ServiceHello4ZipkinController {

    @Autowired
    private ServiceHello4ZipkinIfc serviceHello4Zipkin;

    @RequestMapping("/hello4Zipkin")
    public String sayHello4Zipkin(String name) {
        return serviceHello4Zipkin.sayHi(name);
    }
}
