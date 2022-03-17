<%@page import="com.uni.notice.model.vo.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// servlet에서 넘긴 notice 객체 가져오기 - object로 넘어오기 때문에 형변환 꼭 해야 함
	Notice n = (Notice)request.getAttribute("notice");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	
	.outer{
		margin:auto;
		margin-top:50px;
	}
	
	#detailArea{
		width:60%;
		margin:auto;
		border-color:white;
		border:1px solid black;
	}
	
	#detailArea tr, #detailArea tr>td{
		border:1px solid black;
	}
	
	#detailArea p{height:150px;}
	
	.btns a{text-decoration:none; color:black;}
	
</style>

</head>
<body>
	
	<!-- menu -->
	<%@ include file="../common/menu.jsp" %>
	
	<div class="outer">

		<table id="detailArea" border="1">
			<tr>
				<td>제목</td>
				<td colspan="3"><%= n.getNoticeTitle() %></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>관리자</td>
				<td>작성일</td>
				<td><%= n.getCreateDate() %></td>
			</tr>
			<tr>
				<td colspan="4">
					<p><%= n.getNoticeContent() %></p>
				</td>
			</tr>	
		</table>
		
		<br>
		
		<div class="btns" align="center">
		
			<a href="noticeList.do">목록으로</a> &nbsp;&nbsp;
				
			
			<% if(loginUser != null && loginUser.getUserId().equals("admin")) { %>
			
			<%-- 바로 url 연결해줘서 서블릿으로 연결 / 쿼리스트링으로 --%>
			<a href="noticeUpdateForm.do?nno=<%=n.getNoticeNo()%>">수정하기</a> &nbsp;&nbsp;
			<a href="noticeDelete.do?nno=<%=n.getNoticeNo()%>">삭제하기</a>
		
			<% } %>
			
		</div>
	</div>
	
	<br>
	
	<!-- footer-->
   	<jsp:include page = "../common/footer.jsp"/>
	
</body>
</html>