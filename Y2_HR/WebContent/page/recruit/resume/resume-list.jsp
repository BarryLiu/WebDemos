<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'resume-list.jsp' starting page</title>
		
<%@include file="/page/header.jsp" %>

	  </head>
	<body>
	
	<!-- 中转的表单数据 -->
	<input type="hidden" id="humanMajorKindId" value="${param['engageResume.humanMajorKindId']}">
	<input type="hidden" id="humanMajorId" value="${param['engageResume.humanMajorId']}">
	<input type="hidden" id="primarKey" value="${param['utilBean.primarKey']}">
	<input type="hidden" id="datePropertyName" value="${param['utilBean.datePropertyName']}">
	<input type="hidden" id="startDate" value="${param['utilBean.startDate']}">
	<input type="hidden" id="endDate" value="${param['utilBean.endDate']}">
		
		
		<input type="hidden" name="utilBean.currPage" id="page"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--简历管理--简历筛选--简历筛选列表 
						</font>
					</td>
				</tr>
			  <tr>
					<td align="right"> 
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table> 
			
			<table id="tb" width="100%" border="1" cellpadding=5 cellspacing=1
				class="TABLE_STYLE1"></table>
		<script type="text/javascript" src="/Y2_HR/javascript/resume_list.js"></script>
<script type="text/javascript">
	function resumeDel(id){
		alert(id);
		location.href="/Y2_HR/recruit/resume!deleteResumeById?jspName=resume_list&resumeId="+id;
	}
</script>
	</body>
</html>
