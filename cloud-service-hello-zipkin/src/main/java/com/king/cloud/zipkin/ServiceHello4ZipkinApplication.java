package com.king.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * “say hello”服务[集成分布式追踪功能spring cloud sleuth的zipkin组件，为cloud-zipkin-client提供feign方式的服务调用]
 *
 * @author wangjinbo
 * @create 2017-08-09 14:05
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceHello4ZipkinApplication {

    public static void main(String[] args) {


        SpringApplication.run(ServiceHello4ZipkinApplication.class, args);
    }
}
