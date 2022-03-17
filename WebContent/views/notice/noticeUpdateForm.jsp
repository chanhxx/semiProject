<%@page import="com.uni.notice.model.vo.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 해당 공지사항 가져와서 내용 띄우기
	// servlet 에서 넘긴 notice는 object 형이기 때문에 형변환 필요
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
		margin-bottom:50px
	}
	
	#updateForm{
		width:60%;
		margin:auto;
	}
	
	#updateForm>table{
		border:1px solid black;
		
	}
	
	#updateForm>table input{
		width:100%;
		box-sizing:border-box;
	}

</style>

</head>
<body>

	<!-- menu -->
	<%@ include file="../common/menu.jsp" %>
	
	<div class="outer">
		
		
		<h2 align="center">공지사항 수정</h2>
		
		<form id="updateForm" action="<%= contextPath %>/noticeUpdate.do" method="post" >
		
			<input type="hidden" name="nno" value="<%= n.getNoticeNo() %>">
		
			<table align="center">
				<tr>
					<td>제목</td>
					<td colspan="3"><input type="text" name="title" value="<%= n.getNoticeTitle()%>"></td>
				</tr>
				
				<tr>
					<td>내용</td>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea name="content" cols="60" rows="15" style="resize:none;"> value="<%= n.getNoticeContent()%>"</textarea>
					</td>
				</tr>	
			</table>
			<br>
			
			<div class="btns" align="center">
				<button type="submit">수정하기</button>
			</div>
		</form>
	</div>
	
	
	<!-- footer-->
   	<jsp:include page = "../common/footer.jsp"/>
	
</body>
</html>