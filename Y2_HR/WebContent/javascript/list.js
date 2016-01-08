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
			"queryTag": " and resume.pass_check_status = 3 "
		},
		
		columns : [ [  {
			field : "humanName",
			title : "姓名",
			width : 100
		}, {
			field : "humanSex",
			title : "性别",
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
			field : "humanCollege",
			title : "毕业院校",
			width : 100
		}, {
			field : "humanEducatedMajor",
			title : "学历专业",
			width : 100
		}, {
			field : "查询",
			title : "查询",
			width : 100,
			formatter: function(value,row,index){
				var tagA = "<a href='/Y2_HR/recruit/employ!cxDedails?engageResume.id="+row.id+"' >查询</a>";
				return tagA;
			}
		} ] ],
		pagination :true,
		rownumbers :true,
		pageSize :5,
		pageList :[15,10,5]
		
	});

});