package com.line.code.code.four;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/login")
@Controller
public class LoginController {

    @Autowired
    private LoginService service;

    //登录接口，由拦截器校验登录信息
    @RequestMapping("/index")
    @ResponseBody
    public String index(@RequestParam("code") String code) {
        System.out.println(code);
        return service.login();
    }

    //没有登陆信息 去登陆
    @RequestMapping("/error")
    @ResponseBody
    public String error() {
        return "赶快去登录!";
    }


    //一次请求结束后，再去请求其他接口 ，从session 中获取用户
    @RequestMapping("/shop")
    @ResponseBody
    public String shop() {
        return service.shop();
    }


}
