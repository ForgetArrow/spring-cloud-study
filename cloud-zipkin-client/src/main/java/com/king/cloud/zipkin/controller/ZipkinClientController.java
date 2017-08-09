package com.king.cloud.zipkin.controller;

import com.king.cloud.zipkin.service.ZipkinClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjinbo
 * @create 2017-08-09上午 11:43
 */
@RestController
public class ZipkinClientController {

    @Autowired
    private ZipkinClientService zipkinClientService;

    @RequestMapping("/")
    public String sayHello(String name) {
        return zipkinClientService.sayHello(name);
    }
}
