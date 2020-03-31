package com.line.code.code.two.b;

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
 * @Description:全局异常处理者
 */
@Component
public class TestGlobalExceptionRelover implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
            e.printStackTrace();
            ModelAndView mv = new ModelAndView();
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
        return null;
    }
}
