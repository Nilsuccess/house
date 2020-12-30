package com.nil.house.business.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NIL
 * @date 2020/12/29 15:24
 * @description RestResponse
 */
@Data
public class RestResponse<T> implements Serializable {

    private static final long serialVersionUID = 932667461543779894L;

    private int code;
    private long timestamp;
    private String msg;
    private T data;


    private RestResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.timestamp = System.currentTimeMillis();
    }

    private RestResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }


    public static <T> RestResponse<T> createSuccessResult(T data) {
        return new RestResponse<>(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMsg(), data);
    }

    public static <T> RestResponse<T> createSuccessResult() {
        return new RestResponse<>(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMsg());
    }

    public static <T> RestResponse<T> createDefaultSuccResult() {
        return new RestResponse<>(ResponseCodeEnum.SUCCESS.getCode(), "OK");
    }

    public static <T> RestResponse<T> createFailResult(T data) {
        return new RestResponse<>(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.SUCCESS.getMsg(), data);
    }

    public static <T> RestResponse<T> createFailResult() {
        return new RestResponse<>(ResponseCodeEnum.FAIL.getCode(), ResponseCodeEnum.SUCCESS.getMsg());
    }

    public static <T> RestResponse<T> createDefaultFailResult() {
        return new RestResponse<>(ResponseCodeEnum.FAIL.getCode(), "BAD");
    }

    public static <T> RestResponse<T> createResult(int code, String msg, T data) {
        return new RestResponse<>(code, msg, data);
    }

    public static <T> RestResponse<T> createResult(int code, String msg) {
        return new RestResponse<>(code, msg);
    }

}
