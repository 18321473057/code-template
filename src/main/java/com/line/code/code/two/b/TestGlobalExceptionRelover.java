package com.line.code.code.two.b;

import com.line.code.code.two.exception.BusinessException;
import com.line.code.code.two.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RestController
@RequestMapping("/test/golbal")
public class TestGlobalExceptionRelover {

    @Autowired
    private ExceptionService exceptionService;

    //其他异常
    @RequestMapping("/other")
    public String other() {
        return exceptionService.otherException();
    }

    //自定义异常
    @RequestMapping("/business")
    public String business() {
        return exceptionService.BusinessException();
    }


}
