package com.king.rest_template.ribbon.controller;

import com.king.rest_template.ribbon.service.RibbonHelloService;
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

    @RequestMapping("/restHello")
    public String hello(@RequestParam String name) {
        return helloService.helloService(name);
    }
}
