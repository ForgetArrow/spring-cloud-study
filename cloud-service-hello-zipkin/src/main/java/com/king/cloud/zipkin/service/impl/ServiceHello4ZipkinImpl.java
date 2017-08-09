package com.king.cloud.zipkin.service.impl;

import com.king.cloud.zipkin.service.ServiceHello4ZipkinIfc;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author wangjinbo
 * @create 2017-08-09下午 2:27
 */
@Service
public class ServiceHello4ZipkinImpl implements ServiceHello4ZipkinIfc {

    @Value("${server.port}")
    private String port;

    @Override
    public String sayHi(String name) {
        return "hi " + name + ", You're through zipkin. server.port:" + port;
    }
}
