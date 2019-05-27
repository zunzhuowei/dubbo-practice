package com.game.qs.service;

import com.game.qs.constants.ServiceConsts;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by zun.wei on 2019/5/27 17:58.
 * Description:
 */
@Service(version = ServiceConsts.ServiceVersion.USER_VERSION)
public class UserService implements IUserService {


    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }

}
