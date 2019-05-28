package com.game.qs;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zun.wei on 2019/5/27 17:26.
 * Description:
 */
@EnableDubbo
@SpringBootApplication
public class UserConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApp.class);
    }


}
