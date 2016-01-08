<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
</head>

<body>
	<form action="../customiz/customizAction!findStandardDetails"
		method="post">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--薪酬管理设置--薪酬项目设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="添加"
					class="BUTTON_STYLE1"
					onclick="window.location.href='/Y2_HR/page/client/salary_item_register.jsp'"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr height="20">
				<td width="80%" class="TD_STYLE1" align="center">薪酬项目名称</td>
				<td width="20%" class="TD_STYLE1" align="center">删除</td>
			</tr>

			<c:forEach items="${ssds }" var="ssd">
			<tr height="20">
				<td class="TD_STYLE2">${ssd.itemName }</td>
				<td align="center" class="TD_STYLE2"><a href="/Y2_HR/client/clientAction!deleteSsd?id=${ssd.id}">删除</a></td>
			</tr>
			</c:forEach>
		</table>
		<br> <br>
				<th colspan="7" class="pager"></th>
	</form>
</body>
</html>
