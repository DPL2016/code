package com.kaishengit.controller;

import com.google.common.collect.Maps;
import com.kaishengit.dto.DataTablesResult;
import com.kaishengit.dto.JSONResult;
import com.kaishengit.pojo.Role;
import com.kaishengit.pojo.User;
import com.kaishengit.service.UserService;
import com.kaishengit.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Inject
    private UserService userService;

    /**
     * 显示用户列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String userList(Model model){
        List<Role> roleList = userService.findAllRole();
        model.addAttribute("roleList",roleList);
        return "admin/userlist";
    }

    /**
     * Ajax加载用户列表
     * @param request
     * @return
     */
    @RequestMapping(value = "/users/load",method = RequestMethod.GET)
    @ResponseBody
    public DataTablesResult<User> loadUsers(HttpServletRequest request){
        String draw = request.getParameter("draw");
        String start = request.getParameter("start");
        String length = request.getParameter("length");
        String keyword = request.getParameter("search[value]");
        keyword = Strings.toUTF8(keyword);
        Map<String,Object> params = Maps.newHashMap();
        params.put("keyword",keyword);
        params.put("start",start);
        params.put("length",length);
        List<User> userList = userService.findUserListByParams(params);
        Long count = userService.findUserCount();
        Long filterCount = userService.findUserCountByParams(params);
        return new DataTablesResult<>(draw,userList,count,filterCount);
    }

    /**
     * 验证用户名是否可用（Ajax调用）
     * @param username
     * @return
     */
    @RequestMapping(value = "/user/checkusername",method = RequestMethod.GET)
    @ResponseBody
    public String checkUserName(String username){
        User user = userService.findByUserName(username);
        if (user == null){
            return "true";
        }else {
            return "false";
        }
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/users/new",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(User user){
        userService.saveUser(user);
        return "success";
    }

    /**
     * 重置用户密码为000000
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/resetpassword",method = RequestMethod.POST)
    @ResponseBody
    public String resetPassword(Integer id){
        userService.resetUserPassword(id);
        return "success";
    }

    /**
     * 根据用户的ID显示用户JSON
     * @param id
     * @return
     */
    @RequestMapping(value = "/users/{id:\\d+}.json",method = RequestMethod.GET)
    @ResponseBody
    public JSONResult showUser(@PathVariable Integer id){
        User user = userService.findUserById(id);
        if (user==null){
            return new JSONResult("找不到"+id+"对应的用户");
        }else {
            return new JSONResult(user);
        }
    }

    /**
     * 编辑用户
     */
    @RequestMapping(value = "/users/edit",method = RequestMethod.POST)
    @ResponseBody
    public String editUser(User user){
        userService.editUser(user);
        return "success";
    }
}
