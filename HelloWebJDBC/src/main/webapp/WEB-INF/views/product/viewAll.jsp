<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${list}" var="product">
		<a href="../products/selectOne/${product.id }">${product.name }</a>
		<%-- ${product.name }
		${product.price } --%>
		<br/>
	</c:forEach>

</body>
</html>