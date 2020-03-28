package com.line.code.code.two.service;

import com.line.code.code.two.exception.BusinessException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 15:53
 * @Description: 触发异常
 */
@Service
public class ExceptionService {

    public String otherException() {
        throw new NullPointerException();
    }

    public String BusinessException() {
        throw new BusinessException(ExceptionService.class+"抛出的业务异常");
    }

}
