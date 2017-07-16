<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'interview-register.jsp' starting page</title>

<%@include file="/page/header.jsp" %>
	<script type="text/javascript"
			src="/Y2_HR/javascript/comm/time.js"></script>

 <script type="text/javascript">
 	function search(){ 
 		if(document.getElementById("register").value==""){
 		 	alert("请选择面试人");
 		 	return ;
 		 }
 		if(document.getElementsByName("engageInterview.interviewComment")[0].value==""){
 		 	alert("请填写面试评价");return;
 		 }
 	if(document.getElementById("date").value==""){
 	alert("请选择面试时间");
 	}else{
 	document.interviewForm.submit();
 	}}
 </script>
	</head>

	<body >
		<form id="recruitAction!toList" name="interviewForm" action="/Y2_HR/recruit/interview!toList" method="post">
		<input type="hidden" name="operate" value="doAdopt">
		<input type="hidden" name="engageInterview.checkStatus" value="1"/>
		<input type="hidden" name="engageInterview.checkComment" value=""/>
		 
		<input type="hidden" name="engageInterview.result" value="完成"/>
		<input type="hidden" name="engageInterview.resumeId" value="<s:property value="engageResume.id"/>"/>
	    <input type="hidden" name="engageResume.id" value="<s:property value="engageResume.id"/>"/>
		<input type="hidden" name="engageInterview.interviewStatus" value="1"/>

		<input type="hidden" name="engageInterview.id" value="<s:property value="engageInterview.id"/>"/>
		
			<table width="100%">
				<tr>
					<td>
						
						<font color="black">您正在做的业务是：人力资源--招聘管理--面试管理--面试结果登记  </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="面试登记" class="BUTTON_STYLE1"
							onclick="search();">
						<input type="button" value="返回" class="BUTTON_STYLE1" 
							onclick="history.back();">
							
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="10%">
						职位分类
					</td>
					<td width="10%" class="TD_STYLE2">
					<input type="hidden" name="engageInterview.humanMajorKindId" value="<s:property value="engageResume.humanMajorKindId"/>"/>
					<input type="text" name="engageInterview.humanMajorKindName" value="<s:property value="engageResume.humanMajorKindName"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td width="10%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="15%" class="TD_STYLE2">
						<input type="hidden" name="engageInterview.humanMajorId" value="<s:property value="engageResume.humanMajorId"/>"/>
						<input type="text" name="engageInterview.humanMajorName" value="<s:property value="engageResume.humanMajorName"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td width="10%" class="TD_STYLE1">
						招聘类型
					</td>
					<td width="20%" class="TD_STYLE2" colspan="2">
						<input type="text" name="engageResume.engageType" value="<s:property value="engageResume.engageType"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					
					<td width="10%" rowspan="6" align="center">
						 
					</td>
					
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageInterview.humanName" value="<s:property value="engageResume.humanName"/>" readonly="readonly" class="INPUT_STYLE2">
						
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanSex" value="<s:property value="engageResume.humanSex"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanEmail" value="<s:property value="engageResume.humanEmail"/>"  readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						电话号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanTelephone" value="<s:property value="engageResume.humanTelephone"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanHomephone" value="<s:property value="engageResume.humanHomephone"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanMobilephone" value="<s:property value="engageResume.humanMobilephone"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="engageResume.humanAddress" value="<s:property value="engageResume.humanAddress"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanPostcode" value="<s:property value="engageResume.humanPostcode"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanNationality" value="<s:property value="engageResume.humanNationality"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanBirthplace" value="<s:property value="engageResume.humanBirthplace"/>"  readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td class="TD_STYLE2" colspan="2"> 
						<input type="text" name="engageResume.humanBirthday" value="<s:property value="engageResume.humanBirthday"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				
				<tr>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<input type="text" name="engageResume.humanRace" value="<s:property value="engageResume.humanRace"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanReligion" value="<s:property value="engageResume.humanReligion"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2" colspan="2">
						<input type="text" name="engageResume.humanParty" value="<s:property value="engageResume.humanParty"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>

					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanIdcard" value="<s:property value="engageResume.humanIdcard"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanAge" value="<s:property value="engageResume.humanAge"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						毕业学校
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanCollege" value="<s:property value="engageResume.humanCollege"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1" width="10%">
						学历
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanEducatedDegree" value="<s:property value="engageResume.humanEducatedDegree"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanEducatedYears"  value="<s:property value="engageResume.humanEducatedYears"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanEducatedMajor" value="<s:property value="engageResume.humanEducatedMajor"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.demandSalaryStandard" value="<s:property value="engageResume.demandSalaryStandard"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="engageResume.registTime" value="<s:property value="engageResume.registTime"/>" readonly="readonly" class="INPUT_STYLE2">
					
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanSpecility" value="<s:property value="engageResume.humanSpecility"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanHobby" value="<s:property value="engageResume.humanHobby"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1"><span style="font-size: 10.5pt; font-family: 宋体;"></span> 
						推荐人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageInterview.checker" value="<s:property value="engageResume.humanName"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1"><span style="font-size: 10.5pt; font-family: 宋体;"></span> 
						推荐时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="engageInterview.checkTime" value="<s:property value="engageResume.humanName"/>" readonly="readonly" class="INPUT_STYLE2">
						 
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.humanHistoryRecords" rows="4"  
						class="TEXTAREA_STYLE1" readonly="readonly"><s:property value="engageResume.humanHistoryRecords"/>
						</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.remark" rows="4"   class="TEXTAREA_STYLE1"  readonly="readonly"><s:property value="engageResume.remark"/>
						</textarea>
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						推荐意见
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea name="engageResume.recomandation" rows="4"
						 class="TEXTAREA_STYLE1" readonly="readonly"><s:property value="engageResume.recomandation"/></textarea>
					</td>
				</tr>
				
				
				<tr>
					<td class="TD_STYLE1">
						面试次数
					</td>
					<td class="TD_STYLE2">
					<input type="hidden" value="<s:property value="engageInterview.interviewAmount"/>" name="engageInterview.interviewAmount"/>
						<input type="text"   value="第<s:property value="engageInterview.interviewAmount"/>次面试" class="INPUT_STYLE2" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						形象评价
					</td>
					<td class="TD_STYLE2">
						<select name="engageInterview.imageDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						口才评价
					</td>
					<td class="TD_STYLE2">
						<select name="engageInterview.nativeLanguageDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						外语口语能力
					</td>
					<td class="TD_STYLE1">
						<select name="engageInterview.foreignLanguageDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						应变能力
					</td>
					<td class="TD_STYLE2">
						<select name="engageInterview.responseSpeedDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						EQ
					</td>
					<td class="TD_STYLE2">
						<select name="engageInterview.eqDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						IQ
					</td>
					<td class="TD_STYLE2">
						<select name="engageInterview.iqDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						综合素质
					</td>
					<td class="TD_STYLE1">
						<select name="engageInterview.multiQualityDegree" class="SELECT_STYLE1">
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						面试人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageInterview.register" value="${currUser.userTrueName }" id="register" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						面试时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="engageInterview.registeTime"  onclick="aa('engageInterview.registeTime')"
							  class="INPUT_STYLE2"  id="date" >
						 
						
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						面试评价
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea
							name="engageInterview.interviewComment" class="TEXTAREA_STYLE1" id="interviewComment"
							rows="4"></textarea>
					</td>
				</tr>
			</table>
		</form>

	</body>
 
</html>
