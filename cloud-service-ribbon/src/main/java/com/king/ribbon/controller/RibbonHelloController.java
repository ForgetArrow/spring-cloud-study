package com.king.ribbon.controller;

import com.king.ribbon.service.RibbonHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjinbo
 * @create 2017-05-24上午 10:00
 */
@RestController
public class RibbonHelloController {
    @Autowired
    private RibbonHelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.helloService(name);
    }
}
