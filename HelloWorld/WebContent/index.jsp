<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>첫 번째 페이지</title>
</head>
<body>
	회원가입!! <br>
	<form action = "MemberJoin.do" method = "post" id = "join">
		아이디 : <input type = "text" name = "userID" id = "userID"> <br>
		비밀번호 : <input type = "password" name = "userPW" id = "userPW"> <br>
		이름 : <input type = "text" name = "userName"> <br>
		나이 : <input type = "text" name = "userAge"> <br>		
		<input type = "submit" value = "로그인">
	</form>
</body>
</html>