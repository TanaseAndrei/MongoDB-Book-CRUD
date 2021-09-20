package com.mongodb.crud.controller.exception.handler;

import com.mongodb.crud.controller.exception.AppException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {AppException.class})
    public AppException appException(AppException appException) {
        return appException;
    }
}
