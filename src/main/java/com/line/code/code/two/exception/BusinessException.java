package com.line.code.code.two.exception;

/**
 * @Author: yangcs
 * @Date: 2020/3/28 15:43
 * @Description: 自定义业务异常
 */
public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException() {
    }
}
