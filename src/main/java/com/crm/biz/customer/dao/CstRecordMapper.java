package com.crm.biz.customer.dao;

import com.crm.entity.CstRecord;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
@Component
public interface CstRecordMapper{
    // TODO: 2017/9/14 添加记录信息
    void saveCstRecord(CstRecord cstRecord);
}
