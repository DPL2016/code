package com.kaishengit.service;

import com.kaishengit.mapper.RoleMapper;
import com.kaishengit.mapper.UserLogMapper;
import com.kaishengit.pojo.UserLog;
import com.kaishengit.util.ShiroUtil;
import org.joda.time.DateTime;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService {
    @Inject
    private UserLogMapper userLogMapper;

    /**
     * 创建用户登录日志
     */
    public void savaUserLog(String ip){
        UserLog  userLog = new UserLog();
        userLog.setLoginip(ip);
        userLog.setLogintime(DateTime.now().toString("yyyy-MM-dd HH:mm"));
        userLog.setUserid(ShiroUtil.getCurrentUserId());
        userLogMapper.save(userLog);
    }
}
