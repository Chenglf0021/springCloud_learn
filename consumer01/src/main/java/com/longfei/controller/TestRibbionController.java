package com.longfei.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.aspectj.lang.annotation.After;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName: TestRibbionController
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 10:41
 * @Version: 1.0
 **/
@RestController
public class TestRibbionController {
    @Autowired
    EurekaClient eurekaClient;
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    /*
     *@Auth:chenglongfei
     *@Description: 测试手动选择其中的一个来进行调用
     *@Date 11:17 2021/12/18
     *@param []
     *@return java.lang.String
     *
     **/
    @GetMapping("/testRibbion")
    public String testHello() {
        //拿到服务注册表
        List<InstanceInfo> instancesByVipAddress = eurekaClient.getInstancesByVipAddress("provider", true);
        InstanceInfo instanceInfo = instancesByVipAddress.get(0);
        String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/hello";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        return entity.getBody();
    }

    /*
     *@Auth:chenglongfei
     *@Description: 采用loadblanceclient 进行负载均衡，默认测量为轮训
     *@Date 11:22 2021/12/18
     *@param []
     *@return java.lang.String
     *
     **/
    @GetMapping("/test2")
    public String test2() {
        ServiceInstance provider = loadBalancerClient.choose("provider");
        String url = "http://" + provider.getHost() + ":" + provider.getPort() + "/hello";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        return entity.getBody();
    }

    /*
     *@Auth:chenglongfei
     *@Description: 采用loadblanceclient 进行负载均衡，默认测量为轮训
     *@Date 11:22 2021/12/18
     *@param []
     *@return java.lang.String
     *
     **/
    @GetMapping("/test3")
    public String test3() {
        String url = "http://provider"+"/hello";
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        return entity.getBody();
    }
}
