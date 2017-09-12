package com.crm.common;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/12.
 */
public class BaseEntity  {
    private String id;
    private Date ctime=new Date();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
