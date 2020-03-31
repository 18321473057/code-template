package com.line.code.code.two.b;

import com.line.code.code.one.base.domain.Response;
import com.line.code.code.two.exception.BusinessException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 16:20
 * @Description:全局异常处理者; 返回json格式,而不是页面;;;;其实这里是废话,是对视图的理解不到位, json数据也是视图的一种, 视图并不仅仅是页面,也可以是一组数据;
 */
@Component
public class GlobalExceptionRelover implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
            e.printStackTrace();
            ModelAndView mv = new ModelAndView();
            //定义json 视图
            MappingJackson2JsonView view = new MappingJackson2JsonView();
            mv.setView(view);
            if(e instanceof BusinessException){
                   //自定义异常,自己写处理逻辑
                mv.addObject("status", "401001");
                mv.addObject("message", "自定义异常,业务出现问题!");
            }else{
                //未捕获异常
                mv.addObject("status", "500");
                mv.addObject("message", "系统异常,请联系管理员!");
            }
        return mv;
    }
}
