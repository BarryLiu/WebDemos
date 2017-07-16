
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-trasitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
		<title>无标题文档</title>
		
		<link rel="stylesheet" href="../css/table.css" type="text/css"/>
		
<%@include file="/page/header.jsp"  %>
	
	</head>
	<body >
		 <ul id="menu" animate="true"></ul>
		
		<script type="text/javascript">
		$("#menu").tree({
			url : "/Y2_HR/urr/urrAction!initMenu",
			
			onClick: function(node){
				 // 在用户点击的时候提示
				//window.frames[1].location.href=node.path;
				if(node.path!=null){
					self.parent.frames["mainFrame"].location.href=node.path;
				}
			}
		});
	</script>
	</body>
</html>