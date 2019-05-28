package com.game.qs;

import com.game.qs.constants.ServiceConst;
import com.game.qs.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by zun.wei on 2019/5/27 17:26.
 * Description:
 */
@EnableAutoConfiguration
public class UserConsumerApp {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(version = ServiceConst.ServiceVersion.USER_VERSION,
            url = "dubbo://127.0.0.1:6656")
    private IUserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApp.class);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(userService.sayHello("--------------------mercyblitz---------------------"));
    }

}
