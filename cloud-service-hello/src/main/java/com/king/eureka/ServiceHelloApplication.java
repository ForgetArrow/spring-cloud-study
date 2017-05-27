package com.king.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 提供“say hello”服务
 *
 * @author wangjinbo
 * @create 2017-05-26下午 4:05
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHelloApplication.class, args);
    }
}
