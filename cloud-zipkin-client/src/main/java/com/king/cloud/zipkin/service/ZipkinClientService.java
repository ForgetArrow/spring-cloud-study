package com.king.cloud.zipkin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangjinbo
 * @create 2017-08-09上午 11:44
 */
@FeignClient("service-hello")
public interface ZipkinClientService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHello(@RequestParam String name);
}
