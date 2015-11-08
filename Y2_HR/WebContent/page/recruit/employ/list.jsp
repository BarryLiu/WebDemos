<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'filter_result.jsp' starting page</title>
 	<%@include file="/page/header.jsp" %>
	<script type="text/javascript" src="/Y2_HR/javascript/list.js"></script>	


     </head>
	<!-- 中转的表单数据 -->
	<input type="hidden" id="humanMajorKindId" value=" ">
	<input type="hidden" id="primarKey" value="">
	<input type="hidden" id="datePropertyName" value="">

	<body>
		<input type="hidden" name="utilBean.currPage" id="page"/>
		<table width="100%">
			<tr>
				<td>
					<font color="black">您正在做的业务是：人力资源--招聘管理--录用管理--录用查询  </font>
				</td>
			</tr>
		</table>
	
		<table width="100%" border="1" cellpadding=0 cellspacing=1 id="tb"
				class="TABLE_STYLE1"></table> 
		
	</body>
</html>

