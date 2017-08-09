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

    /**
     * 使用 feign 方式访问service-hello服务
     *
     * @param name
     * @return
     */
    @RequestMapping("/zipkin")
    public String sayHello(String name) {
        return zipkinClientService.sayHello(name);
    }

    @RequestMapping("visit")
    public String directVisit(String name) {
        return "hi " + name + ", Your're direct visit the server.";
    }
}
