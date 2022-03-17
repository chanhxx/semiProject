<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.uni.notice.model.vo.Notice, java.util.ArrayList"%>
<%
	// 공지사항 리스트 전체 가져오기
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
<!--     Fonts and icons     -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">

<style>

	.table{
		border:1px solid white;
		text-align:center;
	}
	
	.searchArea{
		margin:auto;
		margin-top:50px;
		margin-bottom:30px;
	}
	
	.table>tbody>tr:hover{
		background:darkgrey;
		cursor:pointer
	}


</style>

</head>
<body>

	<!-- menu -->
	<%@ include file="../common/menu.jsp" %>
	
	<div class="content">
       <div class="row">
         <div class="col-md-12">
           <div class="card">
             <div class="card-header">
               <h4 class="card-title">Notice</h4>
             </div>
             <div class="card-body">
               <div class="table-responsive">
                  
                  <table class="table">
                    
                    <thead class=" text-primary">
                    
                      <th>No</th>
                      <th>Title</th>
                      <th>Writer</th>
                      <th>Count</th>
                      <th>Date</th>
                      
                    </thead>
                    
                    <tbody>
                    
	                    <% if(list.isEmpty()){ %>
	                         <tr>
	                           <td colspan="5">존재하는 공지사항이 없습니다.</td>
	                        </tr>
			             <% }else{  %>
			                <% for(Notice n : list){ %>
			                   <tr>
			                     <td><%= n.getNoticeNo() %></td>
			                     <td><%= n.getNoticeTitle() %></td>
			                     <td>관리자</td>
			                     <td><%= n.getCount() %></td>
			                     <td><%= n.getCreateDate() %></td>
			                   </tr>
			                <% } %>
			             <% } %>
			             
		         	</tbody>
		         	
		          </table>
		          
               </div>
             </div>
           </div>
        </div>
      </div>
    </div>
	        	       	
   	<form class="searchArea" align="center">
        <select id="condition" name="condition">
           <option value="title">제목</option>
           <option value="content">내용</option>
        </select>
        <input type="search" name="search">
        <button type="submit">검색하기</button>
  	</form>
	
     <div id="insertBtn" align="center">
        <% if(loginUser != null && loginUser.getUserId().equals("admin")) { %>
	        <%-- 클릭 시 작성하기 폼으로 화면 전환하는 서블릿 연결 --%>
	        <button onclick="location.href='<%=contextPath%>/noticeEnrollForm.do'">작성하기</button>
     	<% } %>
    </div>
     
	<br>
	
	<script>
		
		// 리스트가 비어있지 않으면
	   	<%if(!list.isEmpty()){%>
   		
	   		$(function() {
	   			// 게시글 클릭했을 때
	   			$(".table>tbody>tr").click(function() {
	   				
	   				let nno = $(this).children().eq(0).text(); // n.getNoticeNo()
	   				
	   				// 해당 공지사항 상세 페이지로 넘어가기
	   				// 쿼리스트링으로 작성
	   				location.href= "<%=contextPath%>/noticeDetail.do?nno="+nno;
	   			})
	   			
	   		})
		<%}%>
	
	</script>
	
	
	
	<!-- footer-->
   	<jsp:include page = "../common/footer.jsp"/>

</body>
</html>