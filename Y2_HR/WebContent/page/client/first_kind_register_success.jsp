<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
	<%@include file="/page/header.jsp"  %>
	</head>
	<body>
		<form method="post" action="configfilefirstkind.do">
			<table width="100%">
				<tr>
					<td colspan="2">
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--I级机构设置--I级机构添加
						</font>
					</td>
				</tr>
				<tr>
					<td width="49%">
						录入成功。
					</td>
					<td width="51%" align="right">
						<input type="button" value="继续录入" class="BUTTON_STYLE1"
							onclick="window.location.href='/Y2_HR/page/client/first_kind_register.jsp'">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="window.location.href='/Y2_HR/client/clientAction!findFirsts'">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
