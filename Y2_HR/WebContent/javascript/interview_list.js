/**
 * 
 */
$(document).ready(function() {
	$('#tb').datagrid({
		url : '/Y2_HR/recruit/interview!loadList',
		
		queryParams :{
			"engageResume.humanMajorKindId": $("#humanMajorKindId").val(),
			"engageResume.humanMajorId": $("#humanMajorId").val(),
			"utilBean.primarKey": $("#primarKey").val(),
			"utilBean.datePropertyName": $("#datePropertyName").val(),
			"utilBean.startDate": $("#startDate").val(),
			"utilBean.endDate": $("#endDate").val(),
			"queryTag": " and resume.check_status = 2 "
		},
		
		columns : [ [ {
			field : "id",
			title : "档案编号",
			width : 120
		}, {
			field : "humanName",
			title : "姓名",
			width : 120
		}, {
			field : "humanSex",
			title : "性别",
			width : 120
		}, {
			field : "humanMajorKindName",
			title : "职位分类",
			width : 120,
			// row参数代表整个一行的数据(JSON格式)
			// 格式化这一列的值
			// 这一列的每一个单元格在展示的时候都会经过这个函数来处理
			// 具体展示在单元格中的数据由函数的返回值决定
//			formatter : function(value, row, index) {
//				return row.firstKind.firstKindName;
//			}
		}, {
			field : "humanMajorName",
			title : "职位名称",
			width : 120
		} , {
			field : "humanTelephone",
			title : "电话号码",
			width : 120
		}, {
			field : "checkStatus",
			title : "面试状态",
			width : 120,
			formatter : function(value, row, index) {
				var status="未登记";
				if(row.interviewStatus==1){
					status="待面试";
				}else if(row.interviewStatus==2){
					status="已面试";
				}
				return status;
			}
		}, {
			field : "登记",
			title : "登记",
			width : 120,
			formatter : function(value, row, index) {
				var status="<a href='/Y2_HR/recruit/interview!interviewRegister?engageResume.id="+row.id+"' >登记</a>";
				if(row.interviewStatus==1){
					status="<a href='/Y2_HR/recruit/interview!interviewRegister?engageResume.id="+row.id+"' >再次登记</a>";
				}
				return status;
			}
		} ] ],
		pagination :true,
		rownumbers :true,
		singleSelect: true,
		pageSize :5,
		pageList :[15,10,5],
		toolbar : [ {
			text: '登记',
			iconCls : 'icon-edit',
			handler : function() {
				// 获取被选中的那一行数据(JSON)
				var row = $("#tb").datagrid("getSelected");
				if(row.checkStatus==1){
					location.href='/Y2_HR/recruit/interview!interviewRegister?engageResume.id='+row.id;
				}else{
					
				}
				
			}
		},{
			text:'删除',
			iconCls : 'icon-remove',
			handler : function() {
				$.messager.confirm("提示", "确认要删除吗？", function(flag){
					if(flag){
						location.href='/Y2_HR/recruit/resume!deleteResumeById?engageResume.id='+row.id+"&jspName=interview_list";
					}else{
					}
				});
			}
		} ]
		
	});

});