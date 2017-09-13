package com.crm.common;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/12.
 */
public class BaseEntity  {
    private Long id;
    private Date ctime=new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
