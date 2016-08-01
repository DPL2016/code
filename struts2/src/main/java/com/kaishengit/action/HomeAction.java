package com.kaishengit.action;


import javax.servlet.http.HttpSession;

public class HomeAction extends BaseAction {
    public String execute(){
        HttpSession session = getHttpSession();
        session.setAttribute("Hello","World");
        System.out.println("Hello,Struts2");
        return "success";
    }
}
