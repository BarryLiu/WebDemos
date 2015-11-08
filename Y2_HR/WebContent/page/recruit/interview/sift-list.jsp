<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'sift-list.jsp' starting page</title>
    
	<%@include file="/page/header.jsp" %>
	



</head>

<body>
	
	<!-- 中转的表单数据 -->
	<input type="hidden" id="humanMajorKindId" value="">
	<input type="hidden" id="humanMajorId" value="">
	<input type="hidden" id="primarKey" value="s">
	<input type="hidden" id="datePropertyName" value="s">
	<input type="hidden" id="startDate" value="">
	<input type="hidden" id="endDate" value="">
	
		<form method="post" name="fm" action="/HR_Fist/recruit/recruitAction!toSiftList?str=sift">
				<input type="hidden" name="utilBean.currPage" id="page"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--面试管理--面试筛选--面试结果列表 
						</font>
					</td>
				</tr>
			  <tr>
					<td align="right"> 
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table> 
			
			<table width="100%" border="1" id="tb" cellpadding=0 cellspacing=1
				class="TABLE_STYLE1">
			</table>
				
		</form>
		
		
		
		<script type="text/javascript">
		$(document).ready(function() {
			$('#tb').datagrid({
				url : '/Y2_HR/recruit/interview!loadInterViewList',
				
				queryParams :{
					"engageResume.humanMajorKindId": $("#humanMajorKindId").val(),
					"engageResume.humanMajorId": $("#humanMajorId").val(),
					"utilBean.primarKey": $("#primarKey").val(),
					"utilBean.datePropertyName": $("#datePropertyName").val(),
					"utilBean.startDate": $("#endDate").val(),
					"utilBean.endDate": $("#endDate").val()
				},
				
				columns : [ [ {
					field : "resumeId",
					title : "档案编号",
					width : 120
				}, {
					field : "humanName",
					title : "姓名",
					width : 120
				},  {
					field : "humanMajorKindName",
					title : "职位分类",
					width : 120,
					// row参数代表整个一行的数据(JSON格式)
					// 格式化这一列的值
					// 这一列的每一个单元格在展示的时候都会经过这个函数来处理
					// 具体展示在单元格中的数据由函数的返回值决定
//					formatter : function(value, row, index) {
//						return row.firstKind.firstKindName;
//					}
				}, {
					field : "humanMajorName",
					title : "职位名称",
					width : 120
				} , {
					field : "interviewAmount",
					title : "面试次数",
					width : 120
				} , {
					field : "registeTime",
					title : "面试时间",
					width : 120 
				}, {
					field : "multiQualityDegree",
					title : "综合素质 ",
					width : 120 
				}, {
					field : "筛选",
					title : "筛选",
					width : 120,
					formatter : function(value, row, index) {
						var  status="<a href='/Y2_HR/recruit/interview!interviewSift?engageResume.id="+row.resumeId+"' >筛选</a>";
						return status;
					}
				} ] ],
				pagination :true,
				rownumbers :true,
				singleSelect: true,
				pageSize :5,
				pageList :[15,10,5],
				toolbar : [ {
					text: '复核',
					iconCls : 'icon-edit',
					handler : function() {
						// 获取被选中的那一行数据(JSON)
						var row = $("#tb").datagrid("getSelected");
						if(row.checkStatus==1){
						}else{
							location.href='/Y2_HR/recruit/resume!resumeDetails?engageResume.id='+row.resumeId;
						}
						
					}
				}, {
					text: '添加',
					iconCls : 'icon-add',
					handler : function() {
						location.href="/Y2_HR/recruit/resume!register";
					}
				},{
					text:'删除',
					iconCls : 'icon-remove',
					handler : function() {
						$.messager.confirm("提示", "确认要删除吗？", function(flag){
							if(flag){
								alert('确定');
							}else{
								alert('取消');
							}
						});
					}
				} ]
				
			});

		});
		</script>
	</body>
</html>
  