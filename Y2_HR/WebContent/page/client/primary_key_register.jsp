<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
<script type="text/javascript">
function selAll(obj) {
	var cho = document.all.choice.value;
	if (cho == "全选")
		document.all.choice.value = "取消";
	else
		document.all.choice.value = "全选";

	for(var i=0;i<obj.elements.length;i++){
 			if(obj.elements[i].tagName.toLowerCase()=="input" &&obj.elements[i].type=="checkbox"){
 				if(cho == "全选")
 					obj.elements[i].checked=true;
 				else
 					obj.elements[i].checked=false;
 			}
 		}
 	}
 	function doRegister()
 	{
		document.forms[0].submit();
 	}
</script>
</head>

<body>
	<form action="/Y2_HR/client/clientAction!insertColumens" name="aa" method="post">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--客户化设置--其他设置--关键字查询设置</font>
				</td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1"> <input type="button" value="返回"
						class="BUTTON_STYLE1" onclick="history.back();"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td class="TD_STYLE1" colspan="4">请选择用于关键字查询的字段&nbsp; <input
					type="button" id="choice" onclick="selAll(document.aa)" value="全选" class="BUTTON_STYLE1" />
				</td>
			</tr>
			<input type="hidden" name="tableName" value="${datas[1].tableName }" />
			<c:forEach items="${datas }" var="data">
			<td class="TD_STYLE2"><input type="checkbox" name="columnName"
				value="${data.columnName}" checked="checked"> ${data.columnComment } </td>
			<input type="hidden" name="columnComment" value="${data.columnComment}" />
			</c:forEach>
		</table>
	</form>
</body>
</html>

