<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
</head>

<body>

	<form action="/Y2_HR/client/clientAction!updateSecond" method="post">

		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--II级机构设置--II级机构变更
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
			<input type="hidden" name="second.id" value=${second.id } class="INPUT_STYLE1" />
			<tr>
				<td width="19%" class="TD_STYLE1">I级机构名称</td>
				<td width="81%" class="TD_STYLE2"><input type="text"
					name="second.firstKindName" readonly="readonly" class="INPUT_STYLE1"
					value="${second.firstKindName }"></td>
			</tr>
			<tr>
				<td width="19%" class="TD_STYLE1">II级机构编号</td>
				<td width="81%" class="TD_STYLE2"><input type="text"
					name="second.secondKindId" readonly="readonly" class="INPUT_STYLE1"
					value="${second.secondKindId }"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">II级机构名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="second.secondKindName" readonly="readonly" class="INPUT_STYLE1"
					value="${second.secondKindName }"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">薪酬发放责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）
				</td>
				<td class="TD_STYLE2"><textarea rows="4" cols="120"
						name="second.secondSalaryId" class="TEXTAREA_STYLE1">${second.secondSalaryId }</textarea></td>
			</tr>

			<tr>
				<td class="TD_STYLE1">销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
				<td class="TD_STYLE2"><textarea rows="4" cols="120"
						name="second.secondSaleId" class="TEXTAREA_STYLE1">${second.secondSaleId }</textarea></td>
			</tr>
		</table>
	</form>
</body>
</html>
