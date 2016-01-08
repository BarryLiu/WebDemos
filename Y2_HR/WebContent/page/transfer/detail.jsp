<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
	<%@include file="/page/header.jsp"%>
	</head>
	<body>
		 
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是:人力资源--培训管理--调动登记查看</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" class="BUTTON_STYLE1" onclick="javascript:window.history.back();" value="返回">
					</td>
				</tr>
			</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr height="21">
					<td class="TD_STYLE1" width="8%">
						档案编号
					</td>
					<td class="TD_STYLE2" width="10%">
						${majorChange.id}
					</td>					
					<td class="TD_STYLE1" width="8%">
						姓名
					</td>					
					<td class="TD_STYLE2" width="10%">
					${majorChange.humanName }
					</td>
					<td class="TD_STYLE1" width="8%">						
					</td>
					<td class="TD_STYLE2" width="10%">						
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="8%">
						原一级机构
					</td>
					<td class="TD_STYLE2" >
						${majorChange.firstKindName }	
					</td>
					<td class="TD_STYLE1" width="8%">
						原二级机构
					</td>
					<td class="TD_STYLE2" width="10%">
						${majorChange.secondKindName }
					</td>
					<td class="TD_STYLE1" width="8%">
						${majorChange.thirdKindName }
					</td>
					<td class="TD_STYLE2" width="10%">
						
					</td>					
					<td class="TD_STYLE1" width="8%">						
					</td>
					<td class="TD_STYLE2" width="10%">						
					</td>
				</tr>

				<tr>
					<td class="TD_STYLE1">
						原职位分类
					</td>
					<td class="TD_STYLE2">
						${majorChange.majorKindName }
					</td>
					<td class="TD_STYLE1" width="12%">
						原职位名称
					</td>
					<td class="TD_STYLE2">
						${majorChange.majorName }
					</td>
					<td class="TD_STYLE1">
						原薪酬标准
					</td>
					<td class="TD_STYLE2">
						${majorChange.salaryStandardName }
						</td>
					<td class="TD_STYLE1">
						原薪酬总额
					</td>
					<td class="TD_STYLE2" >
						${majorChange.salarySum }
					</td>
				</tr>				
				<tr>
					<td class="TD_STYLE1">
						新一级机构名称
					</td>
					<td class="TD_STYLE2">
						${majorChange.newFirstKindName }
						
					</td>
					<td class="TD_STYLE1" width="12%">
						新二级机构名称
					</td>
					<td class="TD_STYLE2">
						${majorChange.newSecondKindName } 
					</td>
					<td class="TD_STYLE1" width="12%">
						新三级机构名称
					</td>
					<td class="TD_STYLE2">
					${majorChange.newThirdKindName } }
					</td>
					<td class="TD_STYLE1" width="8%">
					</td>
					<td class="TD_STYLE2" width="10%">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						新职位分类
					</td>
					<td class="TD_STYLE2">
						${majorChange.newMajorKindName }
					</td>
					<td class="TD_STYLE1" width="12%">
						新职位名称
					</td>
					<td class="TD_STYLE2">
						${majorChange.newMajorName }
					</td>
					<td class="TD_STYLE1">
						新薪酬标准
					</td>
					<td class="TD_STYLE2">
						${majorChange.newSalaryStandardName }
					</td>
					<td class="TD_STYLE1">
						新薪酬总额
					</td>
					<td class="TD_STYLE2">
						${majorChange.newSalarySum}
					</td>
				</tr>
								
				<tr>
					<td class="TD_STYLE1">
						登记人
					</td>
					<td class="TD_STYLE2">
						${majorChange.register }
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td class="TD_STYLE2">
						${majorChange.registTime }
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						${majorChange.checker }
					</td>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						${majorChange.checkTime }
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						调动原因
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="majorChange.changeReason" rows="6" readonly="readonly" class="TEXTAREA_STYLE1">						
						${majorChange.changeReason}
						</textarea>
					</td>
				</tr>
			</table>
	</body>
</html>


