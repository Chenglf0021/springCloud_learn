package com.longfei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer01Application
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 10:07
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer02Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02Application.class, args);
    }
}
