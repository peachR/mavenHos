/**
 * 
 */
$(function(){
	$("#button").bind("click",function(){
		$.ajax({
			type: "get",
			url: "/mavenHos/test/addGroup"
		});
	});
	$("#change").bind("click", function(){
		$.ajax({
			type: "get",
			url: "/mavenHos/test/updateGroup"
		});
	});
	$("#equipment").bind("click", function(){
		$.ajax({
			type: "get",
			url: "/mavenHos/test/showEquipment",
			dataType: "json",
			success: function(data){
				$("#table").createTable(data,{
					
				});
			}
		});
	});
});