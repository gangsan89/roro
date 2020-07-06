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

	<table>
		<thead>
			<tr>
				<th style="width:100px">empNo</th>
				<th style="width:100px">eName</th>
				<th style="width:100px">job</th>
				<th style="width:100px">mgr</th>
				<th style="width:100px">sal</th>
				<th style="width:100px">comm</th>
				<th style="width:100px">deptNo</th>
			</tr>
		</thead>
		
		
		<tbody style="text-align: center;">
		<c:forEach items="${emp}" var = "emp">
			<tr>
				<td style="width:100px">${emp.empNo }</td>
				<td style="width:100px">${emp.EName }</td>
				<td style="width:100px">${emp.job }</td>
				<td style="width:100px">${emp.mgr }</td>
				<td style="width:100px">${emp.sal }</td>
				<td style="width:100px">${emp.comm }</td>
				<td style="width:100px">${emp.deptNo }</td>
			</tr>
			</c:forEach>
		</tbody>
	
	</table>
</body>
</html>