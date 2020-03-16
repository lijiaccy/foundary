package com.ck.controller;

import com.ck.bean.UserInfo;
import com.ck.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService ;

    @RequestMapping("/saveData")
    @ResponseBody
    public String saveData (){
        UserInfo userInfo = new UserInfo () ;
        userInfo.setId(4);
        userInfo.setUserName("winter");
        userInfo.setPassWord("567");
        userInfo.setPhone("13977776789");
        userInfo.setEmail("winter");
        userInfo.setCreateDay("2020-02-20");
        userInfoService.saveData(userInfo);
        return "sus";
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public UserInfo selectById () {
        return userInfoService.selectById(4) ;
    }

    @RequestMapping("/selectList")
    @ResponseBody
    public List<UserInfo> selectList () {
        return userInfoService.selectList() ;
    }


}