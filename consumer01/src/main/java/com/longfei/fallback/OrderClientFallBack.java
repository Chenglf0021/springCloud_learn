package com.longfei.fallback;

import com.longfei.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderClientFallBack implements OrderService {
    @Override
    public String testFeign1() {
        return "sorry ,异常";
    }
}
