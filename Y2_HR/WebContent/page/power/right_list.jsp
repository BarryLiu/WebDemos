<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>角色管理</title>
		<link rel="stylesheet"
			href="../../css/table.css" type="text/css"/>
			
		<%@include file="/page/header.jsp" %>
			
		<script type="text/javascript" src="/Y2_HR/javascript/right_list.js"></script>
		<script type="text/javascript">
			function doDelete(id) {
				if (confirm("确定删除此角色吗？")) {
					location.href = "/Y2_HR/urr/powerAction!roleDelete?sysRole.id=" + id;
				}
			}
			function doEdit(id){
				location.href='/Y2_HR/urr/powerAction!toRoleEdit?sysRole.id='+id;
			}
		</script>
	</head>
	<body>
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--权限管理--角色管理 </font>
				</td>
			</tr>
			<tr>
				<td>
					当前角色总数：<s:property value="count"/>例
				</td>
			</tr>
			<tr>
				<td align="right">
					<input type="button" value="添加角色" class="BUTTON_STYLE1" onclick="location.href='/Y2_HR/page/power/right_add.jsp'">
				</td>
			</tr>
		</table>
		
		
		<table width="100%" border="1" cellpadding=5 cellspacing=1 id="tb" class="TABLE_STYLE1"></table>
		
	</body>
	
</html>
