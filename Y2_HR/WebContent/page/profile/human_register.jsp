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
		<form method="post" action="/Y2_HR/page/profile/register_choose_picture.jsp">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2"><s:select name="humanFile.firstKindId" list="firsts"
						 headerKey="0" headerValue="全部"   value="0" 
						listKey="firstKindId" listValue="firstKindName"  
						theme="simple" cssClass="SELECT_STYLE1" onchange="findSecond()"
						id="fstSel" ></s:select>
						<input type="hidden" name="humanFile.firstKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						<select name="humanFile.secondKindId" class="SELECT_STYLE1" id="secondKind"  onchange="findThird()">
							<option value="0">请选择</option>
						</select>
						<input type="hidden" name="humanFile.secondKindName"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2">
						<select name="humanFile.thirdKindId" class="SELECT_STYLE1" id="thirdKind">
							<option value="0">请选择</option>
						</select>
						<input type="hidden" name="humanFile.thirdKindName"/>
					</td>
					<td rowspan="5" style="text-align: center;">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						<s:select list="majorKinds" name="humanFile.humanMajorKindId"
							 headerKey="0" headerValue="全部"   value="0"
							listKey="majorKindId" listValue="majorKindName" 
							theme="simple" cssClass="SELECT_STYLE1" onchange="findMajor()"
							id="mjrkind" >
						</s:select>
						<input type="hidden" name="humanFile.humanMajorKindName"/>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanMajorId" class="SELECT_STYLE1" id="majorName">
						</select>
						<input type="hidden" name="humanFile.hunmaMajorName" />
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select name="humanFile.humanProDesignation" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '职称'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" id="humanName" name="humanFile.humanName" value="<s:property value="engageResume.humanName"/>"
							class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanSex" class="SELECT_STYLE1">
							
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanEmail" id="humanEmail" value="<s:property value="engageResume.humanEmail"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanTelephone" id="humanTelephone" value="<s:property value="engageResume.humanName"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanQq" id="humanQq" value="<s:property value="engageResume.humanName"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanMobilephone" id="humanMobilephone" value="<s:property value="engageResume.humanMobilephone"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanFile.humanAddress" value="<s:property value="engageResume.humanAddress"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanFile.humanPostcode" value="<s:property value="engageResume.humanPostcode"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanNationality" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '国籍'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanBirthplace" value="<s:property value="engageResume.humanBirthplace"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanFile.humanBirthday" readonly="readonly" value="<s:property value="engageResume.humanBirthday"/>"
							class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
						<select name="humanFile.humanRace" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '民族'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanReligion" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '宗教信仰'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanParty" class="SELECT_STYLE1"> 
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '政治面貌'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanIdCard" id="humanIdCard" value="<s:property value="engageResume.humanName"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanSocietySecurityId" value="<s:property value="engageResumeumanName"/>"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanAge" id="humanAge" value="<s:property value="engageResume.humanAge"/>"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanEducatedDegree" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '学历'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanEducatedYears" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '教育年限'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanEducatedMajor" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '专业'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						薪酬标准
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.salaryStandardId" class="SELECT_STYLE1">
							<option>薪酬标准1</option>
							<option>薪酬标准2</option>
						</select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanBank"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.humanAccount"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.register" value="${currUser.userTrueName }"
							readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						建档时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanFile.registTime" id="create_time" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanSpeciality" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '特长'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanFile.humanHobby" class="SELECT_STYLE1">
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '爱好'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
						</select>
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
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFile.humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFile.humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFile.remark" rows="4" class="TEXTAREA_STYLE1"> </textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

