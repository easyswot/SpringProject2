<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/insertForm.jsp</title>
</head>
<body>

<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#iddup').click(function(){
// 			alert("클릭");
			$.ajax({
				url : '${pageContext.request.contextPath}/member/iddup',
				data : {'id' : $('#id').val()},
				success : function(rdata){
					if(rdata == 'iddup') {
						rdata = "아이디 중복";
					} else {
						rdata = "아이디 사용가능";
					}
					$('#iddiv').html(rdata);
				}
			});
		});
	});
</script>
<form action="${pageContext.request.contextPath}/member/insertPro" method="post">
아이디 : <input type="text" name="id" id="id">
<input type="button" value="아이디중복체크" id="iddup"><br>
<div id="iddiv"></div><br>
비밀번호 : <input type="password" name="pass"><br>
이름 : <input type="text" name="name"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>