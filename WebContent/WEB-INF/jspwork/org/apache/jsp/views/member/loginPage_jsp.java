/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-21 01:27:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uni.member.model.vo.Member;

public final class loginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.uni.member.model.vo.Member");
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
      out.write("\r\n");
      out.write(" ");

 	Member loginUser = (Member)session.getAttribute("loginUser");
 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resource/css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("    .login {\r\n");
      out.write("        min-height: 100vh;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .bg-image {\r\n");
      out.write("        background-image: url('https://contents.lotteon.com/itemimage/LO/10/23/17/05/83/_1/02/31/70/58/4/LO1023170583_1023170584_1.jpg');\r\n");
      out.write("        background-size: cover;\r\n");
      out.write("        background-position: center;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .login-heading {\r\n");
      out.write("        font-weight: 300;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .btn-login {\r\n");
      out.write("        font-size: 0.9rem;\r\n");
      out.write("        letter-spacing: 0.05rem;\r\n");
      out.write("        padding: 0.75rem 1rem;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid ps-md-0\">\r\n");
      out.write("        <div class=\"row g-0\">\r\n");
      out.write("          <div class=\"d-none d-sm-flex col-sm-5 col-sm-5 bg-image\"></div>\r\n");
      out.write("          <div class=\"col-md-8 col-lg-6\">\r\n");
      out.write("            <div class=\"login d-flex align-items-center py-5\">\r\n");
      out.write("              <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-md-9 col-lg-8 mx-auto\">\r\n");
      out.write("                    <h3 class=\"login-heading mb-4\">????????????!</h3>\r\n");
      out.write("      \r\n");
      out.write("                    <!-- Sign In Form -->\r\n");
      out.write("                      <form id = \"loginForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/loginMember.do\" method=\"post\" onsubmit=\"return loginValidate();\">\r\n");
      out.write("                      <div class=\"form-floating mb-3\">\r\n");
      out.write("                     \r\n");
      out.write("                        <input type=\"id\" class=\"form-control\" id=\"userId\" placeholder=\"???????????? ???????????????\" name=\"userId\" autofocus>\r\n");
      out.write("                        \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-floating mb-3\">\r\n");
      out.write("                      \r\n");
      out.write("                        <input type=\"password\" class=\"form-control\" id=\"userPwd\" placeholder=\"??????????????? ???????????????\" name=\"userPwd\">\r\n");
      out.write("                        \r\n");
      out.write("                      </div>\r\n");
      out.write("      \r\n");
      out.write("                      <div class=\"form-check mb-3\">\r\n");
      out.write("                      \r\n");
      out.write("                      </div>\r\n");
      out.write("      \r\n");
      out.write("                      <div class=\"d-grid\">\r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary btn-login text-uppercase fw-bold mb-2\" type=\"submit\" width=\"40%\">Sign in</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                          <button id = \"enrollBtn\" type=\"button\" onclick=\"enrollPage();\">????????????</button>\r\n");
      out.write("                          <script>\r\n");
      out.write("                           function enrollPage(){\r\n");
      out.write("    	                    location.href = \"");
      out.print( request.getContextPath());
      out.write("/newfacego.do\"; \r\n");
      out.write("                                   } \r\n");
      out.write("                          </script>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                      </div>\r\n");
      out.write("      \r\n");
      out.write("                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
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
