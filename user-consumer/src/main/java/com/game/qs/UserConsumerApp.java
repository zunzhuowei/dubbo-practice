package com.game.qs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by zun.wei on 2019/5/27 17:26.
 * Description:
 */
@EnableAutoConfiguration
public class UserConsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApp.class, args);
    }

}
