<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
	<%@include file="/page/header.jsp"%>
	<script type="text/javascript">
		function check(){
			if (document.getElementById("publicChar.attributeName").value==""){
				alert("薪酬项目名称不能为空!!!");
				return false;
			}
			document.forms[0].submit();
		}		
	</script>
	</head>

	
	<body>
		<form action="/Y2_HR/client/clientAction!insertSsd" method="post">
		
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--薪酬管理设这--薪酬项目设置--薪酬项目添加
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="提交" class="BUTTON_STYLE1">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back();">
					</td>
				</tr>
			</table>

			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1"  width="19%">
						薪酬项目名称
					</td>
					<td class="TD_STYLE2" width="81%">
						<input type="text" class="INPUT_STYLE1" name="ssd.itemName"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>

>