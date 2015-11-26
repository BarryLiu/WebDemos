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
		<h1>All Users</h1>
		<h4><a href="/SpringMVCAndMyBatis/add.jsp">添加用户</a></h4>
		<table border="1">
			<tr>
				<td>编号</td>
				<td>用户名</td>
				<td>密码</td>
				<td>头像路径</td>
				<td>操作</td>
			</tr>
			<c:forEach var="u" items="${users }">
				<tr>
					<td>${u.userId }</td>
					<td>${u.userName }</td>
					<td>${u.password }</td>
					<td>${u.filePath }</td>
					<td>
						<a href="/SpringMVCAndMyBatis/user/toModify?userId=${u.userId }">修改</a>
						<a href="/SpringMVCAndMyBatis/user/remove?userId=${u.userId }">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
