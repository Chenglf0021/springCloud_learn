package com.longfei.service;

import com.longfei.api.UserAPI;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: OrderService
 * @Description:
 * @Author:chenglongfei
 * @Date: 2021/12/18 11:52
 * @Version: 1.0
 **/
@FeignClient(name = "PROVIDER")
public interface OrderService extends UserAPI {
    @GetMapping("/testFeign1")
    public String testFeign1();
}
