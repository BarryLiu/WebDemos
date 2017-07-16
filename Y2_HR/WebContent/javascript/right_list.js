/**
 * 
 */
$(document).ready(function() {
	$('#tb').datagrid({
		url : '/Y2_HR/urr/powerAction!loadListRole',
		
		queryParams :{
			"engageResume.humanMajorKindId": $("#humanMajorKindId").val(),
			"engageResume.humanMajorId": $("#humanMajorId").val(),
			"utilBean.primarKey": $("#primarKey").val(),
			"utilBean.datePropertyName": $("#datePropertyName").val(),
			"utilBean.startDate": $("#startDate").val(),
			"utilBean.endDate": $("#endDate").val(),
			"queryTag": " and resume.interview_status is not null "
		},
		
		columns : [ [ {
			field : "id",
			title : "角色编号",
			width : 120
		}, {
			field : "roleName",
			title : "角色名称",
			width : 120
		}, {
			field : "roleDesc",
			title : "角色说明",
			width : 120
		}, {
			field : "roleFlag",
			title : "是否可用",
			width : 120,
			// row参数代表整个一行的数据(JSON格式)
			// 格式化这一列的值
			// 这一列的每一个单元格在展示的时候都会经过这个函数来处理
			// 具体展示在单元格中的数据由函数的返回值决定
			formatter : function(value, row, index) {
				var status="可用";
				if(row.roleFlag==1){
					status="可用";
				}else{
					status="不可用";
				}
				return status;
			}
		}, {
			field : "操作",
			title : "操作",
			width : 120,
			formatter : function(value, row, index) {
				var status="<img src='/Y2_HR/images/bt_edit.gif' title='编辑' style='cursor:pointer;' onclick='doEdit("+row.id+")'/>"+
						"<img src='/Y2_HR/images/bt_del.gif' title='删除' style='cursor:pointer;' onclick='doDelete("+row.id+")'/>";
				 
				
				return status;
			}
		} ] ],
		pagination :true,
		rownumbers :true,
		singleSelect: true,
		pageSize :5,
		pageList :[15,10,5],
		toolbar : [ {
			text: '编辑',
			iconCls : 'icon-edit',
			handler : function() {
				// 获取被选中的那一行数据(JSON)
				var row = $("#tb").datagrid("getSelected");
				location.href='/Y2_HR/urr/powerAction!toRoleEdit?sysRole.id='+row.id;
				
			}
		},{
			text:'删除',
			iconCls : 'icon-remove',
			handler : function() {
				$.messager.confirm("提示", "确认要删除吗？", function(flag){
					if(flag){
						var row = $("#tb").datagrid("getSelected");
						if(row.id != undefined){
							location.href = "/Y2_HR/urr/powerAction!roleDelete?sysRole.id=" + row.id;
						}else{
							$.messager.alert(_15, "请选择要删除的", "error", function(){});
						}
					}
				});
			}
		},{
			text:'添加',
			iconCls : 'icon-add',
			handler : function() {
				location.href='/Y2_HR/page/power/right_add.jsp'
			}
		} ]
		
	});

});