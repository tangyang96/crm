package com.crm.biz.user.dao;

import com.crm.entity.UserTask;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/14.
 */
@Component
public interface UserTaskMapper {
    void saveUserTask(UserTask userTask);
}
