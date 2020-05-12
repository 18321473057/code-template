package com.line.code.code.four;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component
public class DingDLoginInterceptor implements HandlerInterceptor {

    //只需要拦截钉钉商城的那几个请求就好了,配置下拦截路径
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //根据code 获取用户信息
        String code = (String) request.getParameter("code");

        //钉钉账号查询
        if (code.equals("1234")) {
            //没有绑定账号,拦截去绑定
            response.sendRedirect(request.getContextPath() + "/test/error");  //重定向到登录界面
            return false;
        }
        //设置用户信息
        request.getSession().setAttribute("code", "ycs++" + code);
        return true;
    }

}
