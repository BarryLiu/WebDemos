<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
	<%@include file="/page/header.jsp" %>
	<script type="text/javascript"	src="/Y2_HR/javascript/query_locate1.js"></script>
	</head>

	<body>
		<form method="post" action="/Y2_HR/page/profile/change_list.jsp">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案变更 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="查询" class="BUTTON_STYLE1"/>
						<input type="button" value="搜索" class="BUTTON_STYLE1"
							onclick="location.href='change_keywords.html'">
						<input type="hidden" name="result" value="toChangeList"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在I级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						 <s:select name="humanFile.firstKindId" list="firsts"
						 headerKey="0" headerValue="全部"   value="0"
						listKey="firstKindId" listValue="firstKindName" size="4"
						theme="simple" cssClass="SELECT_STYLE2" onchange="findSecond()"
						id="fstSel" ></s:select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择员工所在II级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select
					name="humanFile.secondKindId" size="5" id="secondKind"
					class="SELECT_STYLE2" onchange="findThird()">
						<option value="0" selected="selected">全部</option>
				</select> 
				<input type="hidden" name="firstKindId" id="firstKindId">
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在III级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanFile.thirdKindId" class="SELECT_STYLE2" size="5" id="thirdKind">
							<option value="" selected="selected">
								全部
							</option>
							
								<option value="1353319130551">外包公司</option>
							
								<option value="1353319150238">软件股份有限公司</option>
							
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择职位分类
					</td>
					<td width="84%" class="TD_STYLE2">
						<s:select list="majorKinds" name="humanFile.humanMajorKindId"
					 headerKey="0" headerValue="全部"   value="0"
					listKey="majorKindId" listValue="majorKindName" size="5"
					theme="simple" cssClass="SELECT_STYLE2" onchange="findMajor()"
					id="mjrkind" >
						</s:select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择职位名称
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanFile.humanMajorId" size="5" class="SELECT_STYLE2"
							id="majorName">
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input type="text" name="utilBean.startDate" readonly
							style="width: 14%" class="INPUT_STYLE2" id="date_start">
						至
						<input type="text" name="utilBean.endDate" readonly="readonly"
							style="width: 14%" class="INPUT_STYLE2" id="date_end">
						<input type="hidden" name="utilBean.datePropertyName" value="registTime"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
