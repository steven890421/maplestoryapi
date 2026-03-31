package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RankResponse {

    @JsonProperty("ListData")
    private Object listData;

    @JsonProperty("Data")
    private RankResponseData data;

    @JsonProperty("Code")
    private int code;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Url")
    private String url;

    // getter / setter
    public Object getListData() {
        return listData;
    }

    public void setListData(Object listData) {
        this.listData = listData;
    }

    public RankResponseData getData() {
        return data;
    }

    public void setData(RankResponseData data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}