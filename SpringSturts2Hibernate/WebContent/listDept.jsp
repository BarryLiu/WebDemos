<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//中文传输有问题   英文没问题
	function loadEmp(dno) {
		//先声明一个异步请求对象
		var xmlHttpReg = null;
		if (window.ActiveXObject) {//如果是IE

			xmlHttpReg = new ActiveXObject("Microsoft.XMLHTTP");

		} else if (window.XMLHttpRequest) {
			xmlHttpReg = new XMLHttpRequest(); //实例化一个xmlHttpReg
		}
		//如果实例化成功,就调用open()方法,就开始准备向服务器发送请求
		if (xmlHttpReg != null) {
			xmlHttpReg.open("post", "firmAction!toLoadEmps?deptno="+dno, true); 
			xmlHttpReg.send(null);
			xmlHttpReg.onreadystatechange = doResult; //设置回调函数
		}
		//回调函数
		//一旦readyState的值改变,将会调用这个函数,readyState=4表示完成相应
		//设定函数doResult()
		function doResult() {
			if (xmlHttpReg.readyState == 4) {//4代表执行完成
				if (xmlHttpReg.status == 200) {//200代表执行成功
					//将xmlHttpReg.responseText的值赋给ID为resText的元素
					alert(xmlHttpReg.responseText);
					document.getElementById("resText").innerHTML = xmlHttpReg.responseText;
				}
			}
		}
	}
</script>
</head>
<body>
	<div align="center">
		<h1>listDept.jsp</h1>
		<h4>
			<a href="index.jsp">index.jsp</a><br> <a href="addDept.jsp">add
				Dept</a><br> <br> <span style="color: red">${delDeptMsg }</span>
		</h4>
		<br>
		<table border="1">
			<tr>
				<td>编号</td>
				<td>部门</td>
				<td>操作</td>
			</tr>
			<c:forEach var="d" items="${depts }">
				<tr onclick="loadEmp('${d.deptno}')">
					<td>${d.deptno}</td>
					<td>${d.dname }</td>
					<td><a href="firmAction!toModifyDept?deptno=${d.deptno}">修改</a>
						<a href="firmAction!removeDept?deptno=${d.deptno}">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<span id="resText"></span>
	</div>
</body>
</html>