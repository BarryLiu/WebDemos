<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
<script type="text/javascript" src="/Y2_HR/javascript/register.js"></script>
</head>
<body>
	<form action="/Y2_HR/transfer/transferAction!insertMajorChange" method="post" >
		<table width="100%">
			<tr>
				<td><font color="#0000CC">您正在做的业务是:人力资源--调动管理--调动登记</font></td>
			</tr>

			<tr>
				<td align="right"><input type="submit" value="提交"
					class="BUTTON_STYLE1"> <input type="button"
					class="BUTTON_STYLE1" onclick="javascript:window.history.back();"
					value="返回"></td>
			</tr>
		</table>
		<table width="100%" border="1" cellpadding=0 cellspacing=1
			bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
			<tr height="21">
				<td class="TD_STYLE1" width="8%">档案编号</td>
				<td class="TD_STYLE2" width="10%"><input type="text"
					name="majorChange.humanId" readonly="readonly"
					value="${humanFile.humanId }" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1" width="8%">姓名</td>
				<td class="TD_STYLE2" width="10%"><input type="text"
					name="majorChange.humanName" value="${humanFile.humanName }"
					readonly="readonly" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1" width="8%"></td>
				<td class="TD_STYLE2" width="10%"></td>
				<td class="TD_STYLE1" width="8%"></td>
				<td class="TD_STYLE2" width="10%"></td>
			</tr>
			<tr>

				<td class="TD_STYLE1" width="8%">原一级机构</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.firstKindName"
					value="${humanFile.firstKindName }" readonly="readonly" value=""
					class="INPUT_STYLE2"> <input type="hidden"
					name="majorChange.firstKindId" value="${humanFile.firstKindId }"></td>
				<td class="TD_STYLE1" width="8%">原二级机构</td>
				<td class="TD_STYLE2" width="10%"><input type="text"
					name="majorChange.secondKindName"
					value="${humanFile.secondKindName }" readonly="readonly" value=""
					class="INPUT_STYLE2"> <input type="hidden"
					name="majorChange.secondKindId" value="${humanFile.secondKindId }"></td>
				<td class="TD_STYLE1" width="8%">原三级机构</td>
				<td class="TD_STYLE2" width="10%"><input type="text"
					name="majorChange.thirdKindName"
					value="${humanFile.thirdKindName }" readonly="readonly" value=""
					class="INPUT_STYLE2"> <input type="hidden"
					name="majorChange.thirdKindId" value="${humanFile.thirdKindId }"></td>
				<td class="TD_STYLE1" width="8%"></td>
				<td class="TD_STYLE2" width="10%"></td>
			</tr>

			<tr>
				<td class="TD_STYLE1">原职位分类</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.majorKindName"
					value="${humanFile.humanMajorKindName }" readonly="readonly"
					value="" class="INPUT_STYLE2"> <input type="hidden"
					name="majorChange.majorKindId" value="02"></td>
				<td class="TD_STYLE1" width="12%">原职位名称</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.majorName" value="${humanFile.hunmaMajorName }"
					readonly="readonly" class="INPUT_STYLE2"> <input
					type="hidden" name="majorChange.majorId" value="02"></td>
				<td class="TD_STYLE1">原薪酬标准</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.salaryStandardName"
					value="${humanFile.salaryStandardName }" readonly="readonly"
					class="INPUT_STYLE2"> <input type="hidden"
					name="majorChange.salaryStandardId" value="${humanFile.salaryStandardId }"></td>
				<td class="TD_STYLE1">原薪酬总额</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.salarySum" value="${humanFile.salarySum }"
					readonly="readonly" class="INPUT_STYLE2"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">新一级机构名称</td>
				<td class="TD_STYLE2"><select style="width: 160px"
					name="majorChange.newFirstKindId" id="newFstSel" size="1"
					class="SELECT_STYLE2" onchange="findSecond()">
				</select> <input name="majorChange.newFirstKindName" type="hidden"
					id="newFirstKindName" />
				<td class="TD_STYLE1" width="12%">新二级机构名称</td>
				<td class="TD_STYLE2"><select style="width: 160px"
					name="majorChange.newSecondKindId" id="newSecondKind" size="1"
					class="SELECT_STYLE2" onchange="findThird()">
						<option value="0">全部</option>
				</select> <input name="majorChange.newSecondKindName" type="hidden"
					id="newSecondKindName" />
				<td class="TD_STYLE1" width="12%">新三级机构名称</td>
				<td class="TD_STYLE2"><select style="width: 160px"
					name="majorChange.newThirdKindId" id="newThirdKind" size="1"
					class="SELECT_STYLE2" onchange="findThirdName()">
						<option value="0">全部</option>
				</select> <input type="hidden" name="majorChange.newThirdKindName"
					id="newThirdKindName"></td>
				<td class="TD_STYLE1" width="8%"></td>
				<td class="TD_STYLE2" width="10%"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">新职位分类</td>
				<td class="TD_STYLE2"><select style="width: 160px"
					name="majorChange.newMajorKindId" id="newMajorKindId" size="1"
					class="SELECT_STYLE2" onchange="findMajor()">
						<option value="0">-----请选择-----</option>
				</select>
				<input type="hidden" name="majorChange.newMajorKindName"
					id="newMajorKindName"></td>
				<td class="TD_STYLE1" width="12%">新职位名称</td>
				<td class="TD_STYLE2"><select name="majorChange.newMajorId"
					id="newMajorId" class="INPUT_STYLE2" onchange="findMajorName()">
						<option value="0">-----请选择-----</option>
				</select> <input type="hidden" name="majorChange.newMajorName"
					id="newMajorName"></td>
				<td class="TD_STYLE1">新薪酬标准</td>
				<td class="TD_STYLE2"><select style="width: 160px"
					name="majorChange.newSalaryStandardId" id="newSalaryStandardId"
					size="1" class="SELECT_STYLE2" onchange="findNewSalarySum()">
						<option value="0">-----请选择-----</option>
				</select>
				<input type="hidden" name="majorChange.newSalaryStandardName"
					id="newSalaryStandardName"></td>
				<td class="TD_STYLE1">新薪酬总额</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.newSalarySum" id="newSalarySum"
					readonly="readonly" value="0.00" class="INPUT_STYLE2"></td>
			</tr>

			<tr>
				<td class="TD_STYLE1">登记人</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.register" readonly="readonly"
					value="${currUser.userTrueName}" class="INPUT_STYLE2"></td>
				<td class="TD_STYLE1">登记时间</td>
				<td class="TD_STYLE2"><input type="text"
					name="majorChange.registTime" readonly="readonly" id="Tdate"
					class="INPUT_STYLE2"> <SCRIPT type="text/javascript">
						function time() {
							var tdate = document.getElementById("Tdate");
							var d = new Date();
							var y = d.getFullYear();
							var moth = d.getMonth() + 1;
							var date = d.getDate();
							var h = d.getHours();
							var m = d.getMinutes();
							var s = d.getSeconds();
							var hh = 20 - 1 - h;
							var mm = 60 - 1 - m;
							var ss = 60 - s;
							if (hh > 0) {
								mm = mm + 60 * hh;
							}
							if (moth < 10) {
								moth = "0" + moth;
							}
							if (date < 10) {
								date = "0" + date;
							}
							if (h < 10) {
								h = "0" + h;
							}
							if (m < 10) {
								m = "0" + m;
							}
							if (s < 10) {
								s = "0" + s;
							}
							if (mm < 10) {
								mm = "0" + mm;
							}
							if (ss < 10) {
								ss = "0" + ss;
							}

							tdate.value = y + "-" + moth + "-" + date + "- "
									+ h + ":" + m + ":" + s;

						}
						window.onload = time;
						var out = window.setInterval(time, 1000);
					</SCRIPT></td>
				<td class="TD_STYLE1"></td>
				<td class="TD_STYLE2"></td>
				<td class="TD_STYLE1"></td>
				<td class="TD_STYLE2"></td>
			</tr>
			<tr>
				<td class="TD_STYLE1">调动原因</td>
				<td colspan="7" class="TD_STYLE2"><textarea
						name="majorChange.changeReason" rows="6" class="TEXTAREA_STYLE1"></textarea>
				</td>
			</tr>
		</table>
	</form>


</body>
</html>


