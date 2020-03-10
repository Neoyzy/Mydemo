package com.imooc.demo.Exception;

import com.imooc.demo.Enums.ExceptionResultEnum;
import org.junit.runner.RunWith;


public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ExceptionResultEnum resultEnum){
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();

    }

    public SellException(Integer code, String msg){
        super(msg);
        this.code = code;
    }

}
