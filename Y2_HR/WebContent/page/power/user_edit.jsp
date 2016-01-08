<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>编辑用户</title>
		<%@include file="/page/header.jsp" %>
		<script type="text/javascript" src="/Y2_HR/javascript/user_add.js"></script>
		
	</head>
	<body>
		<form id="powerAction!doModifyUser" name="powerAction!doModifyUser" action="/Y2_HR/urr/powerAction!doUserEdit" method="post">
			<input type="hidden" name="users.id" value="<s:property value="users.id"/>">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--权限管理--编辑用户</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" id="powerAction!doModifyUser_0" value="&#20445;&#23384;" class="BUTTON_STYLE1"/>

						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">用户名称</td>
					<td class="TD_STYLE2">
					
						<input type="text" value="<s:property value="users.userName"/>" id="userName" name="users.userName"/>
						<input type="hidden" name="users.userId" value="<s:property value="users.id"/>"/>
					</td>
					<td class="TD_STYLE1">用户密码</td>
					<td class="TD_STYLE2">
						<input type="password" value="<s:property value="users.userPassword"/>" id="userPassword" name="users.userPassword"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">真实姓名</td>
					<td class="TD_STYLE2">
						<input type="text" value="<s:property value="users.userTrueName"/>" id="userTrueName" name="users.userTrueName"/>
					</td>
					<td class="TD_STYLE1">用户身份</td>
					<td class="TD_STYLE2">
						<select name="users.userRoleId" id="powerAction!doModifyUser_users_sysRole_roleId">
								<s:iterator value="roles">
									
									<option value="<s:property value="id"/>" <s:if test="users.userRoleId == id">selected="selected"</s:if> ><s:property value="roleName"/></option>
								</s:iterator>
					</select>

					</td>
				</tr>
			</table>
		</form>




	</body>
</html>
