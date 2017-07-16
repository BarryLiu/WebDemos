<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>My JSP 'resume-details.jsp' starting page</title>

		<script type="text/javascript"
			src="../../../javascript/select.js">
		</script>

<%@include file="/page/header.jsp" %>

		<script type="text/javascript">
 			window.onload=check;
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
		  	document.getElementById("nowTime").value=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+timeString;
			window.setTimeout("tick();", 1000);
		}
		
		//load事件
		function check(){
			//获得系统当前时间的方法
		  	tick();					
		}
 		</script>
 		<script type="text/javascript">
	 		function search(){
	 		//document.getElementById("checkTime").value = document.getElementById("nowTime").value;  
	        document.humanfileForm.submit();
	 		}
 		</script>
	</head>

	<body>
		<form name="humanfileForm" method="post" action="/Y2_HR/recruit/resume!updateResume">
			<input type="hidden" value="<s:property value="engageResume.id"/>" name="engageResume.id"  >
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--简历管理--简历筛选--简历筛选编辑
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="推荐" class="BUTTON_STYLE1" onclick="search();"   >
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick=history.back(); >
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanMajorId">
							<option	value="<s:property value="engageResume.humanMajorKindId"/>">
								<s:property value="engageResume.humanMajorKindName"/>
								</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2" width="20%">
						<select name="engageResume.humanMajorId">
							<option	value="<s:property value="engageResume.humanMajorId"/>">
								<s:property value="engageResume.humanMajorName"/>
								</option>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="engageResume.engageType" class="SELECT_STYLE1">
							<option value="校园招聘" selected><s:property value="engageResume.engageType"/></option>  
						</select>
					</td>
					<td rowspan="6">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						
						<input type="text" readonly="readonly"
							value="<s:property value="engageResume.humanName"/>"
							name="engageResume.humanName" class="INPUT_STYLE2" />
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanSex" class="SELECT_STYLE1">
							<option	value="男" selected="selected"><s:property value="engageResume.humanSex"/></option>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanEmail"  readonly="readonly"
							value="<s:property value="engageResume.humanEmail"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanTelephone"  readonly="readonly"
							value="<s:property value="engageResume.humanTelephone"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanHomephone"  readonly="readonly"
							value="<s:property value="engageResume.humanHomephone"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanMobilephone"  readonly="readonly"
							value="<s:property value="engageResume.humanMobilephone"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="engageResume.humanAddress"  readonly="readonly"
							value="<s:property value="engageResume.humanAddress"/>"
							class="INPUT_STYLE2">
					</td>

					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanPostcode"  readonly="readonly"
							value="<s:property value="engageResume.humanPostcode"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanNationality" class="SELECT_STYLE1">
							<option value="&#20013;&#22269;">
								<s:property value="engageResume.humanNationality"/>
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanBirthplace"  readonly="readonly"
							value="<s:property value="engageResume.humanBirthplace"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanBirthday"  readonly="readonly"
							value="<s:property value="engageResume.humanBirthday"/>"
							class="INPUT_STYLE2" id="date_start">
					</td>

				</tr>
				<tr>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<select name="engageResume.humanRace" class="SELECT_STYLE1">
							<option
								value="&#27721;&#26063;">
								<s:property value="engageResume.humanRace"/>
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanReligion" class="SELECT_STYLE1">
							<option
								value="&#26080;">
								<s:property value="engageResume.humanReligion"/>
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="engageResume.humanParty" class="SELECT_STYLE1">
							<option	value="无"><s:property value="engageResume.humanParty"/></option>
						</select>
					</td>


				</tr>
				<tr>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanIdcard" readonly="readonly"
							value="<s:property value="engageResume.humanIdcard"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanAge" readonly="readonly"
							value="<s:property value="engageResume.humanAge"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						毕业院校
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanCollege"  readonly="readonly"
							value="<s:property value="engageResume.humanCollege"/>"
							class="INPUT_STYLE2" />
					</td>

					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanEducatedDegree"
							class="SELECT_STYLE1">
							<option
								value="&#22823;&#19987;">
								<s:property value="engageResume.humanEducatedDegree"/>
							</option>
						</select>
					</td>

				</tr>
				<tr>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanEducatedYears"
							class="SELECT_STYLE1">
							<option
								value="12">
								<s:property value="engageResume.humanEducatedYears"/>
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanEducatedMajor"
							class="SELECT_STYLE1">
							<option
								value="&#35745;&#31639;&#26426;">
								<s:property value="engageResume.humanEducatedMajor"/>
							</option>
						</select>
					</td>

					<td class="TD_STYLE1">
						薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.demandSalaryStandard" readonly="readonly"
							value="<s:property value="engageResume.demandSalaryStandard"/>"
							class="INPUT_STYLE2" />
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2">
					<input type="hidden" value="<s:property value="engageResume.registTime"/>" readonly="readonly" name="engageResume.registTime">
					 <s:property value="engageResume.registTime"/>
					</td>

				</tr>
				<tr>

					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanSpecility" class="SELECT_STYLE1">
							<option
								value="java"><s:property value="engageResume.humanSpecility"/>
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanHobby" class="SELECT_STYLE1">
							<option
								value="&#31726;&#29699;"><s:property value="engageResume.humanHobby"/>
							</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						推荐人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.passChecker"
							value="${currUser.userTrueName }"
							class="INPUT_STYLE2" />

					</td>
					<td class="TD_STYLE1">
						推荐时间
					</td>
					<td class="TD_STYLE2">
					<input type="text" name="engageResume.passCheckTime"
							  id="nowTime" readonly="readonly"
							class="INPUT_STYLE2">
						 
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td> 
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.humanHistoryRecords" rows="4" readonly="readonly"
							class="TEXTAREA_STYLE1"><s:property value="engageResume.humanHistoryRecords"/></textarea>
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.remark" rows="4" readonly="readonly"
							class="TEXTAREA_STYLE1"><s:property value="engageResume.remark"/></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						推荐意见
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.recomandation" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
	 
</html>


