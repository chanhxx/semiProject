/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-23 06:07:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainPopup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	font-family: SF Pro KR, SF Pro Display, SF Pro Icons, AOS Icons, Apple Gothic, HY Gulim, MalgunGothic, HY Dotum, Lexi Gulim, Helvetica Neue, Helvetica, Arial, sans-serif;\r\n");
      out.write("	.layerPopup img {\r\n");
      out.write("		margin-bottom : 20px;\r\n");
      out.write("	}\r\n");
      out.write("		\r\n");
      out.write("	.layerPopup:before {\r\n");
      out.write("		display:block;\r\n");
      out.write("		content:\"\";\r\n");
      out.write("		position:fixed;\r\n");
      out.write("		left:0;\r\n");
      out.write("		top:0;\r\n");
      out.write("		width:100%;\r\n");
      out.write("		height:100%;\r\n");
      out.write("		background:rgba(0,0,0,.5);\r\n");
      out.write("		z-index:9000\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.layerPopup .layerBox {\r\n");
      out.write("		z-index:10000;   \r\n");
      out.write("		position:fixed;\r\n");
      out.write("		left:85%;\r\n");
      out.write("		top:48%;\r\n");
      out.write("		transform:translate(-50%, -50%);\r\n");
      out.write("		padding:30px;\r\n");
      out.write("		background:#fff;\r\n");
      out.write("		border-radius:6px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.layerPopup .layerBox .title {\r\n");
      out.write("		margin-bottom:10px;\r\n");
      out.write("		padding-bottom:10px;\r\n");
      out.write("		font-weight:600;\r\n");
      out.write("		border-bottom:1px solid #d9d9d9;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.layerPopup .layerBox .btnTodayHide {\r\n");
      out.write("		font-size:14px;\r\n");
      out.write("		font-weight:600;\r\n");
      out.write("		color:black; \r\n");
      out.write("		float: left;\r\n");
      out.write("		text-decoration:none;\r\n");
      out.write("		width: 150px; \r\n");
      out.write("		height : 30px;\r\n");
      out.write("		line-height:30px;\r\n");
      out.write("		border:black solid 1px;\r\n");
      out.write("		text-align : center;\r\n");
      out.write("		text-decoration:none;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.layerPopup div {\r\n");
      out.write("		display : inline;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.layerPopup form {\r\n");
      out.write("		margin-top : 5px;\r\n");
      out.write("		font-size:16px;\r\n");
      out.write("		font-weight:600;\r\n");
      out.write("		weight: 100%;\r\n");
      out.write("		height : 30px;\r\n");
      out.write("		line-height:30px\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	.layerPopup #close {\r\n");
      out.write("		font-size:16px;\r\n");
      out.write("		font-weight:600;\r\n");
      out.write("		width:40px;\r\n");
      out.write("		height:30px;\r\n");
      out.write("		color:black;\r\n");
      out.write("		float:right;\r\n");
      out.write("		line-height:30px;\r\n");
      out.write("		text-align : center;\r\n");
      out.write("		text-decoration:underline;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.layerPopup a {\r\n");
      out.write("		text-decoration : none;\r\n");
      out.write("		color : black;width: 50px;height : 40px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	var cookiedata = document.cookie;\r\n");
      out.write("\r\n");
      out.write("	function setCookie(name, value, expiredays) {\r\n");
      out.write("		var today = new Date();\r\n");
      out.write("		\r\n");
      out.write("		today.setDate(today.getDate() + expiredays);\r\n");
      out.write("		cookiedata = name + \"=\" + escape( value ) + \"; path=/; expires=\" + todayDate.toGMTString() + \";\"\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	function closePop() {\r\n");
      out.write("        if (document.pop_form.chkbox.checked) {\r\n");
      out.write("            setCookie( \"maindiv\", \"done\" , 1 );\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        document.all['layer_popup'].style.visibility = \"hidden\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- layer popup content -->\r\n");
      out.write("	<div class=\"layerPopup\" id=\"layer_popup\" style=\"visibility: visible;\">\r\n");
      out.write("	    <div class=\"layerBox\">\r\n");
      out.write("	        <h4 class=\"title\">????????????</h4>\r\n");
      out.write("	        <div class=\"cont\">\r\n");
      out.write("            	<p>\r\n");
      out.write("					<img src=\"../../resources/image/popup.jpg\" width=350 height=500 usemap=\"#popup\" alt=\"event page\">\r\n");
      out.write("	            </p>\r\n");
      out.write("	        </div>\r\n");
      out.write("          	<form name=\"pop_form\">\r\n");
      out.write("	        	<div id=\"check\" ><input type=\"checkbox\" name=\"chkbox\" value=\"checkbox\" id='chkbox' >\r\n");
      out.write("	        	<label for=\"chkbox\">?????? ???????????? ?????? ??????</label>\r\n");
      out.write("        		</div>\r\n");
      out.write("				<div id=\"close\" ><a href=\"javascript:closePop();\">??????</a></div>    \r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("		cookiedata = document.cookie;   \r\n");
      out.write("	    \r\n");
      out.write("		if (cookiedata.indexOf(\"maindiv=done\") < 0) {     \r\n");
      out.write("			document.all['layer_popup'].style.visibility = \"visible\";\r\n");
      out.write("	    \r\n");
      out.write("		} else {\r\n");
      out.write("			document.all['layer_popup'].style.visibility = \"hidden\";\r\n");
      out.write("	    }\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
