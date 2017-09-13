package com.crm.biz.customer.entity;

import com.crm.common.BaseEntity;

/**
 * Created by Administrator on 2017/9/12.
 * 标签表
 */
public class CstLabel extends BaseEntity{
    private String labelName;
    private String userId;

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
