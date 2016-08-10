package com.kaishengit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    /**
     * 登录页
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
