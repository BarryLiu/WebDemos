<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>hr_middle</title>
		<style type="text/css">
			body {
				background-color:white;
				background-image: url(../images/11041R35400-19.jpg);
				background-repeat:no-repeat;
				background-position:130% 0;
				margin-left: 20px;
				margin-top: 20px;
			}
		</style>
		<script type="text/javascript"
			src="../javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="../javascript/jquery.messager.js">
		</script>
		<script type="text/javascript">
			$(function() {
				var currName=$("#currName").val();
				var currRoleName=$("#currRoleName").val();
				$.messager.show("<font style='font-family:宋体;'>消息提示","欢迎你："+currRoleName+" : "+currName+"！</font>",2000);
			});
		</script>
	</head>
	<body>
	<input id="currName" type="hidden" value="${currUser.userTrueName}">
	<input id="currRoleName" type="hidden" value="${currUser.sysRole.roleName}">
	</body>
</html>
