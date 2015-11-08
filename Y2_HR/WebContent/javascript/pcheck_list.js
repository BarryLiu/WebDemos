$(document).ready(function() {
	$('#tb').datagrid({
		url : '/Y2_HR/profile/profileAction!selectProfileTag',
		
		queryParams :{
			"humanFile.firstKindId": "0",
			"queryTag": "  "
		},
		
		columns : [ [ {
			field : "humanId",
			title : "档案编号",
			width : 100
		}, {
			field : "humanName",
			title : "姓名",
			width : 100
		}, {
			field : "humanSex",
			title : "性别",
			width : 100
		}, {
			field : "firstKind",
			title : "一级机构",
			width : 100 
		}, {
			field : "secondKindName",
			title : "二级机构",
			width : 100
		}, {
			field : "thirdKindName",
			title : "三级机构",
			width : 100
		}, {
			field : "humanProDesignation",
			title : "职称",
			width : 100
		}, {
			field : "复核",
			title : "复核",
			width : 100,
			formatter:function(value,row,index){
				var tagA = "<a href='/Y2_HR/profile/profileAction!humanCheck?humanFile.id="+row.id+"' >复核</a>";
				return tagA;
			}
		} ] ],
		pagination :true,
		rownumbers :true,
		pageSize :5,
		pageList :[15,10,5]
		
	});

});