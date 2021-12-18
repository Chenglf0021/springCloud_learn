package com.longfei.controller;

import com.longfei.api.UserAPI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 12:11
 * @Version: 1.0
 **/
@RestController
public class UserController implements UserAPI {
    @Value("${server.port}")
    String port;

    @Override
    @GetMapping("/testFeign1")
    public String testFeign1() {
        String message = "我是：" + port;
        return message;
    }
}
