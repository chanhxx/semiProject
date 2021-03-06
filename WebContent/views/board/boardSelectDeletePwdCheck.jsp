<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<title>게시글 비밀번호 확인</title>

<style>
	
	.outer {
		margin: auto;
		margin-top: 80px;
		margin-botton: 50px;
	}
	
	#pwd {
		margin: auto;
		margin-left: 5px;
		margin-right: 5px;
	}
	
	#submit {
		border: 1px solid darkgrey;
		border-radius: 5px;
	}
	
	input {
		border: 1px solid darkgrey;
		border-radius: 5px;
		outline: none;
		background-color: rgb(233, 233, 233);
		padding-left: 5px;
	}
	
	input:focus {
		outline: none;
		box-shadow: box-shadow: 0 0 0 2px #f00;
	}


</style>

</head>
<body>

	<div class="outer">
		<form>
			<%-- 게시글 번호 히든으로 넘기기 - 해당 게시글 번호의 비밀번호 확인하기 위해 하기 위해 --%>
			<input type="hidden" name="bno" value="${b.boardNo}">
			<div class="inner" align="center">
				<table>
					<tr>
						<td colspan="2"></td>
					</tr>
					<tr>
						<td> 비밀번호 입력 </td>
						<td>
							<input type="password" id="pwd" name="pwd" autofocus>
							<button type="submit" id="submit" name="submit" value="확인">확인</button>
						</td>
					</tr>
					<tr>
						<td colspan="2"></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
	
	<script>
		// 확인 버튼 클릭 시
		$("#submit").click(function() {
			// 입력한 비밀번호와 해당 게시글 비밀번호를 변수에 담아서
			let input = $("#pwd").val().trim();
			let pwd = "${b.boardPwd}";
			
			// 입력창 비워진 채로 확인 버튼 클릭 시
			if(input == "") {
				alert("비밀번호를 입력해주세요.");
				$("#pwd").focus();
				return false;
			}
			
			// 둘이 일치하지 않으면
			if(input != "" && input != pwd) {
				// 알림 띄우기
				alert("비밀번호가 일치하지 않습니다.");
				$("#pwd").select();
				return false;
			
			// 일치하는 경우
			} else {
				// 알림 띄우고
				alert("삭제가 완료되었습니다.");
				// 해당 게시글 삭제하는 서블릿 실행
				location.href="<%=request.getContextPath()%>/boardDelete.do?bno=${b.boardNo}";
				// 부모 페이지 내가 작성한 게시글 목록으로 이동
				opener.location.href="<%=request.getContextPath()%>/boardSelectList.do";
				// 팝업창 닫기
				close();
			}
			
		})
		
	</script>
	
</body>
</html>