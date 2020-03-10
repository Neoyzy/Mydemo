package com.imooc.demo.Enums;

import lombok.Getter;

@Getter
public enum  OrderStatusEnum implements CodeEnum{
    NEW(0, "fresh"),
    FINISHED(1, "done"),
    CANCEL(2, "cancelled"),

    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
