package com.imooc.demo.Enums;

import lombok.Getter;

@Getter
public enum  PayStatusEnum implements CodeEnum{

    WAIT(0, "queuing or operating"),
    SUCCESS(1, "payment done"),
    ;

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code ,String msg){
        this.code = code;
        this.msg = msg;
    }

}
