<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
<%@include file="/page/header.jsp"  %>
<script type="text/javascript" src="/Y2_HR/javascript/register_list2.js"></script>
</head>
<!-- 中转的表单数据 -->
<input type="hidden" id="firstSelect" value="${param['humanFile.firstKindId']}">
<input type="hidden" id="secondSelect" value="${param['humanFile.secondKindId']}">
<input type="hidden" id="thirdSelect" value="${param['humanFile.thirdKindId']}">
<input type="hidden" id="dd1" value="${param['dd1']}">
<input type="hidden" id="dd2" value="${param['dd2']}">
	<body>
		<form action="" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：调动管理--调动登记--调动登记查询查询 </font>
					</td>
				</tr>
			</table>
			<table id="tb" width="100%" border="1" cellpadding=5 cellspacing=1
				class="TABLE_STYLE1"></table>
		</form>
 
	</body>
</html>
