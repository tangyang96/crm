package com.crm.entity;

import com.crm.common.BaseEntity;

/**
 * Created by Administrator on 2017/9/12.
 * 标签表
 */
public class CstLabel extends BaseEntity{
    private String labelName;
    private Long userId;

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
