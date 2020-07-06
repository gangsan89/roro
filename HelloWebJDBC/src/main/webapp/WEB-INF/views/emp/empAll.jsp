<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empAll</title>
</head>
<body>

	
	<br>${empAll }<br>
	<br>${empAll[0].emp }<br>
	
	<h1>사원 목록</h1>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>사원 번호</th>
				<th>사원 이름</th>
				<th>직무</th>
				<th>mgr</th>
				<th>입사일</th>
				<th>급여</th>
				<th>부서번호</th>
				<th>부서이름</th>
			</tr>
		</thead>
		
		<!-- e.empNo, e.eName, e.job, e.mgr, e.hiredate, e.sal,"
				+ " d.dName, d.deptNo  -->
		<tbody>
			<c:forEach items="${empAll }" var="empinfo" varStatus="stat">
				<!-- items= 리스트가 가지고 있는 어트리뷰트 값  var=리스트에 리턴하고 있는 값? -->
				<tr>
					<td>${stat.count }</td>
					<td>${empinfo.emp.empNo }</td>
					<td>${empinfo.emp.eName }</td>
					<td>${empinfo.emp.job }</td>
					<td>${empinfo.emp.mgr }</td>
					<td>${empinfo.emp.hiredate }</td>
					<td>${empinfo.emp.sal }</td>
					<td>${empinfo.dept.deptNo }</td>
					<td>${empinfo.dept.dName }</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	
	
	
</body>
</html>