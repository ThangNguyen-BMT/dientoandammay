<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
	<jsp:include page="../includes/head.jsp"></jsp:include>
	<body>
	<jsp:include page="../includes/header.jsp"></jsp:include>
		<table class="table table-hover">
			<tr>
				<th>Tên Sản Phẩm</th>
				<th>Xuất Xứ</th>
				<th>Giá Bán</th>
				<th></th>
			</tr>
			<c:forEach var="u" items="${sanpham}">
				<tr>	
					<td>${u.tenSP}</td>
					<td>${u.xuatXu}</td>
					<td>${u.giaBan}</td>
					<td><a href="sanpham/chitiet.htm">Chi tiết</a></td>
					<td><a href="delete/xoaus/${u.maSP}.htm"><button type="button" class="btn btn-primary btn-md">Xóa</button></a></td>
					<td><a href="sanpham/insert.htm"><button type="button" class="btn btn-primary btn-md">Thêm</button></a></td>
					<td><a href="edit/sp/${u.maSP}.htm"><button type="button" class="btn btn-primary btn-md">Sửa</button></a></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>