<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<style>
input{
width:500px;
height:50px;
}
#waddress{
width:70px;
height:50px;
}
</style>

<body>

<div class="outer">
		<br>
		
		<h2 align="center">계정만들기</h2>
		
		<form id="newFace" action="<%=request.getContextPath() %>/insertMember.do" method="post">
			<table align="center" width="750px">
				<tr>	
				<td>아이디</td>			
					<td><input type="text"  name="userId"  placeholder="아이디를 입력하세요" width="300px" required></td>
					
						
					</td>
				</tr>
				<tr>	
				<td>비밀번호</td>					
					<td><input type="password"  name="userPwd" placeholder="비밀번호를 입력하세요" required></td>
					<td></td>
				</tr>
				<tr>	
				<td>비밀번호 확인</td>				
					<td><input type="password"  name="checkPwd" placeholder="비밀번호 확인!" required></td>
					<td><label id = "pwdResult"></label></td>
				</tr>	
				<tr>	
				<td>이름</td>			
					<td><input type="text"  name="userName" placeholder="이름을 입력하세요" required></td>
					<td></td>
				</tr>
				
				<tr>
					<td>주소</td>	
					<td><input type="text" name="address" id="address" placeholder="주소를 입력하세요"></td>
					<td><input type="button" id="waddress" value ="주소입력!" ></input></td>
		
				</tr>
				<tr>
					<td>전화번호(-포함)</td>	
					<td><input type="tel" maxlength="13" name="phone" placeholder="전화번호 입력해주세요(-입력)010-1234-5678"></td>
					<td></td>
				</tr>	
				
			</table>
			<br>
			<div class="btns" align="center">				
				<button type="submit" id="joinBtn">가입하기</button>
			
				
			</div>
		</form>
	
	</div>
	<script>
	   window.onload = function(){
    document.getElementById("waddress").addEventListener("click", function(){ 
       new daum.Postcode({
       oncomplete: function(data) { //선택시 입력값 세팅
           document.getElementById("address").value = data.address; // 주소 넣기        
       }
   }).open();
});
}
	
	function joinValidate(){
		
		if(!(/^[a-z][a-z\d]{3,11}$/i.test($("#enrollForm input[name=userId]").val()))){
			$("#enrollForm input[name=userId]").focus();
	        return false;
		}
		
		if($("#enrollForm input[name=userPwd]").val() != $("#enrollForm input[name=checkPwd]").val()){
			$("#pwdResult").text("비밀번호 불일치").css("color", "red");
			return false;			
		}
		
		 if(!(/^[가-힣]{2,}$/.test($("#enrollForm input[name=userName]").val()))){
			 $("#enrollForm input[name=userName]").focus();
	        return false;
		 }
		 
		 return true;
		
		
	}
	
	</script>



</body>
</html>