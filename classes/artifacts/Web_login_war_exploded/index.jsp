<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="icon" href="favicon.ico" type="image/x-icon"/>
<link rel="stylesheet" type="text/css" href="main.css"/>
	<base href="http://localhost:2244/Web_login/">
</head>

<body>
<div id="panel">
	<span id="toptop"></span>
	<form action="/LoginServlet" method="post">
		<div id="form">
			<font id="top">织音网登陆系统</font><br>
			<div id="user">
				<label for="user">
  账号:

				</label><input id="userin" type="text" style="font-size:20px;font-weight: 750;color: white;" placeholder="请输入用户帐号" name="username">
<!-- 				<br> -->
<!-- 				<span id="msg" style="color:red;font-weight: 750;margin-top:20px;"></span> -->
			</div>
			<div id="pass">
				<label for="pass"> 密码:</label><input id="passin" type="password" style="font-size:20px;font-weight: 750;color: white;" placeholder="请输入用户密码" name="password">
			</div>
			<input type="submit" value="进入系统" style="font-size:20px;font-weight: 750;color: white;" id="button">
		</div>
	</form>
	<span id="leftleft"></span>
</div>

<!-- 
	以/开头的路径即为绝对路径
	绝对路径中的/代表什么？
		如果路径由浏览器解析，那么/代表http://localhost:8080/
		路径由浏览器解析的如下：
			1）html标签中的路径，入a标签的中的href属性、form标签中的action属性中的路径等
			2）重定向中路径
		如果路径由服务器解析，那么/代表http://localhost:8080/文件夹/
		由服务器解析的路径：
			1）web.xml配置文件中的url-pattern标签中的路径
			2）转发中的路径




 -->

</body>
</html>
