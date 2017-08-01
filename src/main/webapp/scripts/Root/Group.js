/**
 * 
 */

$(function(){
	$.ajax({
		type: "post",
		url: "/mavenHos/root/group/test",
		contentType:"application/json",
		data: JSON.stringify({"name":"jack","id":"1"}),
		dataType: "json",
		success:function(data){
			
		}
	});
});