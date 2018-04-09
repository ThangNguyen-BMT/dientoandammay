<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
	<jsp:include page="../includes/head.jsp"></jsp:include>
	<body>
	<jsp:include page="../includes/header.jsp"></jsp:include>
		<table class="table table-hover">
			<tr>
				<th>Mã sản phẩm</th>
				<th>Tên Sản Phẩm</th>
				<th>Xuất Xứ</th>
				<th>Số lượng</th>
				<th>Đơn vị tính</th>
				<th>Giá nhập</th>
				<th>Giá bán</th>
			</tr>
			<c:forEach var="u" items="${sanpham}">
				<tr>	
					<td>${u.maSP}</td>
					<td>${u.tenSP}</td>
					<td>${u.xuatXu}</td>
					<td>${u.soLuong}</td>
					<td>${u.donViTinh}</td>
					<td>${u.giaNhap}</td>
					<td>${u.giaBan}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="sanpham/insert.htm"><button type="button" class="btn btn-primary btn-md">Thêm</button></a>
	</body>
</html>