package com.example.dto;

import java.time.LocalDateTime;

import com.example.exception.ErrorCode;

public class ApiResponse<T> {

    private boolean success;
    private T data;
    private String message;
    private int status;
    private String errorCode;
    private LocalDateTime timestamp;

    public ApiResponse() {
    }

    public ApiResponse(boolean success, T data, String message, int status, LocalDateTime timestamp) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }

    public ApiResponse(boolean success, T data, String message, int status, String errorCode, LocalDateTime timestamp) {
        this.success = success;
        this.data = data;
        this.message = message;
        this.status = status;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }

    public static <T> ApiResponse<T> error(ErrorCode errorCode) {
        ApiResponse<T> res = new ApiResponse<>();
        res.success = false;
        res.message = errorCode.getMessage();
        res.status = errorCode.getStatus().value();
        res.errorCode = errorCode.name();
        res.timestamp = LocalDateTime.now();
        return res;
    }

    
    public static <T> ApiResponse<T> success(T data, String message) {
        ApiResponse<T> res = new ApiResponse<>();
        res.success = true;
        res.data = data;
        res.message = message;
        res.status = 200;
        res.timestamp = LocalDateTime.now();
        return res;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
