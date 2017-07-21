package com.king.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud 配置文件管理服务器
 *
 * @author wangjinbo
 * @create 2017-05-12下午 1:59
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ApplicationConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
}
