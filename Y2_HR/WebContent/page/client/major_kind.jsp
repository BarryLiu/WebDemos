<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<%@include file="/page/header.jsp"  %>
	</head>

	<body>
		<form method="post" action="../customiz/customizAction!findMajorKind">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位分类设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='/Y2_HR/page/client/major_kind_add.jsp';">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="46%" class="TD_STYLE1">
						职位分类编号
					</td>
					<td width="47%" class="TD_STYLE1">
						职位分类名称
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>

				<c:forEach items="${majorKinds }" var="majorkind">
				<tr>
					<td class="TD_STYLE2">
						${majorkind.majorKindId }
					</td>
					<td class="TD_STYLE2">
						${majorkind.majorKindName }
					</td>
					<td class="TD_STYLE2">
						<a href="/Y2_HR/client/clientAction!deleteMajorKind?id=${majorkind.majorKindId}">删除</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			<p>
		</form>
	</body>
</html>
