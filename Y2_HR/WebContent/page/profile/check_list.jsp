<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<%@include file="/page/header.jsp" %>
	<script type="text/javascript" src="/Y2_HR/javascript/pcheck_list.js"></script>
	</head>
	<body>
		<form method="post" action="">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记复核 </font>
					</td>
				</tr>
				<tr>
					<td>
						当前等待复核的人力资源档案总数： <s:property value="count"/> 例
					</td>
				</tr>
			</table>
			<table id="tb" width="100%" border="1" cellpadding=5 cellspacing=1
				class="TABLE_STYLE1"></table>
			  
		</form>
	</body>
</html>
