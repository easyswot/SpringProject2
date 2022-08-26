<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/list.jsp</title>
</head>
<body>

<table border="1">
<tr><td>아이디</td><td>비밀번호</td><td>이름</td><td>가입날짜</td></tr>
<c:forEach var="memberDTO" items="${memberList }">
		<tr><td>${memberDTO.id }</td>
			<td>${memberDTO.pass }</td>
			<td>${memberDTO.name }</td>
			<td>${memberDTO.date }</td>
		</tr>
</c:forEach>

</table>
</body>
</html>