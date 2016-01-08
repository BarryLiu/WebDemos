<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
<head>
<%@include file="/page/header.jsp"%>
<script type="text/javascript" src="/Y2_HR/javascript/list2.js"></script>

</head>
<body>
<input type="hidden" id="firstSelect" value="${param['majorChange.firstKindId']}">
<input type="hidden" id="secondSelect" value="${param['majorChange.secondKindId']}">
<input type="hidden" id="thirdSelect" value="${param['majorChange.thirdKindId']}">
<input type="hidden" id="majorKindSelect" value="${param['majorChange.MajorKindId']}">
<input type="hidden" id="majorSelect" value="${param['majorChange.MajorId']}">
<input type="hidden" id="dd1" value="${param['dd1']}">
<input type="hidden" id="dd2" value="${param['dd2']}">
 
	<form action="list.html" method="post">
		<font color="black"> 您在做的业务是-人力资源-调动管理-调动查询列表 </font>
		<table id="tb" width="100%" border="1" cellpadding=5 cellspacing=1
			class="TABLE_STYLE1"></table>
	</form>
</body>
</html>