<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${group[0].groupID }
	${group[0].name }
	${group[0].member[0].name}
	<script src="/mavenHos/jquery/jquery.min.js"></script>
	<script src="/mavenHos/scripts/Root/Group.js"></script>
</body>
</html>