package com.king.event;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author wangjinbo
 * @create 2017-05-11上午 11:10
 */
public class StartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("************ 1)系统启动：Event published as early as possible, Before the Environment or ApplicationContext is available," +
                " but after the ApplicationListeners have been registered.************");
    }
}
