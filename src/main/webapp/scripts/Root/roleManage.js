/**
 * 
 */

$(function(){
	$.ajax({
		type: "POST",
		url: "/mavenHos/user/roleManage/getRoles",
		dataType: "json",
		success: function(data){
			data.push({});
			data.push({});
			$("#tableArea").createTable(data,{
				rows: 8,
				ignoreNull: true,
				headName: new Array("id","角色","角色名"),
				needDate: true,
				createDate: "2017-6",
				lessLength: 3
			});
		}
	});
});