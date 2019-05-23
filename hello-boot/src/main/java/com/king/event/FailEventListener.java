package com.king.event;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author wangjinbo
 * @create 2017-05-11上午 11:47
 */
public class FailEventListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        System.out.println("************ 5)启动期间发生异常：Event published by a SpringApplication when it fails to start.************");
    }
}
