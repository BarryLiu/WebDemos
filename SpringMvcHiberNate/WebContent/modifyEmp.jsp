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
		<h1>modifyEmp.jsp</h1>
			<a href="index.jsp">index.jsp</a><br>
		<br>
		<form action="firm/modifyEmp" method="post">
			<table border="1">
				<tr>
					<td>empno</td>
					<td><input name="empno" readonly="readonly" value="${emp.empno }"></td>
				</tr>
				<tr>
					<td>ename</td>
					<td><input name="ename" value="${emp.ename }"></td>
				</tr>
				<tr>
					<td>job</td>
					<td><input name="job" value="${emp.job }"></td>
				</tr>
				<tr>
					<td>mgr</td>
					<td><input name="mgr" value="${emp.mgr }"  maxlength="14" onkeyup='this.value=this.value.replace(/\D/gi,"")'>Integer</td>
				</tr>
				<tr>
					<td>hiredate</td>
					<td><input name="hiredate" value="${emp.hiredate }">yyyy-MM-dd</td>
				</tr>
				<tr>
					<td>sal</td>
					<td><input name="sal" type="number"  value="${emp.sal }">Number or Double</td>
				</tr>
				<tr>
					<td>comm</td>
					<td><input name="comm" type="number"  value="${emp.comm }">Number or Double</td>
				</tr>
				<tr>
					<td>dept</td>
					<td>
						<select name="deptno">
							<c:forEach var="d" items="${depts}">
								<option value="${d.deptno }">${d.dname}</option>
							</c:forEach>
						</select>
					</td>
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