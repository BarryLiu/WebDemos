$(document).ready(function() {
	$(".grandfather_ck").click(function() {
//		alert($(this)[0].checked);
		if ($(this)[0].checked) {
			var ckbs=$(this).parents(".grandfather").find(":checkbox").each(function(i){
				$(this)[0].checked = "checked"; 
			});
			//$(this).parents(".grandfather").find(":checkbox").attr("checked", "checked");
//			$(this).parents(".grandfather").find(":checkbox").hide();
		} else {
			$(this).parents(".grandfather").find(":checkbox").removeAttr("checked");
		}
	});
	$(".parent_ck").click(function() {
		var flag = false;
		if ($(this)[0].checked) {
//			$(this).nextAll(".children1").find(".children_ck").attr("checked", "checked");
			var ckbs=$(this).nextAll(".children1").find(".children_ck").each(function(i){
				$(this)[0].checked = "checked"; 
			});
		} else {
			$(this).nextAll(".children1").find(".children_ck").removeAttr("checked");
		}
		$(this).parents(".grandfather").find(".parent_ck").each(function(i) {
			if ($(this)[0].checked) {
				flag = true;
			}
		});
		$(this).parents(".grandfather").find(".grandfather_ck")[0].checked = flag;
	});
	$(".children_ck").click(function() {
		var flag = false;
		$(this).parents(".children1").find(".children_ck").each(function(i) {
			if ($(this)[0].checked) {
				flag = true;
			}
		});
		$(this).parents(".children1").prevAll(".parent_ck")[0].checked = flag;
		var flag2 = false;
		$(this).parents(".grandfather").find(".parent_ck, .children_ck").each(function(i) {
			if ($(this)[0].checked) {
				flag2 = true;
			}
		});
		$(this).parents(".grandfather").find(".grandfather_ck")[0].checked = flag2;
	});
});