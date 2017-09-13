package com.crm.biz.customer.service.impl;

import com.crm.biz.customer.dao.CstCustomerMapper;
import com.crm.biz.customer.service.ICstCustomerService;
import com.crm.biz.customer.service.ICstRecordService;
import com.crm.entity.CstCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/12.
 */
@Service
public class CstCustomerServiceImpl implements ICstCustomerService{
    @Autowired
    private CstCustomerMapper cstCustomerMapper;
    @Override
    public CstCustomer getCstCustomer() {
        CstCustomer cstCustomer=null;
        cstCustomer=cstCustomerMapper.findCstCustomer();
        return cstCustomer;
    }
}
