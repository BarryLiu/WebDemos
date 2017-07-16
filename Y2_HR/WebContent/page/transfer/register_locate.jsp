<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="/page/header.jsp"  %>
<script type="text/javascript"	src="/Y2_HR/javascript/register_locate.js"></script>
<script type="text/javascript">
	function sb(){
		window.myfrm.submit();
	}
</script>
</head>
<body>
	<form name="myfrm" method="post" action="/Y2_HR/page/transfer/register_list.jsp">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--调动管理--调动登记查询 </font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="查询" onclick="sb()"
					></td>
			</tr>
		</table>
		<input type="hidden" name="page.startPage" value="0">
		<table width="101%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284  bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="13%" class="TD_STYLE1">请选择员工所在I级机构</td>
				<td width="29%" class="TD_STYLE2">
				<select id="fstSel" name="humanFile.firstKindId"  onchange="findSecond()">
				<option value="0">-----请选择-----</option>
				<c:forEach items="${firsts }" var="first">
				<option value="${ first.firstKindId}">${first.firstKindName }</option>
				</c:forEach>
				</select>
				</td>
				<td width="13%" class="TD_STYLE1">请选择员工所在II级机构</td>
				<td width="45%" class="TD_STYLE2">
				<select style="width: 160px" name="humanFile.secondKindId"
					id="secondKind" size="1" class="SELECT_STYLE2" onchange="findThird()">
					<option value="0">全部</option>
				</select>
				<input type="hidden" name="firstKindId" id="firstKindId">
				</td>
				<td width="0%"></td>
			</tr>
			<tr class="TR_STYLE1">
				<td width="13%" class="TD_STYLE1">请选择员工所在III级机构</td>
				<td width="29%" class="TD_STYLE2"><select style="width: 160px"
					name="humanFile.thirdKindId" id="thirdKind" size="1"
					class="SELECT_STYLE2">
						<option value="0">全部</option>
				</select></td>
				<td height="18" class="TD_STYLE1">请输入建档时间</td>
				<td width="45%" class="TD_STYLE2"><input id="dd1" name="dd1" type="text" class="easyui-datebox" required="required"></input>至<input id="dd2" type="text" name="dd2" class="easyui-datebox" required="required"></input>  
					（YYYY-MM-DD）</td>
			</tr>
		</table>
	</form>
</body>
</html>


