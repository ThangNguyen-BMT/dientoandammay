<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="includes/head.jsp"></jsp:include>

	<body>
		<div class="wallpaper">
			<jsp:include page="includes/header.jsp"></jsp:include>
			
			<div id="content">
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-8">
							<div class="noibat">
								<h2 class="title-news">Sản phẩm nổi bật</h2>
								<div class="content-nb">
								</div>
								<div class="list-nb">
								<h3 style="font-size: 16px; font-weight: bold;">RAYBAN22</h3>
									<div class="row">
										<c:forEach var="u" items="${sanpham}">
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/rayban rb3561.jpg" alt="Kính RayBan"></a>
												<h4>
													<a href="#">${u.tenSP}</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">${u.giaBan}</span>
												</div>
											</div>
										</div>
										
										</c:forEach>
										
									</div>
								</div>
								<div class="list-nb">
								<h3 style="font-size: 16px; font-weight: bold;">CHANEL</h3>
									<div class="row">
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/levis1.jpg" alt="Kính Chanel"></a>
												<h4>
													<a href="#">Kính mát Levis LS20268ZA.GS17</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">6,330,00</span>
												</div>
											</div>
										</div>
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/levis2.jpg" alt="Kính Chanel"></a>
												<h4>
													<a href="#">Kính mát Levis LS20066ZA.GS28</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">5,950,000</span>
												</div>
											</div>
										</div>
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/levis3.jpg" alt="Kính Chanel"></a>
												<h4>
													<a href="#">Kính mát Levis LS20069ZAGS27</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">3,880,000</span>
												</div>
											</div>
										</div>
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/levis3.jpg" alt="Kính Chanel"></a>
												<h4>
													<a href="#">Kính mát Levis LS20069ZAGS27</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">3,880,000</span>
												</div>
											</div>
										</div>
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/levis3.jpg" alt="Kính Chanel"></a>
												<h4>
													<a href="#">Kính mát Levis LS20069ZAGS27</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">3,880,000</span>
												</div>
											</div>
										</div>
										<div class="col-xs-4 col-sm-4 col-md-4 style-box">
											<div class="list-post">
												<a href="#"><img src="images/levis3.jpg" alt="Kính Chanel"></a>
												<h4>
													<a href="#">Kính mát Levis LS20069ZAGS27</a>
												</h4>
												<div class="meta">
													<span style="font-size:16px;color:red;">3,880,000</span>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="post-news">
								<div class="quatrang">
									<span>1</span>
									<a href="#">2</a>
									<a href="#">3</a>
									<a href="#">...</a>
									<a href="#">4</a>
									<a href="#">5</a>
									<a href="#">6</a>
									<a href="#">Tiếp theo</a>
								</div>
							</div>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-4">
							<div class="sidebar">
								<div class="widget">
									<h3>Tin tức mới</h3>
									<div class="content-new">
										<ul>
											<li>
												<a href="#"><img src="images/sale.jpg" alt=""></a>
												<h4><a href="#">Chúc mừng năm mới Mậu Tuất 2018 Sale up to 30%</a></h4>
												<div class="meta"><span>Ngày đăng: 28-02-2018</span></div>
												<div class="clear"></div>
											</li>
											<li>
												<a href="#"><img src="images/rayban.jpg" alt=""></a>
												<h4><a href="#">Những bật mí thú vị về mắt kính RAYBAN chính hãng</a></h4>
												<div class="meta"><span>Ngày đăng: 18-02-2018</span></div>
												<div class="clear"></div>
											</li>
											<li>
												<a href="#"><img src="images/tita.jpg" alt=""></a>
												<h4><a href="#">Titanium-Chất liệu đặc trưng được sử dụng trong sản xuất mắt kính</a></h4>
												<div class="meta"><span>Ngày đăng: 03-02-2018</span></div>
												<div class="clear"></div>
											</li>
											<li>
												<a href="#"><img src="images/rayban2.jpg" alt=""></a>
												<h4><a href="#">Mắt kính RAYBAN chưa bao giờ là lỗi mốt của tuổi trẻ</a></h4>
												<div class="meta"><span>Ngày đăng: 27-01-2018</span></div>
												<div class="clear"></div>
											</li>
											<li>
												<a href="#"><img src="images/mo mat.jpg" alt=""></a>
												<h4><a href="#">Mổ mắt xong, cả 4 bệnh nhân đều không nhìn thấy gì</a></h4>
												<div class="meta"><span>Ngày đăng: 12-01-2018</span></div>
												<div class="clear"></div>
											</li>
										</ul>
									</div>
								</div>
								<div class="widget">
									
								</div>
								<div class="widget">
									<h3>Quảng cáo</h3>
									<div class="content-wc">
										<a href="#"><img src="images/quang-cao-coccoc.gif" alt=""></a>
									</div>
								</div>
								</div>
						</div>
					</div>
				</div>
			</div>
			<footer>
				<div class="container">
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-4">
							<div class="block-footer">
								<h3>Văn Phòng</h3>
								<p>27 Nguyễn Tất Thành</p>
								<p>Phường Thành Công</p>
								<p>Thành phố Buôn Mê Thuột</p>
							</div>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-4">
							<div class="block-footer">
								<h3>Chuyên mục</h3>
								<ul>
									<li><a href="#">Mắt Kính Nam</a></li>
									<li><a href="#">Mắt Kính Nữ</a></li>
									<li><a href="#">Gọng Kính</a></li>
									<li><a href="#">Tròng kính</a></li>
								</ul>
							</div>
						</div>
						<div class="col-xs-12 col-sm-12 col-md-4">
							<div class="block-footer">
								<h3>Liên hệ</h3>
								<p>Điện thoại: 01694723322</p>
								<p>Email: thanglak998@gmail.com</p>
								<p>Lên hệ với tôi
						</div>
					</div>
				</div>
				<div class="copyright">
					<p>@copyright by Thangncpk00831@fpt.edu.vn </p>
				</div>
			</footer>
		</div>
		<script src="js/jquery-3.2.1.min.js"></script>
		<script src="libs/bootstrap/js/bootstrap.min.js"></script>
		<script src="js/main.js"></script>
	</body>
</html>