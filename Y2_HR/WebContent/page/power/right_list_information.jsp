<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>编辑角色</title>
		<%@include file="/page/header.jsp" %>
		<script type="text/javascript" src="/Y2_HR/javascript/right_list_information.js"></script>
		<style type="text/css">
			.parent {
				margin-left: 50px;
			}
			.children {
				margin-left: 20%;
			}
		</style>
	</head>
	<body>
		<form id="powerAction!doModifyRight" name="powerAction!doModifyRight" action="/Y2_HR/urr/powerAction!doRoleEdit" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--权限管理--编辑角色</font>
					</td>
				</tr>
				<tr>		
					<td align="right">
						<input type="submit" id="powerAction!doModifyRight_0" value="&#20445;&#23384;" class="BUTTON_STYLE1"/>

						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">角色编号</td>
					<td class="TD_STYLE2">
						<s:property value="sysRole.id"/>
					</td>
					<td class="TD_STYLE1">角色名称</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE2" value="<s:property value="sysRole.roleName"/>"
							name="sysRole.roleName"/>
						<input type="hidden" value="<s:property value="sysRole.id"/>" name="sysRole.id">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">角色说明</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE2" value="<s:property value="sysRole.roleDesc"/>"
							name="sysRole.roleDesc"/>
					</td>
					<td class="TD_STYLE1">角色是否可用</td>
					<td class="TD_STYLE2">
						<select name="sysRole.roleFlag" id="powerAction!doModifyRight_sysRole_roleFlag">
						    <option value="0" selected="selected">否</option>
						    <option value="1" <s:if test="sysRole.roleFlag == 1">selected="selected"</s:if> >是</option>
						</select>

					</td>
				</tr>
			</table>
			<hr/>
			
									
	
			
			
			<s:iterator value="rights" id="f">
				<s:if test="#f.parentId == 0">
				<table class="grandfather">
					<tr>
						<td>
							<input type="checkbox" name="rightCodes" value="<s:property value="#f.id"/>" id="<s:property value="#f.id"/>"  class="grandfather_ck"/>
								 <s:property value="#f.rightName"/>
							<table class="children1">
								
								<s:iterator value="rights" id="s">
									<s:if test="#f.id == #s.parentId">
										<tr>
											<td>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="checkbox" name="rightCodes" value="<s:property value="#s.id"/>" id="<s:property value="#s.id"/>"  class="parent_ck"/> 
												<s:property value="#s.rightName"/>
											
											<br/>		
													<table  style="margin-left:120px;"  class="children1">
														<tr>
														<s:iterator value="rights" id="t">
																<s:if test="#s.id == #t.parentId">
																	<td width="120px">
																		&nbsp;&nbsp;&nbsp;&nbsp;
																			<input type="checkbox" name="rightCodes" value="<s:property value="#t.id"/>"  id="<s:property value="#t.id"/>"  class="children_ck"/> 
																				<s:property value="#t.rightName"/>
																	</td>
																</s:if>
														</s:iterator>
														</tr>
													</table>
											</td>
										</tr>
									</s:if>
								</s:iterator>
							</table>
						</td>
					</tr>
				</table>
				<hr/>
				</s:if>
			</s:iterator>
			
		 
			
	 
		</form>

<c:forEach items="${sysRole.rights }" var="right">
	<script type="text/javascript">
		setTimeout("loadRight(${right.id})", 200);
	</script>
</c:forEach>
<script type="text/javascript">
	function loadRight(id){
		var obj = document.getElementById(id);
		obj.checked=true;
	}
</script>



	</body>
	
	
	
	
	
	
</html>
