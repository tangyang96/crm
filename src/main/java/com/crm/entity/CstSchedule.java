package com.crm.entity;

import com.crm.common.BaseEntity;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/13.
 * 进度表
 */
public class CstSchedule extends BaseEntity {
    private Integer scheType;
    private Date scheTime;
    private String scheContent;
    private Long custId;

    public Integer getScheType() {
        return scheType;
    }

    public void setScheType(Integer scheType) {
        this.scheType = scheType;
    }

    public Date getScheTime() {
        return scheTime;
    }

    public void setScheTime(Date scheTime) {
        this.scheTime = scheTime;
    }

    public String getScheContent() {
        return scheContent;
    }

    public void setScheContent(String scheContent) {
        this.scheContent = scheContent;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }
}
