package com.crm.controller;

import com.crm.biz.customer.service.ICstRecordService;
import com.crm.common.BaseController;
import com.crm.entity.CstRecord;
import com.crm.utils.TypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/12.
 */
@RestController
public class CstRecordController extends BaseController{
    @Autowired
    private ICstRecordService cstRecordService;

    @RequestMapping("/addRecord")
    public Map addCstRecord(CstRecord cstRecord){
        Map map= TypeUtil.successMap();
        cstRecordService.addCstRecord(cstRecord);
        return map;
    }
}
