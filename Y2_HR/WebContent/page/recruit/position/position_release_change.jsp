<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'position-change.jsp' starting page</title>
	
 
			
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
 	   function mySubmit(){  
 		   
 		  if(document.getElementsByName("emajorRelease.changer")[0].value==""){
 	 	       alert("请填写更改人");
 	 	       return ;
 	 	 }  
 		  if(document.getElementById("humanAmount").value==""){
 		 	   alert("请填写招聘人数");
 		 	       return ; 
 		 	  }    
 		 	  if(document.getElementById("date_start").value==""){
 		 	   alert("请选择截止日期");
 		 	       return ; 
 		 	  }    
  		 document.humanfileForm.submit();
 	}
  
 	</script>
</head>
	<body>
		<form id="recruitAction!applyPosition" name="humanfileForm" action="/Y2_HR/recruit/position!doPositionReleaseChange" method="post">
			<input type="hidden" name ="emajorRelease.id" value='<s:property value="emajorRelease.id"/>'/>
		
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--职位发布管理--职位发布变更 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="提交" class="BUTTON_STYLE1"
							onclick="mySubmit()">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
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
					<s:property value="emajorRelease.firstKindName"/>
						<input type="hidden" name ="emajorRelease.firstKindName" value='<s:property value="emajorRelease.firstKindName"/>'/>
						<input type="hidden" name="emajorRelease.firstKindId" value="<s:property value="emajorRelease.firstKindId"/>"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
					<s:property  value="emajorRelease.secondKindName"/>
					<input type="hidden" name="emajorRelease.secondKindName" value="<s:property  value="emajorRelease.secondKindName"/>"/>
					<input type="hidden" name="emajorRelease.secondKindId" value="<s:property  value="emajorRelease.secondKindId"/>"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  >
					<s:property value="emajorRelease.thirdKindName"/>
					<input type="hidden" name="emajorRelease.thirdKindName" value="<s:property value="emajorRelease.thirdKindName"/>"/>
					<input type="hidden" name="emajorRelease.thirdKindId" value="<s:property value="emajorRelease.thirdKindId"/>"/>
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
				 	<select name="emajorRelease.engageType" id="engageType" class="SELECT_STYLE1">  
							<option value="校园招聘" selected>校园招聘</option>  
							<option value="社会招聘" 
							<s:if test="emajorRelease.engageType =='社会招聘' ">selected</s:if>
							>社会招聘</option>  
							
					 </select>
				 	</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					 <s:property value="emajorRelease.majorKindName"/>
					 					
					<input type="hidden" name="emajorRelease.majorKindName" value="<s:property value="emajorRelease.majorKindName"/>"/>
					<input type="hidden" name="emajorRelease.majorKindId" value="<s:property value="emajorRelease.majorKindId"/>"/>
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
					
					 <s:property value="emajorRelease.majorName"/>
					
					<input type="hidden" name="emajorRelease.majorName" value="<s:property value="emajorRelease.majorName"/>"/> 
					<input type="hidden" name="emajorRelease.majorId" value="<s:property value="emajorRelease.majorId"/>"/>
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
					
						 <input type="text" id="humanAmount" name="emajorRelease.humanAmount" value="<s:property value="emajorRelease.humanAmount"/>" class="INPUT_STYLE2"  onkeyup='this.value=this.value.replace(/\D/gi,"")'>
						</td>
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2"> 
					<s:property value="emajorRelease.deadline"/>
						<input type="date" name="emajorRelease.deadline"  
							  class="INPUT_STYLE2" id="date_start">
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						变更人
					</td>
					<td  class="TD_STYLE2">
						 <input type="hidden" name="emajorRelease.register" value="<s:property value="emajorRelease.register"/>"  class="INPUT_STYLE2">
						 <input type="text" name="emajorRelease.changer" value="${currUser.userTrueName }"  class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						变更时间
					</td>
					<td   class="TD_STYLE2">
						 <input type="hidden" name="emajorRelease.registTime"
							value="<s:property value="emajorRelease.registTime"/>" 
							class="INPUT_STYLE2">
						 <input type="text" name="emajorRelease.changeTime"
							value="2015-11-18 19:26:58" id="nowTime"  
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
						<textarea name="emajorRelease.majorDescribe" rows="4" cols="100%" class="TEXTAREA_STYLE1"  ><s:property value="emajorRelease.majorDescribe"/></textarea>
					</td>
					 
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="emajorRelease.engageRequired" rows="4"  cols="100%" class="TEXTAREA_STYLE1"   ><s:property value="emajorRelease.engageRequired"/></textarea>
					</td>
				</tr>
			</table>
		</form>




	</body>
 
</html>
