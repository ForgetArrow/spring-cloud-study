package com.king.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author wangjinbo
 * @create 2017-08-09上午 11:27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ZipkinClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class, args);
    }
}
