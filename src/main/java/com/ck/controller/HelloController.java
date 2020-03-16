package com.ck.controller;

import com.ck.bean.UserInfo;
import com.ck.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class HelloController {
    @Resource
    private UserInfoService userInfoService ;

    @RequestMapping("/hello")
    public String hello(Model map) {
        UserInfo userInfo = userInfoService.selectById(4);
        System.out.println(userInfo.getCreateDay());
        map.addAttribute("name",userInfo);
        return "hello";

    }
}
