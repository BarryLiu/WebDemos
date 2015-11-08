$(document).ready(function() {
	$('#tb').datagrid({
		url : '/Y2_HR/profile/profileAction!selectProfile',
		
		queryParams :{
			"humanFile.firstKindId": $("#firstSelect").val(),
			"humanFile.secondKindId": $("#secondSelect").val(),
			"humanFile.thirdKindId": $("#thirdSelect").val(),
			"humanFile.humanMajorKindId": $("#majorKindSelect").val(),
			"humanFile.humanMajorId": $("#majorSelect").val()
		},
		
		columns : [ [ {
			field : "humanId",
			title : "档案编号",
			width : 100,
			formatter : function(value, row, index) {
				var tagA = "<a href='/Y2_HR/profile/profileAction!toChange?humanFile.id="+row.id+"' >"+row.id+"</a>";
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
		}, {
			field : "firstKind",
			title : "一级机构",
			width : 100,
			// row参数代表整个一行的数据(JSON格式)
			// 格式化这一列的值
			// 这一列的每一个单元格在展示的时候都会经过这个函数来处理
			// 具体展示在单元格中的数据由函数的返回值决定
			formatter : function(value, row, index) {
				return row.firstKind.firstKindName;
			}
		}, {
			field : "secondKindName",
			title : "二级机构",
			width : 100
		}, {
			field : "thirdKindName",
			title : "三级机构",
			width : 100
		}, {
			field : "humanMajorKindName",
			title : "职位分类",
			width : 100
		}, {
			field : "humanMajorName",
			title : "职位名称",
			width : 100
		} ] ],
		pagination :true,
		rownumbers :true,
		pageSize :5,
		pageList :[15,10,5]
		
	});

});