/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-08-14 03:34:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/customer/../include/header.jsp", Long.valueOf(1469077548000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>CRM客户列表</title>\r\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <!-- Bootstrap 3.3.6 -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Ionicons -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/ionicons-2.0.1/css/ionicons.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Theme style -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/dist/css/AdminLTE.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/datatables/css/dataTables.bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/dist/css/skins/skin-blue.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/datatables/css/dataTables.bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/easyautocomplete/easy-autocomplete.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition skin-blue  sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Main Header -->\r\n");
      out.write("<header class=\"main-header\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Logo -->\r\n");
      out.write("    <a href=\"/home\" class=\"logo\">\r\n");
      out.write("        <!-- mini logo for sidebar mini 50x50 pixels -->\r\n");
      out.write("        <span class=\"logo-mini\">CRM</span>\r\n");
      out.write("        <!-- logo for regular state and mobile devices -->\r\n");
      out.write("        <span class=\"logo-lg\"><b>DwT</b>CRM</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Header Navbar -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\" role=\"navigation\">\r\n");
      out.write("        <!-- Sidebar toggle button-->\r\n");
      out.write("        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\r\n");
      out.write("            <span class=\"fa fa-reorder\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <!-- Navbar Right Menu -->\r\n");
      out.write("        <div class=\"navbar-custom-menu\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <!-- Messages: style can be found in dropdown.less-->\r\n");
      out.write("                <li class=\"dropdown messages-menu\">\r\n");
      out.write("                    <!-- Menu toggle button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("                        <span class=\"label label-success\">4</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"header\">You have 4 messages</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <!-- inner menu: contains the messages -->\r\n");
      out.write("                            <ul class=\"menu\">\r\n");
      out.write("                                <li><!-- start message -->\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <div class=\"pull-left\">\r\n");
      out.write("                                            <!-- User Image -->\r\n");
      out.write("                                            <img src=\"/static/dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!-- Message title and timestamp -->\r\n");
      out.write("                                        <h4>\r\n");
      out.write("                                            Support Team\r\n");
      out.write("                                            <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                                        </h4>\r\n");
      out.write("                                        <!-- The message -->\r\n");
      out.write("                                        <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- end message -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <!-- /.menu -->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.messages-menu -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Notifications Menu -->\r\n");
      out.write("                <li class=\"dropdown notifications-menu\">\r\n");
      out.write("                    <!-- Menu toggle button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-bell-o\"></i>\r\n");
      out.write("                        <span class=\"label label-warning\">10</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"header\">You have 10 notifications</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <!-- Inner Menu: contains the notifications -->\r\n");
      out.write("                            <ul class=\"menu\">\r\n");
      out.write("                                <li><!-- start notification -->\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- end notification -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\"><a href=\"#\">View all</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- Tasks Menu -->\r\n");
      out.write("                <li class=\"dropdown tasks-menu\">\r\n");
      out.write("                    <!-- Menu Toggle Button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <i class=\"fa fa-flag-o\"></i>\r\n");
      out.write("                        <span class=\"label label-danger\">9</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"header\">You have 9 tasks</li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <!-- Inner menu: contains the tasks -->\r\n");
      out.write("                            <ul class=\"menu\">\r\n");
      out.write("                                <li><!-- Task item -->\r\n");
      out.write("                                    <a href=\"#\">\r\n");
      out.write("                                        <!-- Task title and progress text -->\r\n");
      out.write("                                        <h3>\r\n");
      out.write("                                            Design some buttons\r\n");
      out.write("                                            <small class=\"pull-right\">20%</small>\r\n");
      out.write("                                        </h3>\r\n");
      out.write("                                        <!-- The progress bar -->\r\n");
      out.write("                                        <div class=\"progress xs\">\r\n");
      out.write("                                            <!-- Change the css width attribute to simulate progress -->\r\n");
      out.write("                                            <div class=\"progress-bar progress-bar-aqua\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\r\n");
      out.write("                                                <span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <!-- end task item -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"footer\">\r\n");
      out.write("                            <a href=\"#\">View all tasks</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- User Account Menu -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <!-- Menu Toggle Button -->\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <span class=\"hidden-xs\">");
      if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_page_context))
        return;
      out.write("</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"/user/password\">修改密码</a></li>\r\n");
      out.write("                        <li><a href=\"/user/log\">登录日志</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"/logout\">安全退出</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/leftside.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("customer", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("    <div class=\"content-wrapper\" style=\"background-image: url(/static/dist/img/asanoha-400px.png)\">\r\n");
      out.write("        <!-- Content Header (Page header) -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"box box-primary\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <ol class=\"breadcrumb\" style=\"background-color: transparent\">\r\n");
      out.write("                        <li><a href=\"/home\"><i class=\"fa fa-dashboard\"></i>主页</a></li>\r\n");
      out.write("                        <li class=\"active\">客户列表</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-header with-border\">\r\n");
      out.write("                    <h3 class=\"box-title\">客户列表</h3>\r\n");
      out.write("                    <div class=\"box-tools\">\r\n");
      out.write("                        <button class=\"btn btn-xs btn-success\" id=\"newBtn\"><i class=\"fa fa-plus\"></i> 新增客户</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    <table class=\"table\" id=\"customerTable\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th style=\"width:20px;\"></th>\r\n");
      out.write("                            <th>客户名称</th>\r\n");
      out.write("                            <th>联系电话</th>\r\n");
      out.write("                            <th>电子邮件</th>\r\n");
      out.write("                            <th>等级</th>\r\n");
      out.write("                            <th>*</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-wrapper -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"newModal\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\r\n");
      out.write("                            aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                    <h4 class=\"modal-title\">新增用户</h4>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <form id=\"newForm\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>类型</label>\r\n");
      out.write("                            <div>\r\n");
      out.write("                                <label class=\"radio-inline\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"type\" value=\"person\" checked id=\"radioPerson\">个人\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"radio-inline\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"type\" value=\"company\" id=\"radioCompany\">公司\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>客户名称</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>联系电话</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"tel\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>客户等级</label>\r\n");
      out.write("                            <select name=\"level\" class=\"form-control\">\r\n");
      out.write("                                <option value=\"\"></option>\r\n");
      out.write("                                <option value=\"★\">★</option>\r\n");
      out.write("                                <option value=\"★★\">★★</option>\r\n");
      out.write("                                <option value=\"★★★\">★★★</option>\r\n");
      out.write("                                <option value=\"★★★★\">★★★★</option>\r\n");
      out.write("                                <option value=\"★★★★★\">★★★★★</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>微信号</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"weixin\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>电子邮件</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"email\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>地址</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"address\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\" id=\"companyList\">\r\n");
      out.write("                            <lable>所属公司</lable>\r\n");
      out.write("                            <select name=\"companyid\" class=\"form-control\">\r\n");
      out.write("                                <option value=\"\"></option>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" id=\"saveBtn\">保存</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 2.2.3 -->\r\n");
      out.write("<script src=\"/static/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<script src=\"/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/static/dist/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/datatables/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/validate/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/easyautocomplete/jquery.easy-autocomplete.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var dataTable = $(\"#customerTable\").DataTable({\r\n");
      out.write("            serverSide: true,\r\n");
      out.write("            ajax: \"/customer/load\",\r\n");
      out.write("            ordering: false,\r\n");
      out.write("            \"autoWidth\": false,\r\n");
      out.write("            \"searching\": false,\r\n");
      out.write("            columns: [\r\n");
      out.write("                {\r\n");
      out.write("                    \"data\": function (row) {\r\n");
      out.write("                        if (row.type == 'company') {\r\n");
      out.write("                            return \"<i class='fa fa-bank'></i>\";\r\n");
      out.write("                        }\r\n");
      out.write("                        return \"<i class='fa fa-user'></i>\";\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                {\r\n");
      out.write("                    \"data\": function (row) {\r\n");
      out.write("                        if (row.companyname) {\r\n");
      out.write("                            return row.name + \" - \" + row.companyname;\r\n");
      out.write("                        }\r\n");
      out.write("                        return row.name;\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                {\"data\": \"tel\"},\r\n");
      out.write("                {\"data\": \"email\"},\r\n");
      out.write("                {\"data\": \"level\"},\r\n");
      out.write("                {\r\n");
      out.write("                    \"data\": function (row) {\r\n");
      out.write("                        return \"\"\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            ],\r\n");
      out.write("            \"language\": { //定义中文\r\n");
      out.write("                \"search\": \"请输入员工姓名或登录账号:\",\r\n");
      out.write("                \"zeroRecords\": \"没有匹配的数据\",\r\n");
      out.write("                \"lengthMenu\": \"显示 _MENU_ 条数据\",\r\n");
      out.write("                \"info\": \"显示从 _START_ 到 _END_ 条数据 共 _TOTAL_ 条数据\",\r\n");
      out.write("                \"infoFiltered\": \"(从 _MAX_ 条数据中过滤得来)\",\r\n");
      out.write("                \"loadingRecords\": \"加载中...\",\r\n");
      out.write("                \"processing\": \"处理中...\",\r\n");
      out.write("                \"paginate\": {\r\n");
      out.write("                    \"first\": \"首页\",\r\n");
      out.write("                    \"last\": \"末页\",\r\n");
      out.write("                    \"next\": \"下一页\",\r\n");
      out.write("                    \"previous\": \"上一页\"\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("//        新增用户\r\n");
      out.write("        $(\"#newForm\").validate({\r\n");
      out.write("            errorClass: \"text-danger\",\r\n");
      out.write("            errorElement: \"span\",\r\n");
      out.write("            rules: {\r\n");
      out.write("                name: {\r\n");
      out.write("                    required: true\r\n");
      out.write("                },\r\n");
      out.write("                tel: {\r\n");
      out.write("                    required: true\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("                name: {\r\n");
      out.write("                    required: \"请输入客户名称\"\r\n");
      out.write("                },\r\n");
      out.write("                tel: {\r\n");
      out.write("                    required: \"请输入联系电话\"\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            submitHandler: function (form) {\r\n");
      out.write("                $.post(\"/customer/new\", $(form).serialize()).done(function (data) {\r\n");
      out.write("                    if (\"success\" == data) {\r\n");
      out.write("                        $(\"#newModal\").modal('hide');\r\n");
      out.write("                        dataTable.ajax.reload();\r\n");
      out.write("                    }\r\n");
      out.write("                }).fail(function () {\r\n");
      out.write("                    alert(\"服务器异常\");\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#newBtn\").click(function(){\r\n");
      out.write("            $(\"#newForm\")[0].reset();\r\n");
      out.write("            $(\"#newModal\").modal({\r\n");
      out.write("                show:true,\r\n");
      out.write("                dropback:'static',\r\n");
      out.write("                keyboard:false\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#radioCompany\").click(function(){\r\n");
      out.write("            if ($(this)[0].checked){\r\n");
      out.write("                $(\"#companyList\").hide();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#radioPerson\").click(function(){\r\n");
      out.write("            if ($(this)[0].checked){\r\n");
      out.write("                $(\"#companyList\").show();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#saveBtn\").click(function(){\r\n");
      out.write("            $(\"#newForm\").submit();\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent(null);
    // /WEB-INF/views/customer/../include/header.jsp(122,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fprincipal_005f0.setProperty("realname");
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/customer/list.jsp(131,32) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/customer/list.jsp(131,32) '${companyList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${companyList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/customer/list.jsp(131,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("company");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${company.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${company.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
