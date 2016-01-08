$(document).ready(function() {
	$('#tb').datagrid({
		url : '/Y2_HR/transfer/transferAction!selectProfile',
		queryParams :{
			"humanFile.firstKindId": $("#firstSelect").val(),
			"humanFile.secondKindId": $("#secondSelect").val(),
			"humanFile.thirdKindId": $("#thirdSelect").val(),
			"dd1":$("#dd1").val(),
			"dd1":$("#dd2").val()
		},
		columns : [ [{
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
			field : "humanName",
			title : "名字",
			width : 100
		},
		{
			field : "salaryStandardName",
			title : "薪酬标准",
			width : 100
		},{
			field : "调动",
			title : "调动",
			width : 100,
			formatter : function(value, row, index) {
				return '<a href="#" onclick="removeHuman('+index+')">调动</a>';
			}
		}
		] ],
		pagination :true,
		rownumbers :true,
		pageSize :5,
		pageList :[15,10,5]
	});
	
	window.removeHuman=function(index){
		 $('#tb').datagrid('selectRow',index); 
		     var row = $('#tb').datagrid('getSelected');  
		     if (row){  
		     location.href="/Y2_HR/transfer/transferAction!selectHumanById?id="+row.id;
		     }
	}

});