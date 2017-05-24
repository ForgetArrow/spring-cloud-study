package com.king.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangjinbo
 * @create 2017-05-24上午 9:51
 */
@Service
public class RibbonHelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String helloService(String name) {
        return restTemplate.getForObject("http://SERVICE-HELLO/hi?name=" + name, String.class);
    }
}
