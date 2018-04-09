<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<base href="${pageContext.servletContext.contextPath}/">
<title>W3.CSS</title>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<!-- Bootstrap core CSS -->
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
<header>
	
	
</header>

<body class="text-center">
<h2 class="h3 mb-3 font-weight-normal" style="margin-left:10px">SỬA SẢN PHẨM</h2>
		<img style="margin-left: 10px;" class="mb-4"
			src="images/logo1.png"
			alt="" width="72" height="72">
	<form class="form-signin" action="edit/suasp.htm" method="POST">
		
		<input hidden="" name="maSP" value="${sanpham.maSP}">
		
		
		
		<label class="form-group">Tên Sản Phẩm</label>
		<input name="tenSP" type="text" value="${sanpham.tenSP}" class="form-control" placeholder="Tên Sản Phẩm" />
		<br />
		<label>Giá Nhập</label>
		<input name="giaNhap" value="${sanpham.giaNhap}" class="form-control" placeholder="Giá Nhập" />
		<br />
		<label class="form-group">Giá Bán</label>
		<input name="giaBan" type="text" value="${sanpham.giaBan}" class="form-control" placeholder="Giá Bán" />
		<br />
		<label class="form-group">Số Lượng</label>
		<input name="soLuong" type="text" value="${sanpham.soLuong}" class="form-control" placeholder="Số Lượng" />
		<br />
		<label class="form-group">Xuất Xứ</label>
		<input name="xuatXu" value="${sanpham.xuatXu}" class="form-control"
			placeholder="Xuất Xứ" />
		<br />
		<button class="btn btn-warning" type="submit">Sửa Sản Phẩm</button>
		${message}
		<p class="mt-5 mb-3 text-muted">&copy; Mắt Kính Hiệu</p>
	</form>
</body>
</html>