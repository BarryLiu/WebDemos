/**
 * 
 */
$(document).ready(function() {
	$('#tb').datagrid({
		url : '/Y2_HR/recruit/resume!selectResumeList',
		
		queryParams :{
			"engageResume.humanMajorKindId": $("#humanMajorKindId").val(),
			"engageResume.humanMajorId": $("#humanMajorId").val(),
			"utilBean.primarKey": $("#primarKey").val(),
			"utilBean.datePropertyName": $("#datePropertyName").val(),
			"utilBean.startDate": $("#startDate").val(),
			"utilBean.endDate": $("#endDate").val(),
			"queryTag": " and resume.check_status =2 "
		},
		
		columns : [ [ {
			field : "id",
			title : "档案编号",
			width : 100,
			formatter: function(value,row,index){
				var tagA = "<a href='/Y2_HR/recruit/resume!selectById?id="+row.id+"' >"+row.id+"</a>";
				
				return tagA;
			}
		}, {
			field : "humanName",
			title : "姓名",
			width : 100
		}, {
			field : "humanSex",
			title : "性别",
			width : 100
		},{
			field : "humanAge",
			title : "年龄",
			width : 100
		}, {
			field : "humanMajorKindName",
			title : "职位分类",
			width : 100
		}, {
			field : "humanMajorName",
			title : "职位名称",
			width : 100
		},  {
			field : "humanTelephone",
			title : "电话号码",
			width : 120
		},  {
			field : "checkStatus",
			title : "复核状态",
			width : 120,
			formatter : function(value, row, index) {
				var status="通过";
				if(row.checkStatus==1){
					status="未通过";
				}else if(row.checkStatus==2){
					status="通过";
				}
				return status;
			}
		},{
			field : "checkStatus",
			title : "面试状态",
			width : 120,
			formatter : function(value, row, index) {
				var status="待面试";
				if(row.checkStatus==1){
					status="已面试";
				}else if(row.checkStatus==2){
					status="待面试";
				}
				return status;
			}
		} ] ],
		pagination :true,
		rownumbers :true,
		pageSize :5,
		pageList :[15,10,5]
		
	});

});