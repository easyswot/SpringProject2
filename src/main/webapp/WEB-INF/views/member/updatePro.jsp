<%-- <%@page import="member.MemberDTO"%> --%>
<%-- <%@page import="member.MemberDAO"%> --%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/updatePro.jsp</title>
</head>
<body>
<%
// post request 한글처리
request.setCharacterEncoding("utf-8");

// request id pass name 파라미터 값 가져오기 => 변수 저장
String id = request.getParameter("id");
String pass = request.getParameter("pass");
String name = request.getParameter("name");

// MemberDAO memberDAO = new MemberDAO();

// MemberDTO memberDTO = memberDAO.userCheck(id, pass);
// if(memberDTO!=null) {
// 	// if memberDTO != null => 아이디 비밀번호 일치
// 	// MemberDTO updateDTO 객체 생성
// 	MemberDTO updateDTO = new MemberDTO();
// 	// set 메서드 호출 id pass name 저장
// 	updateDTO.setId(id);
// 	updateDTO.setPass(pass);
// 	updateDTO.setName(name);
// 	// updateMember(MemberDTO updateDTO) 메서드 정의
// 	// updateMember(updateDTO) 메서드 호출
// 	memberDAO.updateMember(updateDTO);
	
// //		3단계 수정 String sql="update 테이블이름 set 수정열=값 where 조건열=값";	
// 	response.sendRedirect("main.jsp");

// }else {
	%>
	<script type="text/javascript">
		alert("아이디 비밀번호 틀림");
		history.back();
	</script>
	<%
// }
%>
</body>
</html>