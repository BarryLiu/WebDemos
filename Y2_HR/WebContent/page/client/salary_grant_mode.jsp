<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
</head>

<body>
	<form action="/Y2_HR/client/clientAction!updatePbc" method="post">

		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--薪酬管理设置--薪酬发放方式设置
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="变更"
					class="BUTTON_STYLE1"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr>
				<td width="27%" class="TD_STYLE1">薪酬发放方式</td>
				<input type="hidden" name="pbc.attributeKind" value="薪酬发放方式" />
				<td width="22%" class="TD_STYLE1">
					<select class="INPUT_STYLE2" name="pbc.attributeName">
							<option value="一级机构发放方式">一级机构发放方式</option>
							<option value="二级机构发放方式">二级机构发放方式</option>
							<option value="三级机构发放方式">三级机构发放方式</option>
						</select>
				</td>
		</table>
	</form>
</body>
</html>
