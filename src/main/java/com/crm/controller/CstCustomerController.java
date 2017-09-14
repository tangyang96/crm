package com.crm.controller;

import com.crm.biz.customer.dao.CstCustomerMapper;
import com.crm.biz.customer.service.ICstCustomerService;
import com.crm.common.BaseController;
import com.crm.entity.CstCustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/12.
 */
@RestController
public class CstCustomerController extends BaseController{
    private static final Logger logger = LoggerFactory.getLogger(CstCustomerController.class);
    @Autowired
    private ICstCustomerService cstCustomerService;
    @Autowired
    private CstCustomerMapper cstCustomerMapper;

    @RequestMapping("/get")
    public CstCustomer getCstCustomer(){
        CstCustomer cstCustomer=null;
        cstCustomer=cstCustomerService.getCstCustomer();
        return cstCustomer;
    }

    @RequestMapping("/getId/{1}")
    public CstCustomer getCstCustomerBy(@PathVariable("id") Long id){
        CstCustomer cstCustomer=null;
        cstCustomer=cstCustomerMapper.findById(id);
        return cstCustomer;
    }
}
