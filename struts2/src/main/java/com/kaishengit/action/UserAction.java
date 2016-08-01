package com.kaishengit.action;


import com.kaishengit.pojo.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;

public class UserAction extends BaseAction{
    public String toSave(){
        return SUCCESS;
    }

    public String save(){
       return SUCCESS;
    }

    public String list(){
        return SUCCESS;
    }

}
