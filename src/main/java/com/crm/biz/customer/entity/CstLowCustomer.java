package com.crm.biz.customer.entity;

/**
 * Created by Administrator on 2017/9/12.
 * 下级客户表
 */
public class CstLowCustomer {
    private String highCustId;
    private String custCompany;
    private String custId;

    public String getHighCustId() {
        return highCustId;
    }

    public void setHighCustId(String highCustId) {
        this.highCustId = highCustId;
    }

    public String getCustCompany() {
        return custCompany;
    }

    public void setCustCompany(String custCompany) {
        this.custCompany = custCompany;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }
}
