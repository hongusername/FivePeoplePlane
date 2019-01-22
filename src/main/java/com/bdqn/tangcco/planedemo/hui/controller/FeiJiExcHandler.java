package com.bdqn.tangcco.planedemo.hui.controller;

import com.bdqn.tangcco.planedemo.entity.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: 马旭辉
 * @Date: 2019/1/22 14:04
 * @Description: 异常处理类
 */
//@RestControllerAdvice
public class FeiJiExcHandler {
    private Logger logger = LoggerFactory.getLogger(FeiJiExcHandler.class);

    // @ExceptionHandler(Exception.class)
    public Object defaultErrorHandler(HttpServletRequest request, Exception e) {
        logger.error("", e);
        MyException me = new MyException();
        me.setMsg(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            me.setCode("404");
        } else {
            me.setCode("500");
        }
        return "<marquee><h1 style='color:red;'>您的代码出现了Bug！\n错误代码：“" + me.getCode() + "”,\n错误描述：“" + me.getMsg() + "”</h1></marquee>";
    }
}
