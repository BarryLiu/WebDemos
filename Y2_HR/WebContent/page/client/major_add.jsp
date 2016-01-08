<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
<script type="text/javascript">
function change() {
	var se = document.getElementById("majorKindId");
	document.getElementById("majorKindName").value = se.options[se.selectedIndex].innerHTML;
}
</script>
</head>
<body>
	<form action="/Y2_HR/client/clientAction!insertMajor" method="post">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--职位设置--职位添加
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1"> <input type="button" value="返回"
						class="BUTTON_STYLE1" onclick="history.back();"></td>
			</tr>
		</table>

		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">

			<tr>
				<td class="TD_STYLE1" width="19%">职位分类名称</td>
				<td class="TD_STYLE2" width="81%"><select id="majorKindId"
					name="major.majorKindId" onchange="change()">
						<option value="0">--- 请选择职位分类名称 ---</option>
						<c:forEach items="${majorKinds}" var="majorkind">
							<option value="${majorkind.majorKindId }">${majorkind.majorKindName}</option>
						</c:forEach>
				</select></td>
				<input type="hidden" id="majorKindName" name="major.majorKindName" value=""/>
			</tr>
			<tr>
				<td class="TD_STYLE1" width="19%">职位编号</td>
				<td class="TD_STYLE2" width="81%"><input type="text"
					class="INPUT_STYLE1" name="major.majorId" /></td>
			</tr>
			<tr>
				<td class="TD_STYLE1" width="19%">职位名称</td>
				<td class="TD_STYLE2" width="81%"><input type="text"
					class="INPUT_STYLE1" name="major.majorName" /></td>
			</tr>
		</table>
	</form>
</body>
</html>

