<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>		
		<%@include file="/page/header.jsp"%>
	</head>

	<body>
		<form name="humanfileForm" method="post" action="">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是:人力资源--调动管理--调动登记</font>
					</td>
				</tr>
				 <tr>
    <td width="49%"> 登记成功,待复核！</td>
    <td width="51%" align="right">
			<input type="button" class="BUTTON_STYLE1" onclick="javascript:window.location='/Y2_HR/transfer/transferAction!toQueryLocate';" value="返回">
		</td>
		
	</tr>
			</table>
		</form>
	</body>

</html>


