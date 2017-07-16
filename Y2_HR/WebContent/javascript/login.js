$(function() {
	$(":button").click(function() {
		doLogin();
	});
	$("html").die().live("keydown", function(event) {
		if (event.keyCode == 13) {
			doLogin();
		}
	});

	window.doLogin =function() {
		var userName = $("#userName");
		var userPassword = $("#userPassword");
		var reg = /^\S{5,}$/;
		if (!reg.test(userName.val())) {
			userName[0].select();
			$.messager.show("消息提示", "登录名格式不正确！长度必须大于5位且不能有空格！", 2000);
			return false;
		}
		if (!reg.test(userPassword.val())) {
			userPassword[0].select();
			$.messager.show("消息提示", "登录密码格式不正确！长度必须大于5位且不能有空格！", 2000);
			return false;
		}
		var uid=userName.val();
		var pwd = userPassword.val();
		$.post("/Y2_HR/urr/urrAction!login", {
			"user.userName" : uid,
			"user.userPassword" : pwd
		}, function(x) {
			if(x=='success'){
				location.href="page/index.html";
			}else if(x=="noRight"){
				$.messager.alert("该用户没有登陆权限！");
			}else{
				$.messager.alert("账号或密码错误！");
				userPassword.val("");
			}
				
		});

	}

});
