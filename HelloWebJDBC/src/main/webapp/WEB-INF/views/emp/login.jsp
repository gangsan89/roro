<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	${errorMsg }<br>
	<form action="loginProcess" method="post">
		사번:<input type="number" name="empNo"><br>
		이름:<input type="text" name="empName"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>