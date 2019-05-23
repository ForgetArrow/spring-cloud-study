package com.king;

import com.king.event.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangjinbo
 * @create 2017-05-09下午 7:51
 */
@SpringBootApplication
@RestController
public class HelloBoot {

    @RequestMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping("/now")
    public String now() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public static void main(String[] args) {
        // 直接运行
        // SpringApplication.run(HelloWorld.class, args);
        // 自定义启动
        SpringApplication app = new SpringApplication(HelloBoot.class);
        // 添加-Event Listener
        app.addListeners(new StartingEventListener(), new EnvironmentPreparedEventLisenter(),
                new PreparedEventListener(), new ReadyEventListener(), new FailEventListener());
        app.run(args);
    }
}
