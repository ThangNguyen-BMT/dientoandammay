<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<base href="${pageContext.servletContext.contextPath}/">
<title>Thêm sản phẩm</title>

<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="../vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="../fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="../fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="../vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="../vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="../vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="../vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="../vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="../css/util.css">
	<link rel="stylesheet" type="text/css" href="../css/main.css">
	<link rel="stylesheet" type="text/css" href="../css/main2.css">

<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
.form-signin {
	width: 100%;
	max-width: 500px;
	padding: 15px;
	margin: 0 auto;
}
</style>
    <!-- Custom styles for this template -->
    <link href="album.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

	<jsp:include page="../includes/head.jsp"></jsp:include>
	<div class="toptop" style="color:red; margin: 0 auto;widows: 1170px;height:30px;text-align: center;">
					<span class="toptop">MẮT KÍNH CHÍNH HÃNG 100% - HOÀN TIỀN GẤP 10 NẾU HÀNG FAKE</span>
					<a href="dangnhap/dangnhap.htm"><span style="float:right;color:red;margin-right: 8px;">Đăng Nhập</span></a>
					<a href="sanpham/sanpham.htm"><span style="float:right;color:red;margin-right: 10px;">Sản Phẩm</span></a>
				</div>
	<body>
	
		<form:form class="form-signin" action="sanpham/insert.htm" modelAttribute="sp">
		<h2 class="h3 mb-3 font-weight-normal" style="margin-left:120px">THÊM SẢN PHẨM</h2>
		<img style="margin-left: 200px;" class="mb-4"
			src="images/logo1.png"
			alt="" width="72" height="72">
		
			<div class="wrap-input100 validate-input" data-validate="Nhập họ tên">
				<label>Tên sản phẩm</label>
				<form:input class="form-control" type="text" path="tenSP" />
			</div>
			<div class="form-group">
				<label>xuất xứ</label>
				<form:input class="form-control" type="text" path="xuatXu" />
			</div>
			<div class="form-group">
				<label>Số lượng</label>
				<form:input class="form-control" type="number" max="100" min="1" path="soLuong" />
			</div>
			<div class="form-group">
				<label>Đơn vị tính</label>
				<form:input class="form-control" path="donViTinh" />
			</div>
			<div class="form-group">
				<label>Giá nhập</label>
				<form:input class="form-control" path="giaNhap" />
			</div>
			<div class="form-group">
				<label>Giá bán</label>
				<form:input class="form-control" path="giaBan" />
			</div>
			
			
			<div style="float:right;">
				<button class="btn btn-warning">Thêm mới</button>
			</div>
		</form:form>
	</body>
</html>
