/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-28 18:35:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boardDetailPwdCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("<title>게시글 비밀번호 확인</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("	.outer {\r\n");
      out.write("		margin: auto;\r\n");
      out.write("		margin-top: 80px;\r\n");
      out.write("		margin-botton: 50px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#pwd {\r\n");
      out.write("		margin: auto;\r\n");
      out.write("		margin-left: 5px;\r\n");
      out.write("		margin-right: 5px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#submit {\r\n");
      out.write("		border: 1px solid darkgrey;\r\n");
      out.write("		border-radius: 5px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input {\r\n");
      out.write("		border: 1px solid darkgrey;\r\n");
      out.write("		border-radius: 5px;\r\n");
      out.write("		outline: none;\r\n");
      out.write("		background-color: rgb(233, 233, 233);\r\n");
      out.write("		padding-left: 5px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	input:focus {\r\n");
      out.write("		outline: none;\r\n");
      out.write("		box-shadow: box-shadow: 0 0 0 2px #f00;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"outer\">\r\n");
      out.write("		<form>\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			<input type=\"hidden\" name=\"bno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.boardNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			<div class=\"inner\" align=\"center\">\r\n");
      out.write("				<table>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td colspan=\"2\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td> 비밀번호 입력 </td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" id=\"pwd\" name=\"pwd\" autofocus>\r\n");
      out.write("							<button type=\"submit\" id=\"submit\" name=\"submit\" value=\"확인\">확인</button>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td colspan=\"2\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		// 확인 버튼 클릭 시\r\n");
      out.write("		$(\"#submit\").click(function() {\r\n");
      out.write("			// 입력한 비밀번호와 해당 게시글 비밀번호를 변수에 담아서\r\n");
      out.write("			let input = $(\"#pwd\").val().trim();\r\n");
      out.write("			let pwd = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.boardPwd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("			\r\n");
      out.write("			// 입력창 비워진 채로 확인 버튼 클릭 시\r\n");
      out.write("			if(input == \"\") {\r\n");
      out.write("				alert(\"비밀번호를 입력해주세요.\");\r\n");
      out.write("				$(\"#pwd\").focus();\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			// 둘이 일치하지 않으면\r\n");
      out.write("			if(input != null && input != pwd) {\r\n");
      out.write("				// 알림 띄우기\r\n");
      out.write("				alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("				$(\"#pwd\").focus();\r\n");
      out.write("				return false;\r\n");
      out.write("			\r\n");
      out.write("			// 일치하는 경우\r\n");
      out.write("			} else {\r\n");
      out.write("				// 부모 페이지를 해당 게시글 상세 페이지로 전환하고\r\n");
      out.write("				opener.location.href=\"");
      out.print(request.getContextPath());
      out.write("/boardDetail.do?bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${b.boardNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("				// 팝업창 닫기\r\n");
      out.write("				close();\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
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
