package com.kaishengit.controller;

import com.kaishengit.dto.DataTablesResult;
import com.kaishengit.pojo.UserLog;
import com.kaishengit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Inject
    private UserService userService;

    /**
     * 显示登陆日志
     */
    @RequestMapping(value = "/log",method = RequestMethod.GET)
    public String showUserLog(){
        return "setting/loglist";
    }
    /**
     * 使用DataTables显示数据
     */
    @RequestMapping(value = "/log/load",method = RequestMethod.GET)
    @ResponseBody
    public DataTablesResult userLogLoad(HttpServletRequest request){
        String draw = request.getParameter("draw");
        String start = request.getParameter("start");
        String length = request.getParameter("length");
        List<UserLog> userLogList = userService.findCurrentUserLog(start,length);
        Long count  = userService.findCurrentUserLogCount();
        return new DataTablesResult<>(draw,userLogList,count,count);
    }
}
