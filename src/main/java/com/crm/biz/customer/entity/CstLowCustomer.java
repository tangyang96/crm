package com.crm.biz.customer.entity;

/**
 * Created by Administrator on 2017/9/12.
 * 下级客户表
 */
public class CstLowCustomer {
    private Long highCustId;
    private String custCompany;
    private Long custId;

    public Long getHighCustId() {
        return highCustId;
    }

    public void setHighCustId(Long highCustId) {
        this.highCustId = highCustId;
    }

    public String getCustCompany() {
        return custCompany;
    }

    public void setCustCompany(String custCompany) {
        this.custCompany = custCompany;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }
}
