/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-24 00:16:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.uni.notice.model.vo.Notice;

public final class noticeDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/SEMI/SERVER_semi/pleaseCal_2/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647444556028L));
    _jspx_dependants.put("jar:file:/C:/SEMI/SERVER_semi/pleaseCal_2/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/SEMI/SERVER_semi/pleaseCal_2/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.uni.notice.model.vo.Notice");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("	.outer{\r\n");
      out.write("		margin:auto;\r\n");
      out.write("		margin-top:50px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#detailArea{\r\n");
      out.write("		width:60%;\r\n");
      out.write("		margin:auto;\r\n");
      out.write("		border-color:white;\r\n");
      out.write("		border:1px solid black;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#detailArea tr, #detailArea tr>td{\r\n");
      out.write("		border:1px solid black;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#detailArea p{height:150px;}\r\n");
      out.write("	\r\n");
      out.write("	.btns{margin:atuo; margin-bottom:50px}\r\n");
      out.write("	\r\n");
      out.write("	.btns a{text-decoration:none; color:black;}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<!-- menu -->\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"outer\"><br><br>\r\n");
      out.write("\r\n");
      out.write("		<table id=\"detailArea\" border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>제목</td>\r\n");
      out.write("				<td colspan=\"3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>작성자</td>\r\n");
      out.write("				<td>관리자</td>\r\n");
      out.write("				<td>작성일</td>\r\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.createDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"4\">\r\n");
      out.write("					<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>	\r\n");
      out.write("		</table>\r\n");
      out.write("		\r\n");
      out.write("		<br>\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"btns\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("			<button type=\"button\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/noticeList.do';\">목록으로</button>\r\n");
      out.write("			\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /views/notice/noticeDetailView.jsp(74,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty sessionScope.loginUser && sessionScope.loginUser.userId == 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("				");
            out.write("\r\n");
            out.write("				<button type=\"button\" onclick=\"location.href='");
            out.print(request.getContextPath());
            out.write("/noticeUpdateForm.do?nno=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("';\">수정하기</button>\r\n");
            out.write("				<button type=\"button\" id=\"delete\" onclick=\"deleteNotice()\">삭제하기</button>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		// 삭제 버튼 클릭 시\r\n");
      out.write("		function deleteNotice() {\r\n");
      out.write("			// 변수에 담아서\r\n");
      out.write("			var result = confirm(\"정말 삭제하시겠습니까?\");\r\n");
      out.write("			// true 면 (삭제하려고 하면)\r\n");
      out.write("			if(result) {\r\n");
      out.write("				// 삭제 서블릿 실행\r\n");
      out.write("				location.href=\"");
      out.print(request.getContextPath());
      out.write("/noticeDelete.do?nno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("				alert(\"삭제가 완료되었습니다.\");\r\n");
      out.write("				return true;\r\n");
      out.write("			// false 면 (삭제 취소)\r\n");
      out.write("			} else {\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- footer-->\r\n");
      out.write("   	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
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
