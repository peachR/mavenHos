<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>${information.title}</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/font-awesome-4.7.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/ionicons-master/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/dist/css/skins/_all-skins.min.css">

</head>
<body>
	<!-- 消息具体内容显示 -->
	<section class="invoice">
		<div class="col-sm-12">
			<h2 class="page-header">
				${information.title}
				<small class="pull-right">
				${information.releaseUser.name }
				${information.releaseTime.split(' ')[0]}
			</small>
			</h2>
			
		</div>
		<div class="row invoice-info">
			${information.content}
		</div>
	</section>
	
</body>
</html>