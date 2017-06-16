/**
 * 修改密码
 */

$(function(){
	var $error = $("#news");//错误提示栏
	//检测新密码两次输入密码是否相同
	$("input[name=rePassword]").bind("blur",function(){
		if(!isPswEqualRepsw($(this).val())){
			$error.text("两次密码不同");
		}else{
			$error.text("");
		}
	});
	//确认修改
	$("#sureChange").bind("click",function(){
		if(checkForm()){
			postNewPassword();
		}
	});
});

//判断新密码与密码确认输入的密码是否相同
function isPswEqualRepsw(rePsw){
	return rePsw == $("input[name=newPassword]").val();
}

//检查表单是否合法
function checkForm(){
	var $allInput = $("#changePasswordFrm input[type!=button]");
	var $error = $("#news");
	for(var i = 0;i < $allInput.length; ++i){
		if($allInput[i].value == ""){
			$error.text($allInput[i].name + "不能为空");
			return false;
		}
	}
	if(!isPswEqualRepsw($("input[name=rePassword]").val())){
		$error.text("两次密码不同");
		return false;
	}
	return true;
}

//
function postNewPassword(){
	var postData = $("#changePasswordFrm").serialize();
	$.ajax({
		type: "POST",
		url: "/mavenHos/changePassword/changePasswordAjax",
		data: postData,
		dataType: "json",
		success: function(data){
			if(data.changeResult){
				alert("修改成功");
				window.location.href = "/mavenHos";
			}else{
				alert("用户不存在或原密码错误");
			}
		}
	});
}