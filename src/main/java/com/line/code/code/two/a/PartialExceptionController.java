package com.line.code.code.two.a;

import com.line.code.code.one.base.controller.BasicController;
import com.line.code.code.one.base.domain.Response;
import com.line.code.code.two.exception.BusinessException;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 15:29
 * @Description: 部分的异常处理controller  不是全局处理,只有继承的类抛出自定义的异常 才会处理
 */
@Component
public class PartialExceptionController extends BasicController {


    //异常处理逻辑
//    @ExceptionHandler(Exception.class)
    public Response handlerException(Exception exception) {
        exception.printStackTrace();
        if(exception instanceof BusinessException){
            //自定义异常,自己写处理逻辑
            return returnFailure(exception.getMessage());
        }else{
            //未捕获异常
            return returnFailure("系统异常,请联系管理员!");
        }
    }

}
