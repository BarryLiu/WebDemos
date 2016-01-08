<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
<script type="text/javascript" src="/Y2_HR/javascript/locate.js"></script>
<script type="text/javascript">
	function sb(){
		window.myfrm.submit();
	}
</script>
</head>
<body>
	<form method="post" name="myfrm" action="/Y2_HR/page/transfer/list.jsp">
		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--调动管理--调动查询 </font></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="查询"
					class="BUTTON_STYLE1" onclick="sb()"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择员工所在I级机构</td>
				<td width="84%" class="TD_STYLE2">
					<s:select name="majorChange.firstKindId" list="firsts"
						 headerKey="0" headerValue="全部"   value="0"
						listKey="firstKindId" listValue="firstKindName" size="4"
						theme="simple" cssClass="SELECT_STYLE2" onchange="findSecond()"
						id="fstSel" ></s:select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请选择员工所在II级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="majorChange.secondKindId" size="5" id="secondKind"
					class="SELECT_STYLE2" onchange="findThird()">
						<option value="0" selected="selected">全部</option>
				</select> 
				<input type="hidden" name="firstKindId" id="firstKindId">
				</td>
			</tr>
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择员工所在III级机构</td>
				<td width="84%" class="TD_STYLE2"><select
					name="majorChange.thirdKindId" class="SELECT_STYLE2" size="5"
					id="thirdKind">
						<option value="0" selected="selected">全部</option>
				</select>
				</td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请选择职位分类</td>
				<td width="84%" class="TD_STYLE2">
				<s:select list="majorKinds" name="majorChange.humanMajorKindId"
					 headerKey="0" headerValue="全部"   value="0"
					listKey="majorKindId" listValue="majorKindName" size="5"
					theme="simple" cssClass="SELECT_STYLE2" onchange="findMajor()"
					id="mjrkind" >
				</s:select>
			</tr>
			<tr class="TR_STYLE1">
				<td width="16%" class="TD_STYLE1">请选择职位名称</td>
				<td width="84%" class="TD_STYLE2">
				<select name="majorChange.humanMajorId" size="5" class="SELECT_STYLE2"
					id="majorName">
				</select></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">请输入建档时间</td>
				<td width="84%" class="TD_STYLE2"><input id="dd1" name="dd1" type="text" class="easyui-datebox" required="required"></input>至<input id="dd2" type="text" name="dd2" class="easyui-datebox" required="required"></input>  
					（YYYY-MM-DD）</td>
			</tr>
		</table>
	</form>
</body>
</html>

