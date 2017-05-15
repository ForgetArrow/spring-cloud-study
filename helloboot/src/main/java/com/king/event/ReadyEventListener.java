package com.king.event;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author wangjinbo
 * @create 2017-05-11上午 11:44
 */
public class ReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("************ 4)context刷新和任何回调处理好后，初始化完成，可以接受请求：" +
                "Event published as late as possible to indicate that the application is ready to service requests************");
    }
}
