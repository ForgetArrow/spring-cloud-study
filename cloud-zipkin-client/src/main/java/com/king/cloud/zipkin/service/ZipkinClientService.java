package com.king.cloud.zipkin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangjinbo
 * @create 2017-08-09上午 11:44
 */
@FeignClient("zipkin-client-hello")
public interface ZipkinClientService {

    @RequestMapping(value = "/hello4Zipkin", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
