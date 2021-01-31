package com.yidi.basemodule.base.enums;


public enum ResultEnum {
    SUCCESS("success",200),FAIL("fail",400),ERROR("error",500);
    private String name;
    private Integer value;
    private ResultEnum(String name, Integer value){
        this.name=name;
        this.value=value;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setValue(Integer value){
        this.value=value;
    }
    public Integer getValue(){
        return this.value;
    }
}
