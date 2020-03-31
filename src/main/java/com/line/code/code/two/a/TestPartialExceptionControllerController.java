package com.line.code.code.two.a;

import com.line.code.code.two.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 15:49
 * @Description:  演示统一的自定义异常捕捉 , 需要继承 PartialExceptionController
 */
@RestController
@RequestMapping("/test/partial")
public class TestPartialExceptionControllerController extends PartialExceptionController{
    @Autowired
    private ExceptionService exceptionService;

    //其他异常
    @RequestMapping("/other")
    public String other(){
       return  exceptionService.otherException();
    }

    //自定义异常
    @RequestMapping("/business")
    public String business(){
        return  exceptionService.BusinessException();
    }
}
