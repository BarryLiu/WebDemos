$(document).ready(function(){
	window.findSecond = function() {
		var firstKindId = $("#fstSel").val();
		$.get("/Y2_HR/transfer/transferAction!findSecond",
						{
							"first.firstKindId" : firstKindId
						},
						function(x) {
							eval("var arr=" + x + ";");
							var sedSel = $("#secondKind");
							sedSel.empty();
							sedSel.append("<option value='0' selected='selected'>全部</option>");
							for (var i = 0; i < arr.length; i++) {
								var second = arr[i];
								sedSel.append("<option value='"+second.secondKindId+"'>"
												+ second.secondKindName
												+ "</option>");
							}
							document.getElementsByName("firstKindId")[0].value=arr[1].firstKindId;
						});
		
		findThird();
	}
	window.findMajor = function(){
		var majorKind=$("#mjrkind").val();
		 $.get("/Y2_HR/profile/profileAction!findMajor",{"majorKindId":majorKind},function(x){
			 eval("var arr=" + x + ";");
				var mjrkind = $("#majorName");
				mjrkind.empty();
				mjrkind.append("<option value='0' selected='selected'>全部</option>");
				for (var i = 0; i < arr.length; i++) {
					var major = arr[i];
					mjrkind.append("<option value='"+major.majorId+"'>"
									+ major.majorName
									+ "</option>");
				}
		}); 
	}
	window.findThird = function() {
		var secondKind = $("#secondKind").val();
		var firstKindId = $("#firstKindId").val();
		$.get( "/Y2_HR/profile/profileAction!findThird",
						{
							"secondKind" : secondKind,
							"firstKindId": firstKindId
						},
						function(x) {
							eval("var arr=" + x + ";");
							var thdSel = $("#thirdKind");
							thdSel.empty();
							thdSel.append("<option value='0' selected='selected'>全部</option>");
							for (var i = 0; i < arr.length; i++) {
								var third = arr[i];
								thdSel.append("<option value='"+third.thirdKindId+"'>"
												+ third.thirdKindName
												+ "</option>");
							}
						});
	} 
	findSecond();
	findMajor();
	setTimeout("findThird()", 100);
});