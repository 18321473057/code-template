package com.line.code.code.four;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Service
public class LoginService {

    public String login(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Object name = request.getSession().getAttribute("code");
        if(name instanceof String){
           return (String)name;
        }
        return "没有得到用户信息！";
    }

    public String shop() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Object name = request.getSession().getAttribute("code");
        return "shop---"+name;
    }
}
