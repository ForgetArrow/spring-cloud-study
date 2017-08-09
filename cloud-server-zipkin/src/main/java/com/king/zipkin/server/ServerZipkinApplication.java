package com.king.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * 分布式追踪组件zipkin
 * Spring Cloud Sleuth 主要功能就是在分布式系统中提供追踪解决方案，目前已集成了zipkin组件
 *
 * @author wangjinbo
 * @create 2017-08-09上午 11:02
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }
}
