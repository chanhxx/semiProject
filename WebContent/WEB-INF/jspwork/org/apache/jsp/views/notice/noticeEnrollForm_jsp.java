/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-30 06:06:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticeEnrollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/smarteditor/js/HuskyEZCreator.js\" charset=\"utf-8\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("	.outer{\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top:50px;\n");
      out.write("		margin-bottom:50px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#enrollForm{\n");
      out.write("		width:100%;\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top: 40px;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#enrollForm>table{\n");
      out.write("		border:1px solid black;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	#enrollForm>table input{\n");
      out.write("		width:100%;\n");
      out.write("		box-sizing:border-box;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.btns {\n");
      out.write("		margin:auto;\n");
      out.write("		margin-top:30px;\n");
      out.write("		margin-bottom:40px;\n");
      out.write("	}\n");
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
      out.write("	.insertArea th {\n");
      out.write("		text-align: center;\n");
      out.write("		background-color: lightgrey;\n");
      out.write("		\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.insertArea tr {\n");
      out.write("		border:1px solid black;\n");
      out.write("		border-left: none;\n");
      out.write("		border-right: none;\n");
      out.write("		\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	.insertArea td {\n");
      out.write("		padding: 5px 5px 5px 5px;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<!-- menu -->\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menu.jsp", out, false);
      out.write("\n");
      out.write("	\n");
      out.write("	<!-- header -->\n");
      out.write("   	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\n");
      out.write("	\n");
      out.write("	<div class=\"outer\">\n");
      out.write("		\n");
      out.write("		<h2 align=\"center\">공지사항 작성하기</h2>\n");
      out.write("		\n");
      out.write("		<form id=\"enrollForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/noticeInsert.do\" method=\"post\">\n");
      out.write("			<div align=\"center\">\n");
      out.write("				\n");
      out.write("				<table class=\"insertArea\" width=\"870px\">\n");
      out.write("					<tr>\n");
      out.write("						<th>제목</th>\n");
      out.write("						<td><input type=\"text\" id=\"title\" name=\"title\"/></td>\n");
      out.write("					</tr>\n");
      out.write("					<tr>\n");
      out.write("						<th>내용</th>\n");
      out.write("						<td>\n");
      out.write("							<textarea id=\"content\" name=\"content\" rows=\"10\" cols=\"30\" style=\"width:766px; height:412px;\"></textarea>\n");
      out.write("						</td>\n");
      out.write("					</tr>\n");
      out.write("				</table>\n");
      out.write("				\n");
      out.write("			</div>\n");
      out.write("			<div class=\"btns\" align=\"center\">\n");
      out.write("				<button type=\"submit\" class=\"button\" id=\"insert\">등록하기</button>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("	<script>\n");
      out.write("	\n");
      out.write("	    let oEditors = []\n");
      out.write("	\n");
      out.write("	    smartEditor = function() {\n");
      out.write("	    	\n");
      out.write("			nhn.husky.EZCreator.createInIFrame({\n");
      out.write("	        	oAppRef: oEditors,\n");
      out.write("	        	// 에디터가 들어갈 textarea id\n");
      out.write("	        	elPlaceHolder: \"content\",\n");
      out.write("	        	// html editor skin url\n");
      out.write("	        	sSkinURI: \"");
      out.print(request.getContextPath());
      out.write("/resources/smarteditor/SmartEditor2Skin.html\",\n");
      out.write("	        	\n");
      out.write("	        	htParams : {\n");
      out.write("		        	// 툴바 사용 여부\n");
      out.write("		        	bUseToolbar : true,\n");
      out.write("		        	// 입력창 크기 조절바 사용 여부\n");
      out.write("					bUseVerticalResizer : true,\n");
      out.write("					// 모드 탭(Editor | HTML | TEXT) 사용 여부\n");
      out.write("					bUseModeChanger : true,\n");
      out.write("					\n");
      out.write("					fOnBeforeUnload : function(){\n");
      out.write("						alert(\"완료!\");\n");
      out.write("					}\n");
      out.write("				}, //boolean\n");
      out.write("				\n");
      out.write("				fOnAppLoad : function(){\n");
      out.write("					//예제 코드\n");
      out.write("					//oEditors.getById[\"ir1\"].exec(\"PASTE_HTML\", [\"로딩이 완료된 후에 본문에 삽입되는 text입니다.\"]);\n");
      out.write("				},\n");
      out.write("				\n");
      out.write("	        	fCreator: \"createSEditor2\"\n");
      out.write("	      	})\n");
      out.write("	    }\n");
      out.write("		\n");
      out.write("	    // 페이지 열자마자 에디터 API 실행\n");
      out.write("	    $(document).ready(function() {\n");
      out.write("	      smartEditor();\n");
      out.write("	    })\n");
      out.write("	  \n");
      out.write("	    \n");
      out.write("		// 폼 제출 시 카테고리, 내용, 비밀번호 비어 있으면 알림창 띄우기\n");
      out.write("		$(\"form\").submit(function() {\n");
      out.write("			// 제목, 내용 값을 변수에 담아서\n");
      out.write("			let title = $(\"#title\").val();\n");
      out.write("			let content = $(\"#content\").val();\n");
      out.write("			\n");
      out.write("	    	oEditors.getById[\"content\"].exec(\"UPDATE_CONTENTS_FIELD\", [])\n");
      out.write("	    	\n");
      out.write("			// 제목이 비어있는 경우\n");
      out.write("			if(title == \"\" || title == null) {\n");
      out.write("				// 폼의 액션 태그 제거 (서블릿으로 넘어가 게시글 등록 막기 위해)\n");
      out.write("				$(this).removeAttr(\"action\");\n");
      out.write("				// 알림 띄우기\n");
      out.write("				alert(\"제목을 입력해주세요.\");\n");
      out.write("				// 해당 입력창에 포커스 주기\n");
      out.write("				$(\"#title\").focus();\n");
      out.write("				\n");
      out.write("				return false;\n");
      out.write("			\n");
      out.write("			// 내용이 비어있는 경우\n");
      out.write("			} else if(content == \"\"  || content == null || content == '&nbsp;' || content == '<p>&nbsp;</p>') {\n");
      out.write("				// 알림 띄우기\n");
      out.write("				alert(\"내용을 입력해주세요.\")\n");
      out.write("				// 포커싱 주기\n");
      out.write("   		    	oEditors.getById[\"content\"].exec(\"FOCUS\");\n");
      out.write("   		    	\n");
      out.write("				return false;\n");
      out.write("			\n");
      out.write("			// 잘 작성이 되어있으면\n");
      out.write("			} else {\n");
      out.write("				// 제거했던 액션 태그 다시 추가해서 잘 진행되도록\n");
      out.write("				$(this).attr(\"action\", \"");
      out.print(request.getContextPath());
      out.write("/noticeInsert.do\");\n");
      out.write("			}	\n");
      out.write("		})\n");
      out.write("		\n");
      out.write("		\n");
      out.write("	</script>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("	<!-- footer-->\n");
      out.write("   	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\n");
      out.write("	\n");
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
