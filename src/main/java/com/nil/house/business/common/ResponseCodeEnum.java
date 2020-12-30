package com.nil.house.business.common;

import lombok.Getter;

/**
 * @author NIL
 * @date 2020/12/29 15:29
 */
@Getter
public enum ResponseCodeEnum {

    /**
     * 返回码枚举
     */
    SUCCESS(200,"success"),
    FAIL(500,"fail")
    ;

    private Integer code;
    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
