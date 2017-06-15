<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>register</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/bootstrap/css/bootstrap.min.css" />
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/font-awesome-4.7.0/css/font-awesome.min.css" />
  <!-- Ionicons -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/ionicons-master/css/ionicons.min.css" />
  <!-- Theme style -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/dist/css/AdminLTE.min.css" />
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="/mavenHos/AdminLTE/dist/css/skins/_all-skins.min.css" />
  <!-- Main css -->
  <link rel="stylesheet" href="/mavenHos/Css/MainCss/MainCss.css" />
  <link rel="stylesheet" href="/mavenHos/Css/MainCss/informationTable.css" />

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition register-page">
	<div class="register-box">
		<div class="register-logo" style="margin-bottom:15px;">
			<a href="">
				<b>Hos</b>
				pital
			</a>
		</div>
		<label id="news"></label>
		<div class="register-box-body">
			<p id="news" class="login-box-msg">请输入信息</p>
			<form id="registerFrm">
      			<div class="form-group has-feedback">
        				<input type="text" name="name" class="form-control" placeholder="Full name">
        				<span class="glyphicon glyphicon-user form-control-feedback"></span>
      			</div>
      			<div class="form-group has-feedback">
        				<input type="text" name="number" class="form-control" placeholder="Number">
        				<span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      			</div>
      			<div class="form-group has-feedback">
        				<input type="password" name="password" class="form-control" placeholder="Password">
        				<span class="glyphicon glyphicon-lock form-control-feedback"></span>
      			</div>
      			<div class="form-group has-feedback">
        				<input type="password" name="rePassword" class="form-control" placeholder="Retype password">
        				<span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      			</div> 
      			<div class="row">    	
      				<div class="col-sm-4"></div>			
        				<div class="col-sm-4">
          				<input id="register" type="button" class="btn btn-primary btn-block btn-flat" value="注册" />
        				</div>
        				<!-- /.col -->
      			</div>
      			<a href="/mavenHos">I aleady have a membership</a>
    			</form>
		</div>
		<!-- end of .register-box-body -->
	</div>
	<!-- end of .register-box -->
	<script src="/mavenHos/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="/mavenHos/scripts/MainScripts/registerJs.js"></script>
</body>
</html>