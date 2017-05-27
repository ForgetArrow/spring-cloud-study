package com.king.eureka.service.impl;

import com.king.eureka.service.ServiceHelloIfc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author wangjinbo
 * @create 2017-05-26下午 4:08
 */
@Service
public class ServiceHelloImpl implements ServiceHelloIfc {

    @Value("${server.port}")
    private String port;


    @Override
    public String sayHi(String name) {
        return "hi " + name + ", i am from port : " + port;
    }
}
