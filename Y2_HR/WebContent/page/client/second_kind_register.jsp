<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
</head>

<script type="text/javascript">
	function check() {
		if (document.getElementById("firstKind.ffkId").value == 0) {
			alert("请选择I级机构名称!!!");
			return false;
		}
		if (document.getElementById("secondKind.secondKindName").value == "") {
			alert("II级机构名称不能为空!!!");
			return false;
		}
		if (document.getElementById("secondKind.secondSalaryId").value == "") {
			alert("薪酬发放责任人编号不能为空!!!");
			return false;
		}
		if (document.getElementById("secondKind.secondSaleId").value == "") {
			alert("销售责任人编号不能为空!!!");
			return false;
		}
		document.forms[0].submit();
	}
	function change() {
		var se = document.getElementById("firstKindId");
		document.getElementById("firstKindName").value = se.options[se.selectedIndex].innerHTML;
	}
</script>
<body>
	<form action="/Y2_HR/client/clientAction!insertSecond" method="post">
			<table width="100%">
				<tr>
					<td><font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--II级机构设置--II级机构添加
					</font></td>
				</tr>
				<tr>
					<td align="right"><input type="submit" value="提交"
						class="BUTTON_STYLE1"> <input type="button" value="返回"
							class="BUTTON_STYLE1" onclick="history.back();"></td>
				</tr>
			</table>


			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="19%" class="TD_STYLE1">I级机构名称</td>
					<td width="81%" class="TD_STYLE2"><select id="firstKindId"
						name="second.firstKindId" onchange="change()">
							<option value="0">请选择I级机构名称...</option>
							<c:forEach items="${firsts }" var="first">
								<option value="${ first.firstKindId}">${first.firstKindName }</option>
							</c:forEach>
					</select>
					</td>
					<input type="hidden" id="firstKindName" name="second.firstKindName" value=""/>
				</tr>
				<tr>
					<td width="19%" class="TD_STYLE1">II级机构编号</td>
					<td width="81%" class="TD_STYLE2"><input type="text"
						name="second.secondKindId" value="" class="INPUT_STYLE1"></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">II级机构名称</td>
					<td class="TD_STYLE2"><input type="text" class="INPUT_STYLE1"
						name="second.secondKindName" value="" /></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
					</td>
					<td class="TD_STYLE2"><textarea rows="4" cols=""
							class="TEXTAREA_STYLE1" name="second.secondSalaryId"></textarea></td>
				</tr>
				<tr>
					<td class="TD_STYLE1">销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
					<td class="TD_STYLE2"><textarea rows="4" cols=""
							class="TEXTAREA_STYLE1" name="second.secondSaleId"></textarea></td>
				</tr>
			</table>
	</form>
</body>
</html>

