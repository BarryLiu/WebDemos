<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>listDept.jsp</h1>
		<h6>
			<a href="firmAction.do?method=toAddDept">add Dept</a>
		</h6>
		<br>
		<table border="1">
			<tr>
				<td>编号</td> 
				<td>部门</td>
				<td>操作</td>
			</tr>
			<c:forEach var="d" items="${depts }">
				<tr>
					<td>${d.deptno}</td>
					<td>${d.dname }</td>
					<td>
						<a href="firmAction.do?method=toModifyDept&deptno=${d.deptno}">修改</a>
						<a href="firmAction.do?method=removeDept&deptno=${e.deptno}">删除</a>
					</td>
				</tr>				
			</c:forEach>
		</table>
	</div>
</body>
</html>