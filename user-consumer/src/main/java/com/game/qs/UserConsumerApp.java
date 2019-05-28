package com.game.qs;

import com.game.qs.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zun.wei on 2019/5/27 17:26.
 * Description:
 */
@RestController
@EnableAutoConfiguration
public class UserConsumerApp {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Reference(version = "${service.user.version}", url = "${service.user.url}")
    private IUserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApp.class);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(userService.sayHello("-------------------- mercyblitz ---------------------"));
    }

    @GetMapping("/say-hello")
    public String sayHello(@RequestParam String name) {
        return userService.sayHello(name);
    }


}
