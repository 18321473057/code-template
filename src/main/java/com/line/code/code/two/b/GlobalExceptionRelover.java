package com.line.code.code.two.b;

import com.line.code.code.one.base.domain.Response;
import com.line.code.code.two.exception.BusinessException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 16:20
 * @Description:全局异常处理者
 */
@Component
public class GlobalExceptionRelover implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
            e.printStackTrace();
            if(e instanceof BusinessException){
                ModelAndView mv = new ModelAndView();
                //自定义异常,自己写处理逻辑
                return ;
            }else{
                //未捕获异常
                return returnFailure("系统异常,请联系管理员!");
            }
        return null;
    }
}
