<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
</head>
<body>
	<form method="post" action="../customiz/customizAction!findPublicChar">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--公共属性设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="添加"
					class="BUTTON_STYLE1"
					onclick="window.location.href='/Y2_HR/page/client/public_char_add.jsp';"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="49%" class="TD_STYLE1">属性种类</td>
				<td width="44%" class="TD_STYLE1">属性名称</td>
				<td width="7%" class="TD_STYLE1" align="center">删除</td>
			</tr>

			<c:forEach items="${pbcs }" var="pbc">
				<tr>
					<td class="TD_STYLE2">${pbc.attributeKind }</td>
					<td class="TD_STYLE2">${pbc.attributeName }</td>
					<td class="TD_STYLE2" align="center"><a href="/Y2_HR/client/clientAction!deletePbc?id=${pbc.id }">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<p>
	</form>
</body>
</html>
