package com.king.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangjinbo
 * @create 2017-05-24上午 10:30
 */
@FeignClient(value = "service-hello")
public interface FeignHelloService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String yourName);
}
