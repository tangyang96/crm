package com.crm.entity;

import com.crm.common.BaseEntity;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/12.
 * 记会表
 */
public class CstChance extends BaseEntity {
    private String chContent;
    private String chStage;
    private String custId;
    private Date chDate;
    private double chMoney;
    private String userName;
    private Long userId;

    public String getChContent() {
        return chContent;
    }

    public void setChContent(String chContent) {
        this.chContent = chContent;
    }

    public String getChStage() {
        return chStage;
    }

    public void setChStage(String chStage) {
        this.chStage = chStage;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getChDate() {
        return chDate;
    }

    public void setChDate(Date chDate) {
        this.chDate = chDate;
    }

    public double getChMoney() {
        return chMoney;
    }

    public void setChMoney(double chMoney) {
        this.chMoney = chMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
