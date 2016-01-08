<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
      
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
 		function mysubmit(){  
 		
 		if(document.getElementById("majorKindId").value=="--请选择--"){
 		alert("请选择职位种类");
 		return false;
 		}
 		if(document.getElementById("majorId").value=="--请选择--"){
 		alert("请选择职位");
 		return false;
 		}
 		if(document.getElementById("humanNationality").value=="--请选择--"){
 		alert("请选择国籍");
 		return false;
 		}
 		if(document.getElementById("humanRace").value=="--请选择--"){
 		alert("请选择民族");
 		return false;
 		}
 	 
 		if(document.getElementById("name").value==""){
 		alert("请填写姓名");
 		return false;
 		}
 		if(document.getElementById("phone").value==""){ 
	 		alert("请填写电话");
	 		return false;
 		}else if(isNaN(document.getElementById("phone").value)){
	 		alert("电话号码请填写数字");
	 		return false;
 		}
 		if(document.getElementById("card").value==""){
	 		alert("请填写身份证号码");
	 		return false;
 		} 
 		if(document.getElementById("birthday").value!=""){
	 		var str = document.getElementById("birthday").value; 
	 		var r = str.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/); 
	 		 if(r==null){
	 		 alert("请输入正确的日期格式：yyyy-MM-dd");
	 		return false;
	 		}
 		} 
 		if(document.getElementById("email").value!=""){
	 		var email=document.getElementById("email").value;
	 		if(email.indexOf(".")<=-1 || email.indexOf("@")<=-1){
	 		alert("Email格式不匹配，如：123@.com");
	 		return false;
	 		}  
 		}
 		if(document.getElementById("humanHomephone").value!=""){
	 		if(isNaN(document.getElementById("humanHomephone").value)){
	 		alert("家庭电话请填写数字");
	 		return false;
	 		}
 		}
 		if(document.getElementById("humanMobilephone").value!=""){
	 		if(isNaN(document.getElementById("humanMobilephone").value)){
	 		alert("手机请填写数字");
	 		return false;
	 		}
 		}
 		if(document.getElementById("humanAge").value!=""){
 			if(isNaN(document.getElementById("humanAge").value)){
	 		alert("年龄请填写数字");
	 		return false;
	 		}
 		}
 		document.fm.submit();
 		}
 		</script>
	</head>
	<body>
	<form id="recruitAction!saveEngageResume" name="fm" action="/Y2_HR/recruit/resume!saveEngageResume" method="post" enctype="multipart/form-data">
			<input type="hidden" name="engageResume.passCheckcomment" value="不通过"/>
			<input type="hidden" name="engageResume.passPasscomment" value="不通过"/>
	 		<input type="hidden" name="engageResume.checkStatus" value="1"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--简历管理--简历登记 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
					 
						<input type="button" value="提交" class="BUTTON_STYLE1" onclick="return mysubmit()">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
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
						 <input type="hidden"  id="humanMajorKindId" value="<s:property value="emajorRelease.majorKindName"/>" name="engageResume.humanMajorKindName" />
	
						<s:select list="majorKinds" value="0" headerKey="0" headerValue="--请选择--"
						 listValue="majorKindName" listKey="majorKindId" theme="simple" 
						  name="engageResume.humanMajorKindId" id="majorKindId" class="SELECT_STYLE1"></s:select>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2" width="20%"> 
				  
					 <input type="hidden"  name="engageResume.humanMajorName" value="<s:property value="emajorRelease.majorName"/>" id="majorName"/>
					 
						<select name="engageResume.humanMajorId" class="SELECT_STYLE1" id="majorId">
							<option value="--请选择--">--请选择--</option>
							<s:if test="emajorRelease != null">
								<option  selected="selected" value="<s:property value="emajorRelease.majorId"/>"><s:property value="emajorRelease.majorName"/></option>
							</s:if>
						</select>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2"> 
					<select name="engageResume.engageType" class="SELECT_STYLE1">
						<option value="社会招聘">社会招聘</option>
						<option value="学校招聘">学校招聘</option>
					</select>
					</td>
					<td rowspan="6" >
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						 <input type="text"  name="engageResume.humanName" id="name" class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select name="engageResume.humanSex"  class="SELECT_STYLE1"><option value="男">男</option>
							<option value="女">女</option></select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanEmail" id="email" class="easyui-validatebox"  data-options="required:true,validType:'email'">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
					电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanTelephone"  id="phone"    class="easyui-numberbox"  data-options="min:0,precision:0">
					</td>
					<td class="TD_STYLE1">
						家庭电话
					</td>
					<td class="TD_STYLE2">
					 <input type="text" name="engageResume.humanHomephone" id="humanHomephone"   class="easyui-numberbox"  data-options="min:0,precision:0">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanMobilephone" id="humanMobilephone"  class="easyui-numberbox"  data-options="min:0,precision:0">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="engageResume.humanAddress" value="" class="INPUT_STYLE2">
					</td>
					 
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="engageResume.humanPostcode" value="" class="INPUT_STYLE2">
					</td>
				</tr>
				 
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
					 <select name="engageResume.humanNationality" id="humanNationality"  class="SELECT_STYLE1">
							<option value="--请选择--">--请选择--</option> 
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
						<input type="text" name="engageResume.humanBirthplace" value="" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" colspan="2" class="TD_STYLE2">
						<input type="date" name="engageResume.humanBirthday" id="birthday" class="INPUT_STYLE2"  >
					</td>
					
				</tr>
				<tr>
				<td width="11%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2" width="14%">
				 	 <select name="engageResume.humanRace"  id="humanRace" class="SELECT_STYLE1">
							<option value="--请选择--">--请选择--</option> 
							
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '民族'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
							
					 </select>  
					</td>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
					   <select name="engageResume.humanReligion"   class="SELECT_STYLE1"> 
							
							<option value="无">无</option> 
							
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
					<td class="TD_STYLE2" colspan="2">
					   <select name="engageResume.humanParty"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '政治面貌'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
					 </select>  	  
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanIdcard" value="" id="card"  class="easyui-numberbox"  data-options="min:0,precision:0">
					</td>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.humanAge" id="humanAge"  class="easyui-numberbox"  data-options="min:0,precision:0">
					</td>
					<td class="TD_STYLE1">
						毕业院校
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="engageResume.humanCollege" class="INPUT_STYLE2"/>
					</td>
					
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
					  <select name="engageResume.humanEducatedDegree"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '学历'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
							
					 </select> 
					</td>
					
				</tr>
				<tr>
				<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
					   <select name="engageResume.humanEducatedYears"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
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
					   <select name="engageResume.humanEducatedMajor"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
							<s:iterator value="configPublicChars">
								<s:if test="attributeKind == '专业'">
									<option value="<s:property value="attributeName"/>"><s:property value="attributeName"/></option> 
								</s:if>
							</s:iterator>
					 </select>  
					</td>
					
					<td class="TD_STYLE1">
						薪酬要求
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="engageResume.demandSalaryStandard" id="demandSalaryStandard" class="INPUT_STYLE2" />
					</td>
					<td class="TD_STYLE1">
						注册时间
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="engageResume.registTime"
							  id="nowTime" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
					 
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
					   <select name="engageResume.humanSpecility"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
							
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
				     <select name="engageResume.humanHobby"   class="SELECT_STYLE1">
							<option value="">--请选择--</option> 
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
						<textarea name="engageResume.humanHistoryRecords" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
				 
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="engageResume.remark" rows="4" class="TEXTAREA_STYLE1"></textarea>
					</td>
				</tr>
			</table>
		 </form>



<script type="text/javascript">
$(function(){
	// 改变职位分类 ajax改变职位 职位名称 
	$("#majorKindId").change(function(){
		var majorKindText = $("#majorKindId").find("option:selected").text();
		$("#humanMajorKindId").val(majorKindText);
		
		var majorKind =$("#majorKindId").val();
		 $.get("/Y2_HR/recruit/position!findMajor",{"majorKindId":majorKind},function(x){
			 eval("var arr=" + x + ";");
				var mjrkind = $("#majorId");
				mjrkind.empty();
				mjrkind.append("<option value='--请选择--' selected='selected'>--请选择--</option>");
				for (var i = 0; i < arr.length; i++) {
					var major = arr[i];
					mjrkind.append("<option value='"+major.majorId+"'>"
									+ major.majorName
									+ "</option>");
				}
		}); 
	});
	

	$("#majorId").change(function(){
		var majorIdText = $("#majorId").find("option:selected").text();
		$("#majorName").val(majorIdText);
	});
	
	window.majorKind = function(id){
		var mk =document.getElementById("majorKindId");
		var  opts=mk.options;
		mk.options[id].selected="selected";
	}
});
setTimeout("majorKind('<s:property value='emajorRelease.majorId'/>');",200); 

function loadin(msg){
	if(msg!="" && msg!=null)
		alert(msg);
}
setTimeout("loadin('${addMsg}');",300); 
</script>

</body>
 
</html>

