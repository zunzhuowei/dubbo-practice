package com.game.qs.rest;

import com.game.qs.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zun.wei on 2019/5/28 15:31.
 * Description:
 */
@RestController
public class UserRest {

    @Reference
    private IUserService userService;


    @GetMapping
    public String sayHello(String name) {
        System.out.println("name = " + name);
        return userService.sayHello(name);
    }


}
