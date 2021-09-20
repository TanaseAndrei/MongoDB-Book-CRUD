package com.mongodb.crud.controller.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppException extends RuntimeException{

    private final String message;
    private final int httpCode;
    private final String timeStamp;

    public AppException(int httpCode, String message) {
        super(message);
        this.httpCode = httpCode;
        this.message = message;
        this.timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
