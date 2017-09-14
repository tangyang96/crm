package com.crm.biz.customer.service;


import com.crm.entity.CstCustomer;

import java.util.Set;

/**
 * Created by Administrator on 2017/9/12.
 */
public interface ICstCustomerService {
    /**
     * 获取客户信息
     * @return
     */
    public CstCustomer getCstCustomer();

    /**
     * 添加客户信息
     * @param cstCustomer
     */
    public void addCstCustomerInfo(CstCustomer cstCustomer);

    /**
     * 筛选客户
     * @return
     */
    public Set<CstCustomer> screenCstCustomers(CstCustomer cstCustomer);
}
