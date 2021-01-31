package com.yidi.basemodule.base.vo;

import com.yidi.basemodule.base.enums.ResultEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private Integer code= ResultEnum.SUCCESS.getValue();
    private String msg;
    private T resule;
    private long timestap=System.currentTimeMillis();
    public Result(){}
}
