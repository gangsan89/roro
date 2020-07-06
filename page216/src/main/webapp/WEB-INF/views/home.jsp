<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

	<form action="go" >
		age:<input type="number" name="age">
		<input type="submit" >
	</form>
	
	<form action="go2" >
		go2:age:<input type="text" name="age">
		<input type="submit" >
	</form>
	
	<form action="go3" >
		go3:age:<input type="number" name="age">
		<input type="submit" >
	</form>







</body>
</html>
