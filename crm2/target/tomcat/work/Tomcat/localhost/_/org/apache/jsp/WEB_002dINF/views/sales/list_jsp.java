/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-08-15 13:55:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.sales;

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
    _jspx_dependants.put("/WEB-INF/views/sales/../include/header.jsp", Long.valueOf(1469077548000L));
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>CRM机会列表</title>\r\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"/static/plugins/rangepicker/daterangepicker.css\">\r\n");
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/leftside.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("menu", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("sales", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("    <div class=\"content-wrapper\" style=\"background-image: url(/static/dist/img/asanoha-400px.png)\">\r\n");
      out.write("        <!-- Content Header (Page header) -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <div class=\"box box-default collapsed-box\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <ol class=\"breadcrumb\" style=\"background-color: transparent\">\r\n");
      out.write("                        <li><a href=\"/home\"><i class=\"fa fa-dashboard\"></i>主页</a></li>\r\n");
      out.write("                        <li class=\"active\">机会列表</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-header with-border\">\r\n");
      out.write("\r\n");
      out.write("                    <h3 class=\"box-title\">搜索</h3>\r\n");
      out.write("                    <div class=\"box-tools pull-right\">\r\n");
      out.write("                        <button class=\"btn btn-box-tool\" data-widget=\"collapse\" data-toggle=\"tooltip\"><i\r\n");
      out.write("                                class=\"fa fa-plus\"></i></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    <form action=\"\" class=\"form-inline\">\r\n");
      out.write("                        <input type=\"hidden\" id=\"search_start_time\">\r\n");
      out.write("                        <input type=\"hidden\" id=\"search_end_time\">\r\n");
      out.write("                        <input type=\"text\" id=\"search_name\"  class=\"form-control\" placeholder=\"机会名称\">\r\n");
      out.write("                        <select id=\"search_progress\" class=\"form-control\">\r\n");
      out.write("                            <option value=\"\">当前进度</option>\r\n");
      out.write("                            <option value=\"初次接触\">初次接触</option>\r\n");
      out.write("                            <option value=\"确认意向\">确认意向</option>\r\n");
      out.write("                            <option value=\"提供合同\">提供合同</option>\r\n");
      out.write("                            <option value=\"完成交易\">完成交易</option>\r\n");
      out.write("                            <option value=\"交易搁置\">交易搁置</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <input type=\"text\" id=\"rangepicker\" class=\"form-control\" placeholder=\"跟进时间\">\r\n");
      out.write("                        <button type=\"button\" id=\"search_Btn\" class=\"btn btn-default\"><i class=\"fa fa-search\"></i> 搜索</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"box box-primary\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"box-header with-border\">\r\n");
      out.write("\r\n");
      out.write("                    <h3 class=\"box-title\">机会列表</h3>\r\n");
      out.write("                    <div class=\"box-tools pull-right\">\r\n");
      out.write("                        <button class=\"btn btn-success btn-xs\" id=\"newBtn\"><i class=\"fa fa-plus\"></i> 新增机会</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"box-body\">\r\n");
      out.write("                    <table class=\"table\"  id=\"dataTable\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>机会名称</th>\r\n");
      out.write("                            <th>关联客户</th>\r\n");
      out.write("                            <th>价值</th>\r\n");
      out.write("                            <th>当前进度</th>\r\n");
      out.write("                            <th>最后跟进时间</th>\r\n");
      out.write("                            <th>所属员工</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main content -->\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Your Page Content Here -->\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- /.content -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-wrapper -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("<div class=\"modal fade\" id=\"newModal\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span\r\n");
      out.write("                        aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\">新增机会</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"newForm\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>机会名称</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"name\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>价值</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"price\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>关联客户</label>\r\n");
      out.write("                        <select name=\"custid\" class=\"form-control\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label>当前进度</label>\r\n");
      out.write("                        <select name=\"progress\" class=\"form-control\">\r\n");
      out.write("                            <option value=\"初次接触\">初次接触</option>\r\n");
      out.write("                            <option value=\"确认意向\">确认意向</option>\r\n");
      out.write("                            <option value=\"提供合同\">提供合同</option>\r\n");
      out.write("                            <option value=\"完成交易\">完成交易</option>\r\n");
      out.write("                            <option value=\"交易搁置\">交易搁置</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"saveBtn\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- /.modal-content -->\r\n");
      out.write("    </div><!-- /.modal-dialog -->\r\n");
      out.write("</div><!-- /.modal -->\r\n");
      out.write("<!-- jQuery 2.2.3 -->\r\n");
      out.write("<script src=\"/static/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.6 -->\r\n");
      out.write("<script src=\"/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"/static/dist/js/app.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/datatables/js/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/static/plugins/rangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("\r\n");
      out.write("        var dataTable = $(\"#dataTable\").DataTable({\r\n");
      out.write("            searching:false,\r\n");
      out.write("            serverSide:true,\r\n");
      out.write("            ajax:{\r\n");
      out.write("                url:\"/sales/load\",\r\n");
      out.write("                data:function(dataSource){\r\n");
      out.write("                    dataSource.name = $(\"#search_name\").val();\r\n");
      out.write("                    dataSource.progress = $(\"#search_progress\").val();\r\n");
      out.write("                    dataSource.startdate = $(\"#search_start_time\").val();\r\n");
      out.write("                    dataSource.enddate = $(\"#search_end_time\").val();\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            columns:[\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    return \"<a href='/sales/\"+row.id+\"'>\"+row.name+\"</a>\";\r\n");
      out.write("                }},\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    return \"<a href='/customer/\"+row.custid+\"'>\"+row.custname+\"</a>\";\r\n");
      out.write("                }},\r\n");
      out.write("                {\"data\":function(row){\r\n");
      out.write("                    return \"￥\" + row.price;\r\n");
      out.write("                }},\r\n");
      out.write("                {\"data\":function(row) {\r\n");
      out.write("                    if(row.progress == '交易完成') {\r\n");
      out.write("                        return \"<span class='label label-success'>\"+row.progress+\"</span>\";\r\n");
      out.write("                    }\r\n");
      out.write("                    if(row.progress == '交易搁置') {\r\n");
      out.write("                        return \"<span class='label label-danger'>\"+row.progress+\"</span>\";\r\n");
      out.write("                    }\r\n");
      out.write("                    return row.progress;\r\n");
      out.write("                }},\r\n");
      out.write("                {\"data\":\"lasttime\"},\r\n");
      out.write("                {\"data\":\"username\"}\r\n");
      out.write("            ],\r\n");
      out.write("            ordering:false,\r\n");
      out.write("            \"autoWidth\": false,\r\n");
      out.write("            \"language\": { //定义中文\r\n");
      out.write("                \"search\": \"请输入书籍名称:\",\r\n");
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
      out.write("        //搜索\r\n");
      out.write("        $(\"#search_Btn\").click(function(){\r\n");
      out.write("            dataTable.ajax.reload();\r\n");
      out.write("        });\r\n");
      out.write("        //daterangepicker\r\n");
      out.write("        $(\"#rangepicker\").daterangepicker({\r\n");
      out.write("            format: \"YYYY-MM-DD\",\r\n");
      out.write("            separator: \"~\",\r\n");
      out.write("            locale: {\r\n");
      out.write("                \"applyLabel\": \"选择\",\r\n");
      out.write("                \"cancelLabel\": \"取消\",\r\n");
      out.write("                \"fromLabel\": \"从\",\r\n");
      out.write("                \"toLabel\": \"到\",\r\n");
      out.write("                \"customRangeLabel\": \"自定义\",\r\n");
      out.write("                \"weekLabel\": \"周\",\r\n");
      out.write("                \"daysOfWeek\": [\r\n");
      out.write("                    \"一\",\r\n");
      out.write("                    \"二\",\r\n");
      out.write("                    \"三\",\r\n");
      out.write("                    \"四\",\r\n");
      out.write("                    \"五\",\r\n");
      out.write("                    \"六\",\r\n");
      out.write("                    \"日\"\r\n");
      out.write("                ],\r\n");
      out.write("                \"monthNames\": [\r\n");
      out.write("                    \"一月\",\r\n");
      out.write("                    \"二月\",\r\n");
      out.write("                    \"三月\",\r\n");
      out.write("                    \"四月\",\r\n");
      out.write("                    \"五月\",\r\n");
      out.write("                    \"六月\",\r\n");
      out.write("                    \"七月\",\r\n");
      out.write("                    \"八月\",\r\n");
      out.write("                    \"九月\",\r\n");
      out.write("                    \"十月\",\r\n");
      out.write("                    \"十一月\",\r\n");
      out.write("                    \"十二月\"\r\n");
      out.write("                ],\r\n");
      out.write("                \"firstDay\": 1\r\n");
      out.write("            },\r\n");
      out.write("            ranges: {\r\n");
      out.write("                '今天': [moment(), moment()],\r\n");
      out.write("                '昨天': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],\r\n");
      out.write("                '最近7天': [moment().subtract(6, 'days'), moment()],\r\n");
      out.write("                '最近30天': [moment().subtract(29, 'days'), moment()],\r\n");
      out.write("                '本月': [moment().startOf('month'), moment().endOf('month')],\r\n");
      out.write("                '上个月': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("        ;\r\n");
      out.write("        $('#rangepicker').on('apply.daterangepicker', function (ev, picker) {\r\n");
      out.write("            $(\"#search_start_time\").val(picker.startDate.format('YYYY-MM-DD'));\r\n");
      out.write("            $(\"#search_end_time\").val(picker.endDate.format('YYYY-MM-DD'));\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        $(\"#newBtn\").click(function () {\r\n");
      out.write("\r\n");
      out.write("            $(\"#newModal\").modal({\r\n");
      out.write("                show: true, backdrop: 'static'\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
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
    // /WEB-INF/views/sales/../include/header.jsp(122,48) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/views/sales/list.jsp(132,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/sales/list.jsp(132,28) '${customerList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${customerList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/sales/list.jsp(132,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("customer");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                            ");
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
