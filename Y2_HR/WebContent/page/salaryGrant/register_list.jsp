<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>无标题文档</title>
		
<%@include file="/page/header.jsp" %>
<script type="text/javascript" src="/Y2_HR/javascript/comm/comm.js"></script>
<link rel="stylesheet" href="/Y2_HR/css/table.css" type="text/css" />

		<STYLE type="text/css">
		td{text-align: center}
		</STYLE>
	</head>

	<body>
		 
			<table width="100%">
				<tr>
					<td colspan="2" style="text-align: left">
						<font color="black">您正在做的业务是：人力资源--薪酬标准管理--薪酬发放登记(负责人控制)
						</font>
						 
					</td>
				</tr>
				 
			</table>
					<br> 
					薪酬总数:<s:property value="lists.get(0).size()"/>，
					总人数:8，基本薪酬总数:141821.0，实发总额:1998.0
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				
				
				<tr>
					<td width="10%" class="TD_STYLE1">
						<span>序号</span>
					</td>			
					
					
					<td width="40%"  class="TD_STYLE1">
						<span>I级机构名称</span>
					</td>
					<td width="10%" class="TD_STYLE1">
						<span>人数</span>
					</td>
					<td width="10%" class="TD_STYLE1">
						基本薪酬总额(元)
					</td>					
					<td width="10%" class="TD_STYLE1">
						登记
					</td>
				</tr>
				
				
				<s:iterator value="lists.get(0)">
					<tr  class="TD_STYLE2">
						<td width="10%">
						<span><s:property value="id"/></span>
						</td>			
						
						
						<td width="40%" >
							<span>
								<s:property value="firstKindName"/>
							</span>
						</td>
						<td width="10%">
							<span>人数</span>
						</td>
						<td width="10%">
							基本薪酬总额(元)
						</td>					
						<td width="10%" >
							登记
						</td>
					</tr>
				</s:iterator>
				
					<tr class="TD_STYLE2">
						<td>
							1
						</td>
						
					
						
						
					<td> &#8544;&#32423;&#32467;&#26500;  </td>
					
					
					
					
					
						
						<td>
							5 
						</td>
						<td>
							139823.0 
						</td>
						<td>
							<a href="register_commit.html">登 记</a>
						</td>
					</tr>
					
				
					<tr class="TD_STYLE2">
						<td>
							2
						</td>
						
					
						
						
					<td> &#38598;&#22242;  </td>
					
					
					
					
					
						
						<td>
							1 
						</td>
						<td>
							666.0 
						</td>
						<td>
							<a href="register_commit.html">登 记</a>
						</td>
					</tr>
					
				
					<tr class="TD_STYLE2">
						<td>
							3
						</td>
						
					
						
						
					<td> &#24635;&#37096;  </td>
					
					
					
					
					
						
						<td>
							2 
						</td>
						<td>
							1332.0 
						</td>
						<td>
							<a href="register_commit.html">登 记</a>
						</td>
					</tr>
					
					
					
				</table>
			<p>
			 
				&nbsp;
			</p>
		 
	</body>
</html>
