<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<%@include file="/page/header.jsp" %>
		<script type="text/javascript" src="/Y2_HR/javascript/selectAll.js"> </script>
		
		<script type="text/javascript">
		$(document).ready(function(){
			$("#table_name").change(function(){
				location.href="/Y2_HR/data/dataAction!loadCloumns?tableName="+$(this).val()+"&toGoSJsp="+$("#toGoSJsp").val();
			});
		});
		
		function loadTableName(inpName){
		  	var tbName = document.getElementById("table_name");	
			for(var i=0 ; i<tbName.options.length ; i++	){
				if(tbName.options[i].value==inpName){
					tbName.selectedIndex=i;
				}				
			}  
		}
		setTimeout("loadTableName('<s:property value='tableName'/>')", 200);
		
		function loadSuccessMsg(msg){
			if(msg==""){
				return;	
			}
			$.messager.alert("提示",msg);
		}
		setTimeout("loadSuccessMsg('<s:property value='successMsg'/>')", 150);
		</script>
		
	</head>
	<body>
		<form action="/Y2_HR/data/dataAction!initXml" method="post">
		<input type="hidden" id="inpName" value="<s:property value="tableName"/>">
		<input type="hidden" id="toGoSJsp"	value="xml_locate">
			
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--标准数据报表--Xml标准数据报表</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="确定" class="BUTTON_STYLE1"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td class="TD_STYLE1" colspan="4">
						请选择要导出的表格
						 <select id="table_name" name="tableName" >
							<option>请选择</option>
							<s:iterator value="tables">
								<option    value="<s:property value="table_name"/>"><s:property value="table_comment"/></option>
							</s:iterator>
						</select>
						 
						&nbsp;请选择要导出的字段
						<input type="button" id="choice" value="全选" class="BUTTON_STYLE1" />
					</td>
				</tr>
				<tbody id="fields">
					<tr>
						
								<% int i=0 ;%>
							<s:iterator value="columns"> 
								<td class="TD_STYLE2">
									<input type="checkbox"  name="field" value="<s:property value="columnName"/>" name="field"/> 
									<s:property value="columnComment"/>
								</td>
								 <% i++;
								 	if(i%4==0) out.write("</tr><tr>");	
								 %>
							</s:iterator>
						
					</tr>
				</tbody>
				<tfoot>
				</tfoot>
			</table>
		</form>
	</body>
</html>


