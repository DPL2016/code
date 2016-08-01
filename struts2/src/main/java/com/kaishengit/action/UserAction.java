package com.kaishengit.action;

import com.kaishengit.pojo.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserAction extends ActionSupport implements SessionAware,ServletRequestAware,ServletResponseAware,ServletContextAware,ApplicationAware{
    private static final long serialVersionUID = -6199191679703321729L;
    private User user;
    private List<String> names;

    private Map<String,Object> session;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext servletContext;
    private Map<String,Object> application;

    public String toSave(){
        System.out.println("UserAction save ...");
        return SUCCESS;
    }

    public String save(){
        System.out.println("username:"+user.getUsername()+ " address:"+user.getAddress() );
        return SUCCESS;
    }

    public String list(){
        System.out.println("UserAction list ...");
        names = new ArrayList<>();
        names.add("aaa");
        names.add("bbb");
        names.add("ccc");
        return SUCCESS;
    }

    //getter setter

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public void setApplication(Map<String, Object> application) {
        this.application = application;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
