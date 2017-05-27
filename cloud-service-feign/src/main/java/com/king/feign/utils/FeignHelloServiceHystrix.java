package com.king.feign.utils;

import com.king.feign.service.FeignHelloService;
import org.springframework.stereotype.Component;

/**
 * @author wangjinbo
 * @create 2017-05-26下午 4:45
 */
@Component
public class FeignHelloServiceHystrix implements FeignHelloService {

    @Override
    public String sayHello(String yourName) {
        return "sorry " + yourName + ", Error Happened!";
    }
}
