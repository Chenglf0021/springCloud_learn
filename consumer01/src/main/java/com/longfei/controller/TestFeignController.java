package com.longfei.controller;

import com.longfei.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestFeignController
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 11:47
 * @Version: 1.0
 **/
@RestController
public class TestFeignController {
    @Autowired
    OrderService orderService;

    @GetMapping("/testFeign1")
    public String testFeign1() {
        return orderService.testFeign1();
    }
}
