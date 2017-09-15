package com.crm.biz.sys.service.impl;

import com.crm.biz.sys.dao.SysUserMapper;
import com.crm.biz.sys.service.ISysUserService;
import com.crm.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/12.
 */
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser login(String userName, String password) {
      SysUser sysUser=  sysUserMapper.findByUserNameAndPassWord(userName,password);
        return sysUser;
    }

    @Override
    public void updateUserInfo(SysUser sysUser) {
        sysUserMapper.updateSysUser(sysUser);
    }
}
