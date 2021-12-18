package com.longfei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: Provider01Application
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 10:56
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class Provider01Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider01Application.class,args);
    }
}
