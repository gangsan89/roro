<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h1 th:text="#{visit}"></h1>
	<h1 th:text="#{welcom.message}"></h1>
	
	<h1 th:text="#{greeting}"></h1> --%>
	<h1 ><spring:message code="gree" text="default"/></h1>
	<spring:message code="greeting" />
	<%-- <h1 spring:message="#{greeting}"></h1> --%>
</body>
</html>