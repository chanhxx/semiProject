/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-30 05:21:11 UTC
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

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	\n");
      out.write("	.outer {\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top:50px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.detailArea {\n");
      out.write("		width:60%;\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top: 40px;\n");
      out.write("		margin-bottom: 20px;\n");
      out.write("		border:1px solid black;\n");
      out.write("		border-left: none;\n");
      out.write("		border-right: none;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.detailArea tr {\n");
      out.write("		border:1px solid black;\n");
      out.write("		border-left: none;\n");
      out.write("		border-right: none;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.detailArea p {height:150px;}\n");
      out.write("	\n");
      out.write("	.btns {margin:atuo; margin-bottom:50px;}\n");
      out.write("	\n");
      out.write("	.button {\n");
      out.write("		color: #fff;\n");
      out.write("  		border-radius: 5px;\n");
      out.write("  		padding: 5px 15px;\n");
      out.write("  		font-family: 'Lato', sans-serif;\n");
      out.write("  		font-weight: 500;\n");
      out.write("  		background: transparent;\n");
      out.write("  		cursor: pointer;\n");
      out.write("  		transition: all 0.3s ease;\n");
      out.write("  		position: relative;\n");
      out.write("  		display: inline-block;\n");
      out.write("   		box-shadow:	inset 2px 2px 2px 0px rgba(255,255,255,.5),\n");
      out.write("   					7px 7px 20px 0px rgba(0,0,0,.1),\n");
      out.write("   					4px 4px 5px 0px rgba(0,0,0,.1);\n");
      out.write("  		outline: none;\n");
      out.write("  		\n");
      out.write("		background: black;\n");
      out.write("	  	border: none;\n");
      out.write("	  	z-index: 1;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.button:after {\n");
      out.write("		position: absolute;\n");
      out.write("  		content: \"\";\n");
      out.write("  		width: 0;\n");
      out.write("  		height: 100%;\n");
      out.write("	  	top: 0;\n");
      out.write("	  	right: 0;\n");
      out.write("	  	z-index: -1;\n");
      out.write("	  	background-color: grey;\n");
      out.write("	  	border-radius: 5px;\n");
      out.write("   		box-shadow: inset 2px 2px 2px 0px rgba(255,255,255,.5),\n");
      out.write("   					7px 7px 20px 0px rgba(0,0,0,.1),\n");
      out.write("   					4px 4px 5px 0px rgba(0,0,0,.1);\n");
      out.write("  		transition: all 0.3s ease;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.button:hover {\n");
      out.write("		color: #fff;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.button:hover:after {\n");
      out.write("	  	left: 0;\n");
      out.write("	  	width: 100%;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.button:active {\n");
      out.write("	  	top: 2px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.detailArea th {\n");
      out.write("		background-color: lightgrey;\n");
      out.write("		text-align: center;\n");
      out.write("		width: 100px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.detailArea td {\n");
      out.write("		padding: 5px 5px 5px 10px;\n");
      out.write("		padding-left: 10px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	\n");
      out.write("	<!-- menu -->\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\n");
      out.write("	\n");
      out.write("	<!-- header -->\n");
      out.write("   	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\n");
      out.write("   	\n");
      out.write("	\n");
      out.write("	<div class=\"outer\">\n");
      out.write("		\n");
      out.write("		<h2 align=\"center\"> 공지사항 </h2>\n");
      out.write("		\n");
      out.write("		<table class=\"detailArea\" border=\"1\">\n");
      out.write("			<tr>\n");
      out.write("				<th>제목</th>\n");
      out.write("				<td colspan=\"3\"><h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeTitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h4></td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<th>작성자</th>\n");
      out.write("				<td width=\"250px\">관리자</td>\n");
      out.write("				<th>작성일</th>\n");
      out.write("				<td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.createDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("			</tr>\n");
      out.write("			<tr>\n");
      out.write("				<th>내용</th>\n");
      out.write("				<td colspan=\"3\">\n");
      out.write("					<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("				</td>\n");
      out.write("			</tr>	\n");
      out.write("		</table>\n");
      out.write("		\n");
      out.write("		<br>\n");
      out.write("		\n");
      out.write("		<div class=\"btns\" align=\"center\">\n");
      out.write("\n");
      out.write("			<button class=\"button\" type=\"button\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/noticeList.do';\">목록으로</button>\n");
      out.write("			\n");
      out.write("			");
      out.write("\n");
      out.write("			");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /views/notice/noticeDetailView.jsp(145,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty sessionScope.loginUser && sessionScope.loginUser.userId == 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("				");
            out.write("\n");
            out.write("				<button class=\"button\" type=\"button\" onclick=\"location.href='");
            out.print(request.getContextPath());
            out.write("/noticeUpdateForm.do?nno=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("';\">수정하기</button>\n");
            out.write("				<button class=\"button\" type=\"button\" id=\"delete\" onclick=\"deleteNotice()\">삭제하기</button>\n");
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
      out.write("\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("		// 삭제 버튼 클릭 시\n");
      out.write("		function deleteNotice() {\n");
      out.write("			// 변수에 담아서\n");
      out.write("			var result = confirm(\"정말 삭제하시겠습니까?\");\n");
      out.write("			// true 면 (삭제하려고 하면)\n");
      out.write("			if(result) {\n");
      out.write("				// 삭제 서블릿 실행\n");
      out.write("				location.href=\"");
      out.print(request.getContextPath());
      out.write("/noticeDelete.do?nno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notice.noticeNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("				alert(\"삭제가 완료되었습니다.\");\n");
      out.write("				return true;\n");
      out.write("			// false 면 (삭제 취소)\n");
      out.write("			} else {\n");
      out.write("				return false;\n");
      out.write("			}\n");
      out.write("			\n");
      out.write("		}\n");
      out.write("	\n");
      out.write("	\n");
      out.write("	</script>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("	<!-- footer-->\n");
      out.write("   	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
      out.write("	\n");
      out.write("</body>\n");
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
