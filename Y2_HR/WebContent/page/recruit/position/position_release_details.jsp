<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'position-release_details.jsp' starting page</title>
		
<%@include file="/page/header.jsp" %>
		<script type="text/javascript">
		function search(id){ 
		 // document.fm.submit();	
 		window.location.href="/Y2_HR/recruit/resume!register?id="+id;
		}
		</script>
 	</head>
	<body>
		<form id="recruitAction!toRegister" name="fm" action="/Y2_HR/recruit/position!toRegister" method="post" enctype="multipart/form-data">
			<input type="hidden" name="emajorRelease.mreId" value="531" />
			<table width="100%"> 
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--职位发布管理--职位发布查询--详细  </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="确认申请" onclick="search('<s:property value="emajorRelease.id"/>')" class="BUTTON_STYLE1" />
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
					<select name="emajorRelease.firstKindName" >
					<option value=""><s:property value="emajorRelease.firstKindName"/></option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
					<select name="emajorRelease.secondKindName" >
					<option value=""><s:property  value="emajorRelease.secondKindName"/></option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  >
						<select name="emajorRelease.thirdKindId" >
					<option value=""><s:property value="emajorRelease.thirdKindName"/></option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="emajorRelease.engageType"  class="SELECT_STYLE1">
						<option value="<s:property value="emajorRelease.engageType"/>"><s:property value="emajorRelease.engageType"/></option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<select name="emajorRelease.majorKindName" >
					<option value=""> <s:property value="emajorRelease.majorKindName"/></option>
						</select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="emajorRelease.majorName" >
					<option value=""> <s:property value="emajorRelease.majorName"/></option>
						</select>
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
						 <input type="text" name="emajorRelease.humanAmount" value="<s:property value="emajorRelease.humanAmount"/>" class="INPUT_STYLE2">
				
						</td>
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2"> 
							  <input type="text" name="emajorRelease.deadline" readonly
							class="INPUT_STYLE2" value="<s:property value="emajorRelease.deadline"/>">
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						登记人
					</td>
					<td  class="TD_STYLE2">
						 <input type="text" name="emajorRelease.register" value="<s:property value="emajorRelease.register"/>" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td   class="TD_STYLE2">
					<input type="text" name="emajorRelease.registTime"
							value="<s:property value="emajorRelease.registTime"/>" readonly="readonly"
							class="INPUT_STYLE2">
					  
						</td>
					
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位描述
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="emajorRelease.majorDescribe" rows="4" cols="100%" class="TEXTAREA_STYLE1" readonly="readonly" ><s:property value="emajorRelease.majorDescribe"/></textarea>
					</td>
					 
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="emajorRelease.engageRequired" rows="4"  cols="100%" class="TEXTAREA_STYLE1"  readonly="readonly" ><s:property value="emajorRelease.engageRequired"/></textarea>
					</td>
					 
				</tr>
			</table>
		</form>
	</body>
</html>


