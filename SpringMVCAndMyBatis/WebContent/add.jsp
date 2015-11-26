<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>add.jsp</h1>
		<form action="/SpringMVCAndMyBatis/user/add" method="post">
			<table border="1">
				<tr>
					<td>用户名：</td>
					<td><input name="userName" ></td>
				</tr>
				<tr>
					<td>用户密码：</td>
					<td><input name="password" ></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交"></td>
				</tr>
			</table>		
		</form>
	</div>
</body>
</html>