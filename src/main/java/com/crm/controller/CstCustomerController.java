package com.crm.controller;

import com.crm.biz.customer.dao.CstCustomerMapper;
import com.crm.biz.customer.entity.CstCustomer;
import com.crm.biz.customer.service.ICstCustomerService;
import com.crm.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/12.
 */
@RestController
public class CstCustomerController extends BaseController{
    @Autowired
    private ICstCustomerService cstCustomerService;

    @RequestMapping("/get")
    public CstCustomer getCstCustomer(){
        CstCustomer cstCustomer=null;
        cstCustomer=cstCustomerService.getCstCustomer();
        return cstCustomer;
    }
}
