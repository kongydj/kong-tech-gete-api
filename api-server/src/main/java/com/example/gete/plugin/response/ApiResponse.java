package com.example.gete.plugin.response;

import com.example.gete.plugin.view.SerializeView;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;

@JsonView(SerializeView.Simple.class)
public class ApiResponse<T> {
    private String error;

    private T data;

    public ApiResponse(T data) {
        this.data = data;
    }

    public ApiResponse(T data, String error) {
        this.data = data;
        this.error = error;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getError() {
        return error;
    }

    public T getData() {
        return data;
    }
}
