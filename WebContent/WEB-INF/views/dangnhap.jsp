<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!doctype html>

<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<base href="${pageContext.servletContext.contextPath}/">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../../../favicon.ico">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">"

<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">
<style>
.form-signin {
	width: 100%;
	max-width: 330px;
	padding: 15px;
	margin: 0 auto;
}
</style>
</head>

<body class="text-center">

	<form:form class="form-signin" action="dangnhap/dangnhap.htm " 
		modelAttribute="user">
		
		<img class="mb-4"
			src="images/logo1.png"
			alt="" width="72" height="72">
		<h2 class="h3 mb-3 font-weight-normal">ĐĂNG NHẬP</h2>

		<form:input path="tenDangNhap" type="text" id="inputUsername" class="form-control"
			placeholder="Tên đăng nhập"  /><br>
		<form:password path="matKhau" id="inputPassword" class="form-control"
			placeholder="Mật khẩu"  /><br>
		<button class="btn btn-lg btn-danger btn-block"  >Đăng Nhập</button>
				${message1}
				${message}
				${message2}
		<p class="mt-5 mb-3 text-muted">&copy; Mắt kính hiệu</p>

	</form:form>

</body>
</html>