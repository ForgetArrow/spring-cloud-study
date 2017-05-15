package com.king.event;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author wangjinbo
 * @create 2017-05-11上午 11:25
 */
public class PreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("************ 3)bean定义加载之后，context刷新之前：Event published as when a SpringApplication " +
                "is starting up and the ApplicationContext is fully prepared but not refreshed************");
    }
}
