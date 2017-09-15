package com.crm.biz.sys.dao;

import com.crm.entity.SysUser;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/12.
 */
@Component
public interface SysUserMapper{
    SysUser findByUserNameAndPassWord(String userName,String password);

    void updateSysUser(SysUser sysUser);
}
