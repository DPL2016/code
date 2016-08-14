package com.kaishengit.service;

import com.google.common.collect.Maps;
import com.kaishengit.mapper.RoleMapper;
import com.kaishengit.mapper.UserLogMapper;
import com.kaishengit.mapper.UserMapper;
import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import com.kaishengit.pojo.UserLog;
import com.kaishengit.util.ShiroUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.joda.time.DateTime;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
public class UserService {
    @Inject
    private UserLogMapper userLogMapper;

    @Inject
    private UserMapper userMapper;

    @Inject
    private RoleMapper roleMapper;

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

    /**
     * 获取当前用户的日志和数量
     * @param start
     * @param length
     * @return
     */
    public List<UserLog> findCurrentUserLog(String start, String length) {
        Map<String,Object>param = Maps.newHashMap();
        param.put("userId",ShiroUtil.getCurrentUserId());
        param.put("start",start);
        param.put("length",length);
        return userLogMapper.findByParam(param);
    }

    /**
     * 获取当前登录用户的日志数量
     * @return
     */
    public Long findCurrentUserLogCount() {
        Map<String,Object>param = Maps.newHashMap();
        param.put("userId",ShiroUtil.getCurrentUserId());
        return userLogMapper.countByParam(param);
    }

    /**
     * 修改用户密码
     * @param password
     */
    public void changePassword(String password) {
        User user = ShiroUtil.getCurrentUser();
        user.setPassword(DigestUtils.md5Hex(password));
        userMapper.updateUser(user);
    }

    /**
     * 根据查询参数获取用户列表
     * @param params
     * @return
     */
    public List<User> findUserListByParams(Map<String, Object> params) {
        return userMapper.findByParams(params);
    }

    /**
     * 根据查询参数获取用户数量
     * @param params
     * @return
     */
    public Long findUserCountByParams(Map<String, Object> params) {
        return userMapper.countByParams();
    }

    /**
     * 获取用户总数
     * @return
     */
    public Long findUserCount() {
        return userMapper.count();
    }

    /**
     * 获取所有角色
     * @return
     */
    public List<Role> findAllRole() {
        return roleMapper.findAll();
    }

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUserName(String username) {
        return userMapper.findByUsername(username);
    }

    /**
     * 新增用户
     * @param user
     */
    public void saveUser(User user) {
        user.setEnable(true);
        user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        userMapper.save(user);
    }

    /**
     * 重置密码
     * @param id
     */
    public void resetUserPassword(Integer id) {
        User user = userMapper.findById(id);
        if (user != null){
            user.setPassword(DigestUtils.md5Hex("000000"));
            userMapper.updateUser(user);
        }
    }

    public User findUserById(Integer id) {
        return userMapper.findById(id);
    }

    public void editUser(User user) {
        userMapper.updateUser(user);
    }

    public List<User> findAllUser() {
        return userMapper.findAll();
    }
}
