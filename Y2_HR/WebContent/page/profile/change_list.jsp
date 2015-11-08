<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/page/header.jsp" %>
	<script type="text/javascript" src="/Y2_HR/javascript/pchange_list.js"></script>
		<link rel="stylesheet"
			href="../../css/table.css" type="text/css">

	</head>

	<body>
		<form action="" method="post">
		
		<!-- 中转的表单数据 -->
<input type="text" id="firstSelect" value="${param['humanFile.firstKindId']}">
<input type="text" id="secondSelect" value="${param['humanFile.secondKindId']}">
<input type="text" id="thirdSelect" value="${param['humanFile.thirdKindId']}">
<input type="text" id="majorKindSelect" value="${param['humanFile.humanMajorKindId']}">
<input type="text" id="majorSelect" value="${param['humanFile.humanMajorId']}">
		
		
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案查询 </font>
					</td>
				</tr>
				<tr>
					<td>
						符合条件的人力资源档案总数：15例
					</td>
				</tr>
			</table>
			
			<table id="tb" width="100%" border="1" cellpadding=5 cellspacing=1
				class="TABLE_STYLE1"></table>
			 
		</form>
	</body>
</html>
