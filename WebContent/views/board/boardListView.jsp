<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.uni.board.model.vo.PageInfo"%>
<%-- jstl import --%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%

	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	//int listCount = pi.getListCount();
	int currentPage = pi.getCurrentPage();
	//int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();

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
		margin-top:30px;
		margin-bottom:30px;
	}
	
	.pagingArea {
		margin:auto;
		margin-top:50px;
	}
	
	.table>tbody>tr:hover{
		background:darkgrey;
		cursor:pointer
	}


</style>

</head>
<body>

	<!-- menu -->
	<jsp:include page = "../common/menu.jsp"/>
	
	<div class="content">
       <div class="row">
         <div class="col-md-12">
           <div class="card">
             <div class="card-header">
               <h4 class="card-title">Q&A</h4>
             </div>
             <div class="card-body">
               <div class="table-responsive">
               
                  <table class="table" id="blist">
                  
                    <thead class=" text-primary">
                      <th>No</th>
                      <th>Category</th>
                      <th>Title</th>
                      <th>Writer</th>
                      <th>Date</th>
                    </thead>
                    
                    <tbody>
						<%-- list가 비어있으면 --%>
	                    <c:if test="${ empty list }">
	                         <tr>
	                           <td colspan="5">존재하는 게시글이 없습니다.</td>
	                        </tr>
	                    </c:if>
	                    
	                    <%-- list가 비어있지 않으면 --%>
	                    <c:if test="${ !empty list }">
	                    	<%-- for문 안에서 사용할 변수명과 배열 set --%>
		                	<c:set var="list" value="${list}"/>
		                	<%-- varStatus : 반복 횟수 변수명 --%>
		                	<c:forEach items="${list}" varStatus="st">
			                 	<%-- st.index : 0부터 순서대로 인덱스 실행 --%>
			                 	<tr>
			                     <td>${list[st.index].boardNo}</td>
			                     <td>${list[st.index].category}</td>
			                     <td>${list[st.index].boardTitle}</td>
			                     <td>${list[st.index].boardWriter}</td>
			                     <td>${list[st.index].createDate}</td>
			                   	</tr>
			                 </c:forEach>
			            </c:if>
		         	</tbody>
		         	
		          </table>
		          
               </div>
             </div>
           </div>
        </div>
      </div>
    </div>
	
	
	<!-- 페이징바 만들기 -->
	<div class="pagingArea" align="center">
		<!-- 맨 처음으로 (<<) -->
		<button onclick="location.href='<%=request.getContextPath()%>/listBoard.do?currentPage=1'"> &lt;&lt; </button>
	
		<!-- 이전페이지로(<) -->
		<c:choose>
			<c:when test="${currentPage == 1}">
				<button disabled> &lt; </button>
			</c:when>
			
			<c:otherwise>
				<button onclick="location.href='<%= request.getContextPath() %>/listBoard.do?currentPage=${currentPage - 1}'"> &lt; </button>
			</c:otherwise>
		</c:choose>
		
		
		<!-- 페이지 목록 -->
		<%for(int p=startPage; p<=endPage; p++){ %>
			
			<%if(p == currentPage){ %>
				<button disabled> <%= p %> </button>
			<%}else{ %>
				<button onclick="location.href='<%=request.getContextPath() %>/listBoard.do?currentPage=<%= p %>'"> <%= p %> </button>
			<%} %>
			
		<%} %>
		
		<!-- 다음페이지로(>) -->
		<c:choose>
			<c:when test="${currentPage == maxPage}">
				<button disabled> &gt; </button>
			</c:when>
			
			<c:otherwise>
				<button onclick="location.href='<%= request.getContextPath() %>/listBoard.do?currentPage=${currentPage + 1}'"> &gt; </button>
			</c:otherwise>
		</c:choose>
	
		<!-- 맨 끝으로 (>>) -->
		<button onclick="location.href='<%=request.getContextPath()%>/listBoard.do?currentPage=${maxPage}'"> &gt;&gt; </button>
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
		<%-- 클릭 시 작성하기 폼으로 화면 전환하는 서블릿 연결 --%>
        <button onclick="location.href='<%=request.getContextPath()%>/boardEnrollForm.do'">작성하기</button>
    </div>
	
	<br>
	
	<script>
		/*
		$(function() {
			
			$.ajax({
				url: "boardList.do",
				
				type: "get",
				
				success: function(list) {
					console.log(list);
					
					// table에 뿌려주기
					// 제이쿼리 변수에 담을 것 - 제이쿼리에서 내장함수 모두 사용 가능
					var $tableBody = $("#blist tbody");
					
					// 조회할 때마다 지우고 그려줘야 하기 때문에 일단 비워줄 것
					$tableBody.html("");
					
					var $tr = $("<tr>");
					
					if(list != null) {
						
						$.each(list, function(i) {
							
							//var $tr = $("<tr>");
							var $noTd = $("<td>").text(list[i].boardNo);
							var $categoryTd = $("<td>").text(list[i].Category);
							var $titleTd = $("<td>").text(list[i].boardTitle);
							var $writerTd = $("<td>").text(list[i].boardWriter);
							var $dateTd = $("<td>").text(list[i].createDate);
							
							$tr.append($noTd);
							$tr.append($categoryTd);
							$tr.append($titleTd);
							$tr.append($writerTd);
							$tr.append($dateTd);

						})
						
					} else {
						
						var $td = $("<td>").text('존재하는 게시글이 없습니다.');
						
						$tr.append($td);
					}
					
					$tableBody.append($tr);
					
				},
				
				error: function(e) {
					console.log("ajax 통신 실패");
				}
				
				
			})
			
		})*/

		// list 가 비어있지 않으면
		<c:if test="${!empty list}">
			$(function() {
	   			// 게시글 클릭했을 때
	   			$(".table>tbody>tr").click(function() {
	   				// 게시글 번호 가져와서 변수에 담기
	   				let bno = $(this).children().eq(0).text();
	   				// 해당 공지사항 상세 페이지로 넘어가기
	   				// 쿼리스트링으로 작성
	   				location.href= "<%=request.getContextPath()%>/boardDetail.do?bno="+bno;
	   			})
	   		})
   		</c:if>
			
	</script>
	

	<!-- footer-->
   	<jsp:include page = "../common/footer.jsp"/>

</body>
</html>