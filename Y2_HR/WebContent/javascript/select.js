$(function(){    
 	$("#firstKindId").change(function(){ 
 		var strText=$("#firstKindId").find("option:selected").text();   //获取Select选择的text
 	  	$("#firstKindName").val(strText);
 		
 		
 	 $.post("/Y2_HR/recruit/position!findSecond",
 	 {"firstKind" : $("#firstKindId").val()},
 	 function(data){
			eval("var arr=" + data + ";");
			var sedSel = $("#secondKindId");
			sedSel.empty();
			sedSel.append("<option value='0' selected='selected'>--请选择--</option>");
			for (var i = 0; i < arr.length; i++) {
				var second = arr[i];
				sedSel.append("<option value='"+second.secondKindId+"'>"
								+ second.secondKindName
								+ "</option>");
			}
			//document.getElementsByName("firstKindId")[0].value=arr[1].firstKindId;
		});
 	});
 
 	$("#secondKindId").change(function(){

 		var strText=$("#secondKindId").find("option:selected").text();   //获取Select选择的text
 	  	$("#secondKindName").val(strText);
 		
		var secondKind = $("#secondKind").val();
		var firstKindId = $("#firstKindId").val();
		$.get( "/Y2_HR/recruit/position!findThird",
						{
							"secondKind" : $(this).val(),
							"firstKindId": $("#firstKindId").val()
						},
						function(x) {
							eval("var arr=" + x + ";");
							var thdSel = $("#thirdKindId");
							thdSel.empty();
							thdSel.append("<option value='0' selected='selected'>--请选择--</option>");
							for (var i = 0; i < arr.length; i++) {
								var third = arr[i];
								thdSel.append("<option value='"+third.thirdKindId+"'>"
												+ third.thirdKindName
												+ "</option>");
							}
						});
	
 	});
 	
 	$("#thirdKindId").change(function(){
 		var thirdText = $("#thirdKindId").find("option:selected").text();
 		$("#thirdKindName").val(thirdText);
 	});
 	});
 
$(function(){
	$("#majorKindId").change(function(){
		var majorKindText = $("#majorKindId").find("option:selected").text();
		$("#majorKindName").val(majorKindText);
		
		var majorKind =$("#majorKindId").val();
		 $.get("/Y2_HR/recruit/position!findMajor",{"majorKindId":majorKind},function(x){
			 eval("var arr=" + x + ";");
				var mjrkind = $("#majorId");
				mjrkind.empty();
				mjrkind.append("<option value='0' selected='selected'>--请选择--</option>");
				for (var i = 0; i < arr.length; i++) {
					var major = arr[i];
					mjrkind.append("<option value='"+major.majorId+"'>"
									+ major.majorName
									+ "</option>");
				}
				//document.getElementsByName("firstKindId")[0].value=arr[1].firstKindId;
		});
	});
	 
	
	
	$("#majorId").change(function(){
		var majorIdText = $("#majorId").find("option:selected").text();
		$("#majorName").val(majorIdText);
	});
	
});