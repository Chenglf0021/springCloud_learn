package com.longfei.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestTempletCompanent
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 11:34
 * @Version: 1.0
 **/
@Configuration
public class RestTempletCompanent {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        RestTemplate restTemplate=new RestTemplate();
       // restTemplate.getInterceptors().add()添加自定义的负载均衡策略
        return new RestTemplate();
    }
}
