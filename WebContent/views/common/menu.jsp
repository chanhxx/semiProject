<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Shop Homepage - Start Bootstrap Template</title>
<!-- Core theme CSS (includes Bootstrap)-->
<link href="././resources/css/styles.css" rel="stylesheet" />
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>


</head>
<body>

	<c:if test="${ !empty msg }">
		<script>
			alert("${msg}");
		</script>
		<c:remove var="msg" scope="session"/>
	</c:if>
	
	<!-- Navigation-->
   	<nav class="navbar navbar-expand-lg navbar-light bg-light">
       	<div class="container px-4 px-lg-5">
           	<a class="navbar-brand" href="#!">CAL</a>
           	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
           	<div class="collapse navbar-collapse" id="navbarSupportedContent">
               	<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                   	<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath() %>">Home</a></li>
                   	<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath() %>/healthInfo.do">건강계산기</a>
                   	<li class="nav-item dropdown">
                       <a class="nav-link dropdown-toggle" id="navbarDropdown" href="" role="button" data-bs-toggle="dropdown" aria-expanded="false">상품</a>
                       <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                       	   <li><a class="dropdown-item" href="<%=request.getContextPath() %>/listProduct.do">모든상품</a></li>
                           <li><a class="dropdown-item" href="<%=request.getContextPath() %>/selectListProduct.do?category=2">단백질프로틴</a></li>
                           <li><a class="dropdown-item" href="<%=request.getContextPath() %>/selectListProduct.do?category=1">닭가슴살</a></li>
                           <li><a class="dropdown-item" href="<%=request.getContextPath() %>/selectListProduct.do?category=3">도시락</a></li>
                 	      </ul>
                	   </li>
                	<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath() %>/noticeList.do">공지사항</a>
                   	<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath() %>/boardList.do">Q&A</a>
                   	</li>
              	 </ul>
              	 <form class="d-flex">
              	 
                 	<button class="btn btn-outline-dark" type="submit">
             	  	 	<i class="bi-cart-fill me-1"></i>
                      	Cart
                       	<span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
                   	</button>
					
					&nbsp;
					
                  	<!-- 로그인 전 -->
	                <c:if test="${ empty sessionScope.loginUser }">
		                <button class="btn btn-outline-dark" type="submit">
						<a href="<%=request.getContextPath()%>/LoginPage.do">로그인</a>
					</button>
	                </c:if>
		
					<!-- 로그인 후  -->
	                <c:if test="${ !empty sessionScope.loginUser }">
		                <label>${ sessionScope.loginUser.userName }님 환영합니다</label> &nbsp;&nbsp;
		                <a href="mypageMember.do">마이페이지</a> &nbsp;
		                <a href="logoutMember.do">로그아웃</a>
	                </c:if>
               </form>
           </div>
       </div>
   </nav>
   <!-- Header-->
   <header class="bg-dark py-5">
       <div class="container px-4 px-lg-5 my-5">
           <div class="text-center text-white">
               <h1 class="display-4 fw-bolder">Shop in style</h1>
               <p class="lead fw-normal text-white-50 mb-0">With this shop homepage template</p>
           </div>
       </div>
   </header>
   
</body>
</html>