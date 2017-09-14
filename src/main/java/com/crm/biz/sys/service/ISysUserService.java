package com.crm.biz.sys.service;

import com.crm.entity.SysUser;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/12.
 */
public interface ISysUserService {
    public SysUser login(String userName, String password);
}
