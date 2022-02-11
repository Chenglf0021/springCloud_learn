package com.longfei.controller;

import com.longfei.constant.SystemConstant;
import com.longfei.dto.ReturnDTO;
import com.longfei.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/user")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ReturnDTO login(User user){
        System.out.println("login");
        return  ReturnDTO.create("0","1","200");
    }

}
