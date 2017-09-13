package com.crm.biz.customer.entity;

import com.crm.common.BaseEntity;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/12.
 * 记录表
 */
public class CstRecord extends BaseEntity {
    private String reContent;
    private Long custId;
    private String userName;
    private Date reDate;

    public String getReContent() {
        return reContent;
    }

    public void setReContent(String reContent) {
        this.reContent = reContent;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getReDate() {
        return reDate;
    }

    public void setReDate(Date reDate) {
        this.reDate = reDate;
    }
}
