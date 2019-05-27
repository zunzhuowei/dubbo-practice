package com.game.qs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by zun.wei on 2019/5/27 17:26.
 * Description:
 */
@EnableAutoConfiguration
public class UserProviderApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserProviderApp.class).run(args);
    }

}
