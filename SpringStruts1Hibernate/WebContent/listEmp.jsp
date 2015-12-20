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
		<h1>list.jsp</h1>
		<h4>
			<a href="index.jsp">index.jsp</a><br>
			<a href="firmAction.do?method=toAddEmp">add Emp</a><br>
		</h4>
		<br>
		<table border="1">
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>工资</td>
				<td>部门</td>
				<td>操作</td>
			</tr>
			<c:forEach var="e" items="${emps }">
				<tr>
					<td>${e.empno }</td>
					<td>${e.ename }</td>
					<td>${e.sal }</td>
					<td>${e.dept.dname }</td>
					<td>
						<a href="firmAction.do?method=toModifyEmp&empno=${e.empno}">修改</a>
						<a href="firmAction.do?method=removeEmp&empno=${e.empno}">删除</a>
					</td>
				</tr>				
			</c:forEach>
		</table>
	</div>
</body>
</html>