<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${check[0].item } ${check[0].result } ${check[0].date }
<p>
	<input type="button" id="button" value="click" />
</p>
<button type="button" id="change">update</button>
<button type="button" id="equipment">equipment</button>
<div id="table">
	<table></table>
</div>
<script src="/mavenHos/jquery/jquery.min.js"></script>
<script src="/mavenHos/scripts/tools/createTable.js"></script>
<script src="/mavenHos/scripts/test/test.js"></script>
</body>
</html>