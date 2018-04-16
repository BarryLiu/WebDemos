<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>modifyDept.jsp</h1>
			<a href="/SpringMvcHiberNate/index.jsp">index.jsp</a><br>
		<br>
		<form action="/SpringMvcHiberNate/firm/modifyDept" method="post">
			<table border="1">
				<tr>
					<td>deptno</td>
					<td><input name="deptno" readonly="readonly" value="${dept.deptno }"></td>
				</tr>
				<tr>
					<td>dname</td>
					<td><input name="dname" value="${dept.dname }"></td>
				</tr>
				<tr>
					<td>loc</td>
					<td><input name="loc" value="${dept.loc }"></td>
				</tr>
				<tr align="center" >
					<td colspan="2">
						<input type="submit"> 
						<input type="reset">
					<td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>