<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My JSP 'resume-choose.jsp' starting page</title>

<%@include file="/page/header.jsp"%>


<script type="text/javascript" src="/Y2_HR/javascript/comm/time.js"></script>
			
<script type="text/javascript" src="/Y2_HR/javascript/select.js"></script>

<script type="text/javascript">
	function search() {
		if(document.getElementById("majorKindId").value=="0"){
			document.getElementById("majorKindId").value=null;
		}
		if(document.getElementById("majorId").value=="0"){
			document.getElementById("majorId").value=null;
		}
		document.resumeChooseForm.submit();
	}
</script>
</head>

<body>
	<form id="recruitAction!findEngageResume?a=list"
		name="resumeChooseForm"
		action="/Y2_HR/recruit/resume!findEngageResume"
		method="post">
		<input type="hidden" name="engageResume.humanMajorKindName" id="majorKindName" />
		<input type="hidden" name="engageResume.humanMajorName" id="majorName"/>
		 <input	type="hidden" name="engageResume.checkStatus" value="1" />

		<table width="100%">
			<tr>
				<td><font color="black">您正在做的业务是：人力资源--招聘管理--简历管理--简历筛选
				</font></td>
			</tr>
			<tr>
				<td align="right"><input type="button" value="开始"
					class="BUTTON_STYLE1" onclick=search();></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">

			<tr>
				<td class="TD_STYLE1" width="30%">请选择职位分类</td>
				<td class="TD_STYLE2" width="30%">

				<s:select list="majorKinds" headerKey="0" headerValue="--请选择--" value="0"
				listKey="majorKindId" listValue="majorKindName" theme="simple"  size="5"
				name="engageResume.humanMajorKindId" multiple="multiple"
					style="width: 290; height: 100" id="majorKindId"
					class="SELECT_STYLE2">
				</s:select>
				<select name="engageResume.humanMajorId" multiple="multiple"
					style="width: 290; height: 100" id="majorId" size="5"
					class="SELECT_STYLE2">
						<option value="0">--请选择--</option>
				</select></td>
			</tr>

			<tr>
				<td class="TD_STYLE1" width="30%">请输入关键字</td>
				<td width="84%"><input type="text" name="utilBean.primarKey"
					value="" class="INPUT_STYLE2" /></td>
			</tr>

			<tr>
				<td class="TD_STYLE1" width="30%">请输入登记时间</td>
				<td width="84%" class="TD_STYLE2">
				<input type="hidden" name="utilBean.datePropertyName" value="engage_resume" />
				<input type="text" name="utilBean.startDate" onclick="aa('utilBean.startDate')" style="width: 14%" class="INPUT_STYLE2"> 
				至<input type="text" name="utilBean.endDate" style="width: 14%" class="INPUT_STYLE2" onclick="aa('utilBean.endDate')"> （YYYY-MM-DD）</td>
			</tr>
		</table>
	</form>
	

</body>

</html>
