<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
	<%@include file="/page/header.jsp"%>
	</head>

	<body>
		<form action="/Y2_HR/client/clientAction!findColumens" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--其他设置--关键字查询设置</font>
					</td>
				</tr>
			</table>
			<table width="100%" border="0">
				<tr class="TR_STYLE1">
					<td width="18%">
						请选择数据库表的名称
					</td>
					<td width="69%">
						<select name="tableName" id="tableComment"  class="SELECT_STYLE2">
						<option>请选择</option>
						<s:iterator value="tables">
							<option value="<s:property value="table_name"/>"><s:property value="table_comment"/></option>
						</s:iterator>
						</select>
					</td>
					<td width="13%">
						<input type="submit" value="开始" class="BUTTON_STYLE1">
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

