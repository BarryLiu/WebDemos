<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
<script type="text/javascript">
	$().ready(function() {
						window.change2=function() {
							var se = document.getElementById("secondKindId");
							document.getElementById("secondKindName").value = se.options[se.selectedIndex].innerHTML;
						}
						window.findSecond = function() {
							var firstKindId = $("#firstKindId").val();
							$.get(
											"/Y2_HR/client/clientAction!findSeconds2",
											{
												"first.firstKindId" : firstKindId
											},
											function(x) {
												eval("var arr=" + x + ";");
												var sedSel = $("#secondKindId");
												sedSel.empty();
												sedSel
														.append("<option value='0' selected='selected'>全部</option>");
												for (var i = 0; i < arr.length; i++) {
													var second = arr[i];
													sedSel
															.append("<option value='"
										+ second.secondKindId
										+ "'>"
																	+ second.secondKindName
																	+ "</option>");
												}
												$("#firstKindName")
														.val(
																$(
																		"#firstKindId option:selected")
																		.text());
											});
						};
					});
</script>
</head>

<body>
	<form action="/Y2_HR/client/clientAction!insertThird" method="post">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--III级机构设置--III级机构添加
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
				<td width="19%" class="TD_STYLE1">I级机构名称</td>
				<td width="81%" class="TD_STYLE2"><select id="firstKindId"
					name="third.firstKindId" onchange="findSecond()">
						<option value="0">请选择I级机构名称...</option>
						<c:forEach items="${firsts}" var="first">
							<option value="${first.firstKindId}">${first.firstKindName }</option>
						</c:forEach>
				</select></td>
				<input type="hidden" id="firstKindName" name="third.firstKindName" value=""/>
			</tr>
			<tr>
				<td width="19%" class="TD_STYLE1">II级机构名称</td>
				<td width="81%" class="TD_STYLE2"><select
					name="third.secondKindId" onchange="change2()" id="secondKindId"
					class="INPUT_STYLE1">
				</select></td>
				<input type="hidden" id="secondKindName" name="third.secondKindName" value=""/>
			</tr>
			<tr>
				<td width="19%" class="TD_STYLE1">III级机构编号</td>
				<td width="81%" class="TD_STYLE2"><input type="text" class="INPUT_STYLE1"
						name="third.ThirdKindId" value="" /></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">III级机构名称</td>
				<td class="TD_STYLE2"><input type="text" class="INPUT_STYLE1"
					name="third.thirdKindName" /></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">销售责任人编号（多个编号之间请用"半角逗号"加"一个空格"隔开，如", "）</td>
				<td class="TD_STYLE2"><textarea rows="4" cols="120"
						class="TEXTAREA_STYLE1" name="third.thirdKindSaleId"></textarea></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">是否为零售店（是/否）</td>
				<td class="TD_STYLE2"><select name="third.thirdKindIsRetail">
						<option selected="selected" value="1">是</option>
						<option value="2">否</option>
				</select></td>
			</tr>
		</table>
	</form>
</body>
</html>