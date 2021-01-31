package com.yidi.basemodule.base.entity;

import lombok.Data;

import java.util.Date;

@Data
public class YidiEntity {
    private String id;
    private Boolean delFlag;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
}
