<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <title>My JSP 'filter_result.jsp' starting page</title>
    <%@include file="/page/header.jsp" %>
	 
		<script type="text/javascript">
		 
 
		
		function tick() {
			var now = new Date();
			var hours, minutes, seconds, noon;
			var intHours, intMinutes, intSeconds;
			intHours = now.getHours();
			intMinutes = now.getMinutes();
			intSeconds = now.getSeconds();
			if (intHours < 24) {
				hours = intHours+":";
				noon = "A.M.";
			} else {
				intHours = intHours - 24;
				hours = intHours + ":";
				noon = "P.M.";
			}
			if (intMinutes < 10) {
				minutes = "0"+intMinutes+":";
			} else {
				minutes = intMinutes+":";
			}
			if (intSeconds < 10) {
				seconds = "0"+intSeconds+" ";
			} else {
				seconds = intSeconds+" ";
			}
			timeString = hours+minutes+seconds;
			var now = new Date();
			
		  	//document.getElementById("nowTime").value = now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+timeString;
			//window.setTimeout("tick();", 100);
		}
		
		//load事件
		function check(){
			//获得系统当前时间的方法
		  	tick();					
		}
		
		function sf(){
			document.getElementById("passPasscomment").value="通过";
		}
		function ly(){
			document.getElementById("passPasscomment").value="不通过";
		}
		
		function search(){
			document.fm.submit();
		}
 		</script>
	</head>

	<body onload="check(),sf()">
		<form id="recruitAction!returnCheckList" name="fm" action="/Y2_HR/recruit/employ!returnCheckList" method="post" enctype="multipart/form-data">
		<input type="hidden" name="engageResume.id" value="<s:property value="engageResume.id"/>"/>
		<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--录用管理--录用审批  </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="radio"  name="erid" value="通过"  checked onclick="sf()">通过
						<input type="radio"  name="erid" value="不通过"   onclick="ly()">不通过
						<input type="button" value="确认" class="BUTTON_STYLE1"
							onclick="search();">
						<input type="button" value="返回" class="BUTTON_STYLE1" 
							onclick="history.back();">
							
					</td>
				</tr>
			</table>
		<input type="hidden" name="operate" value="doAdopt">
				<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
							<tr>
					<td class="TD_STYLE1" width="11%">
						职位分类
					</td>
					<td width="14%" class="TD_STYLE2">
					
						<input type="hidden" name="engageInterview.humanMajorKindId" value="<s:property value="engageInterview.humanMajorKindId"/>"/>
					   <input type="text" name="engageInterview.humanMajorKindName"
						   value="<s:property value="engageInterview.humanMajorKindName"/>" readonly="readonly" class="INPUT_STYLE2">
					
					</td>
					<td width="11%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="14%" class="TD_STYLE2">
					<input type="hidden" name="engageInterview.humanMajorId" value="<s:property value="engageInterview.humanMajorId"/>"/>
					 <input type="text" name="engageInterview.humanMajorName" value="<s:property value="engageInterview.humanMajorName"/>" readonly="readonly" class="INPUT_STYLE2">
				    </td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" >
						<input type="text" name="engageResume.engageType" value="<s:property value="engageResume.engageType"/>" readonly="readonly" class="INPUT_STYLE2">
					
					</td>
					
					<td width="10%" rowspan="6" colspan="2"  align="center">
						 
					</td>
					
				</tr>
				<tr>
				<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageInterview.humanName" value="<s:property value="engageInterview.humanName"/>" readonly="readonly" class="INPUT_STYLE2">
						
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
					<td   class="TD_STYLE2">
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
					<td class="TD_STYLE1" >
						手机
					</td>
					<td  class="TD_STYLE2" >
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
					<td   class="TD_STYLE2">
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
					<td class="TD_STYLE2"  > 
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
					<td class="TD_STYLE2" >
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
						<input type="text" name="engageResume.humanEducatedMajor" value="&#35745;&#31639;&#26426;" readonly="readonly" class="INPUT_STYLE2">
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
						<input type="text" name="engageResume.passChecker" value="<s:property value="engageResume.passChecker"/>" readonly="readonly" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1"><span style="font-size: 10.5pt; font-family: 宋体;"></span> 
						推荐时间
					</td>
					<td class="TD_STYLE2"> 
						<input type="text" name="engageResume.passCheckTime" value="<s:property value="engageResume.passCheckTime"/>" readonly="readonly" class="INPUT_STYLE2">	 
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.humanHistoryRecords" rows="4"  
						class="TEXTAREA_STYLE1" readonly="readonly"><s:property value=""/><s:property value="engageResume.humanHistoryRecords"/></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.remark" rows="4"
						   class="TEXTAREA_STYLE1"  readonly="readonly"><s:property value="engageResume.remark"/></textarea>
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						筛选推荐意见
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea name="engageResume.recomandation" rows="4"   class="TEXTAREA_STYLE1" readonly="readonly"><s:property value="engageResume.recomandation"/></textarea>
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						面试次数
					</td>
					<td class="TD_STYLE2">
					 	<input type="text"   name="engageInterview.interviewAmount" value="<s:property value="engageInterview.interviewAmount"/>" class="INPUT_STYLE2" readonly="readonly"/>
					</td>
					<td class="TD_STYLE1">
						形象评价
					</td>
					<td class="TD_STYLE2">
						 
				 <input type="text"  name="engageInterview.imageDegree" value="<s:property value="engageInterview.imageDegree"/>" class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
					<td class="TD_STYLE1">
						口才评价
					</td>
					<td class="TD_STYLE2">
					 
						 <input type="text"  name="engageInterview.nativeLanguageDegree" value="<s:property value="engageInterview.nativeLanguageDegree"/>" class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
					<td class="TD_STYLE1">
						外语口语能力
					</td>
					<td class="TD_STYLE1">
					 
						 <input type="text"  name="engageInterview.foreignLanguageDegree" value="<s:property value="engageInterview.foreignLanguageDegree"/>" class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						应变能力
					</td>
					<td class="TD_STYLE2">
					 
						<input type="text"  name="engageInterview.responseSpeedDegree" value="<s:property value="engageInterview.responseSpeedDegree"/>" class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
					<td class="TD_STYLE1">
						EQ
					</td>
					<td class="TD_STYLE2"> 
						<input type="text"  name="engageInterview.eqDegree" value="<s:property value="engageInterview.eqDegree"/>" class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
					<td class="TD_STYLE1">
						IQ
					</td>
					<td class="TD_STYLE2"> 
						 <input type="text"  name="engageInterview.iqDegree" value="<s:property value="engageInterview.iqDegree"/>" class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
					<td class="TD_STYLE1">
						综合素质
					</td>
					<td class="TD_STYLE1">
					 <input type="text"  name="engageInterview.multiQualityDegree" value="<s:property value="engageInterview.multiQualityDegree"/>"  class="INPUT_STYLE2" readonly="readonly"/>
				
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						面试人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageInterview.register" value="<s:property value="engageInterview.register"/>" readonly="readonly" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						面试时间
					</td>
					<td class="TD_STYLE2"> 
					<input type="text" name="engageInterview.registeTime" value="<s:property value="engageInterview.registeTime"/>" readonly="readonly" class="INPUT_STYLE2"/>
						  
					</td>
					<td class="TD_STYLE1">
						筛选人
					</td>
					<td class="TD_STYLE2">
					 <input type="text" name="engageInterview.checker" value="<s:property value="engageInterview.checker"/>" readonly="readonly" class="INPUT_STYLE2"/>
				 
					</td>
					<td class="TD_STYLE1">
						筛选时间
					</td>
					<td class="TD_STYLE2"> 
				  	<input type="text" name="engageInterview.checkTime" value="<s:property value="engageInterview.checkTime"/>"
							  id="nowTime" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
				 
				</tr>
				
				<tr>
					<td class="TD_STYLE1">
						录用申请审核意见
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea name="engageResume.passCheckcomment" class="TEXTAREA_STYLE1"
							rows="4" readonly="readonly" id="passCheckcomment"><s:property value="engageResume.passCheckcomment"/></textarea>
					</td>
				</tr>
				 
				<tr>
					<td class="TD_STYLE1">
						录用申请审批意见
					</td>
					<td class="TD_STYLE2" colspan="7">
						<textarea
							name="engageResume.passPasscomment" id="passPasscomment" class="TEXTAREA_STYLE1"
							rows="4" readonly="readonly">通过</textarea>
					</td>
				</tr>
			</table>
		</form>




	</body>
 
</html>