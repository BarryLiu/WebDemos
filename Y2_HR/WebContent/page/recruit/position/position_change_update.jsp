<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	 
		
<%@include file="/page/header.jsp" %>
		
<script type="text/javascript">
		function doDelete(id){
			if(window.confirm("确认删除该项纪录？")){
			window.location.href("/Y2_HR/recruit/position!positionChangeDelete?emajorRelease.id="+id)
			}
		}
		function doUpdate(id){
			window.location.href("/Y2_HR/recruit/position!positionReleaseChange?emajorRelease.id="+id)
		}
</script>

	</head>
	<body>
		<form method="post" action="/Y2_HR/recruit/position!positionChangeUpdate" name="fm">
		<input type="hidden" name="nextPage" id="page"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--职位发布管理--职位发布变更 
						</font>
					</td>
				</tr>
			 
			</table>
			当前可变更是职位发布总数：<s:property value="count"/>例
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="15%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="20%" class="TD_STYLE1">
						公司名称
					</td>
					<td width="10%" class="TD_STYLE1">
						招聘人数
					</td>
					<td width="20%" class="TD_STYLE1">
						发布时间
					</td>
					<td width="20%" class="TD_STYLE1">
						截止时间
					</td>
					<td width="8%" class="TD_STYLE1">
						修改
					</td>
					<td width="8%" class="TD_STYLE1">
						删除
					</td>
				</tr>
				<s:iterator value="emajorReleases">
					<tr>
						<td class="TD_STYLE2">
							<s:property value="majorName"/>
						</td>
						<td class="TD_STYLE2">
							<s:property value="thirdKindName"/>
						</td>
						<td class="TD_STYLE2">
							<s:property value="humanAmount"/>
						</td>
						<td class="TD_STYLE2"> 
							<s:property value="registTime"/>
						</td >
						<td class="TD_STYLE2"> 
							<s:property value="deadline"/>
						</td>
						<td class="TD_STYLE2">
							<a href="javascript:doUpdate(<s:property value="id"/>);">修改</a>
						</td>
						<td class="TD_STYLE2">
							<a href="javascript:doDelete(<s:property value="id"/>);">删除</a>
						</td>
					</tr>
				</s:iterator>		
			</table>
			<p>&nbsp;&nbsp;总数：<s:property value="count"/> 例 &nbsp;&nbsp;&nbsp;当前第<s:property value="page"/> 页 /每页显示 <s:property value="rows"/> 条 &nbsp;&nbsp;&nbsp;共 <s:property value="pageCount"/>  页 &nbsp;&nbsp;&nbsp;  
			<a href="javascript:up(<s:property value="page"/> )" >上一页</a> &nbsp;&nbsp;&nbsp;
			<a href="javascript:down(<s:property value="page"/>,<s:property value="pageCount"/>)" >下一页</a> &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 id="currPage" size=1   onkeyup='this.value=this.value.replace(/[^0-9]\D*$/,"")'> 页&nbsp;&nbsp;<input type="image" src="/Y2_HR//../images/go.bmp" onclick="tj('<s:property value="pageCount"/>')" width=18 height=18 border=0>
		</form>
		<script type="text/javascript">
		function up(currPage){  
			if(currPage<=1){
			document.getElementById("page").value = 1;
			}else{
			document.getElementById("page").value =currPage-1; 
			}
		 document.fm.submit();
		}
		
		function down(currPage,row){ 
		if(currPage>=row){
		document.getElementById("page").value = row;
		}else{
		document.getElementById("page").value =currPage+1; 
		}
		 document.fm.submit();
		}
		function tj(row){
	     document.getElementById("page").value = document.getElementById("currPage").value;
	     if(document.getElementById("currPage").value>row){
	   	  	alert("最大页数为"+row+"");
	 	  	document.getElementById("page").value =row;
		   	return ;
	     }
	     document.fm.submit();
	 	}
		</script>
	</body>
</html>
