package com.king.event;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author wangjinbo
 * @create 2017-05-11上午 11:19
 */
public class EnvironmentPreparedEventLisenter implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("************ 2)Environment初始化后创建context之前：Event published when a SpringApplication is" +
                "starting up and the Environment is first available for inspection and modification************");
    }
}
