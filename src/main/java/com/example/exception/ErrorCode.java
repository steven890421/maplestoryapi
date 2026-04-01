package com.example.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    CHARACTER_NOT_FOUND(HttpStatus.NOT_FOUND, "找不到角色"),
    EXTERNAL_API_ERROR(HttpStatus.BAD_GATEWAY, "外部 API 錯誤"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "系統錯誤");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}