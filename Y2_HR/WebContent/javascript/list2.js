$(document)
		.ready(
				function() {
					$('#tb')
							.datagrid(
									{
										url : '/Y2_HR/transfer/transferAction!selectMajorChange2',
										queryParams :{
											"majorChange.firstKindId": $("#firstSelect").val(),
											"majorChange.secondKindId": $("#secondSelect").val(),
											"majorChange.thirdKindId": $("#thirdSelect").val(),
											"majorChange.MajorKindId": $("#majorKindSelect").val(),
											"majorChange.MajorId": $("#majorSelect").val(),
											"dd1":$("#dd1").val(),
											"dd2":$("#dd2").val()
										},
										
										columns : [ [
												{
													field : "firstKindName",
													title : "一级机构",
													width : 100,
												},
												{
													field : "secondKindName",
													title : "二级机构",
													width : 100
												},
												{
													field : "thirdKindName",
													title : "三级机构",
													width : 100
												},
												{
													field : "salaryStandardName",
													title : "薪酬标准",
													width : 100
												},
												{
													field : "humanName",
													title : "名字",
													width : 100
												},
												{
													field : "查看",
													title : "查看",
													width : 100,
													formatter : function(value,
															row, index) {
														return '<a href="#" onclick="removeHuman('
																+ index
																+ ')">查看</a>';
													}
												} ] ],
										pagination : true,
										rownumbers : true,
										pageSize : 5,
										pageList : [ 15, 10, 5 ]
									});

					window.removeHuman = function(index) {
						$('#tb').datagrid('selectRow', index);// 关键在这里
						var row = $('#tb').datagrid('getSelected');
						if (row) {
							location.href = "/Y2_HR/transfer/transferAction!selectMajorChangeById2?id="
									+ row.id;
						}
					}

				});