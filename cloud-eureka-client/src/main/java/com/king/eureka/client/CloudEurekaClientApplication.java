package com.king.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjinbo
 * @create 2017-05-18上午 11:06
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudEurekaClientApplication {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name + ", i am from port : " + port;

    }

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaClientApplication.class, args);
    }
}
