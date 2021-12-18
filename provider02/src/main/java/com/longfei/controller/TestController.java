package com.longfei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 11:06
 * @Version: 1.0
 **/
@RestController
public class TestController {
    @Value("${server.port}")
    public int port;
    @GetMapping("/hello")
    public String testHello(){
        String message="hello"+port;
        System.out.println(message);
        return message;
    }
}
