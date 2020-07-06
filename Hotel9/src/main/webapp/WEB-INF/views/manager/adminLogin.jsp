<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
</head>
<body>
<h2 style="text-align:center;">관리자 로그인</h2>
<form action="/admin" method="post" style="text-align:center;">
아이디: <input type="text" name="managerID"><br>
암　호: <input type="password" name="managerPW"><br>
<button type="submit">Login</button>
</form>
</body>
</html>