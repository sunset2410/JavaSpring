<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chu</title>
</head>
<body>
	<!-- Page Content -->

	<div class="row">
		<div class="col-lg-3">
			<h1 class="my-4" style="color:blue;">Sản Phẩm</h1>
			<div class="list-group">
				<a href="#" class="list-group-item">Máy sấy lông chó mèo</a> 
				<a href="#" class="list-group-item">Camera các loại</a> 
			</div>
		</div>
		<!-- /.col-lg-3 -->


		<div class="col-lg-9">

			<div id="carouselExampleIndicators" class="carousel slide my-4"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox" style="border-style: groove; border-color: gray; border-width: 1px">
				
					<div class="carousel-item active">
						<img class="d-block img-fluid" src="${pageContext.request.contextPath}/images/slideshows/mayhut1_900_350.png"
							alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block img-fluid" src="${pageContext.request.contextPath}/images/slideshows/mayhut2_900_350.jpg"
							alt="Second slide">
					</div>
					
					<div class="carousel-item">
						<img class="d-block img-fluid" src="${pageContext.request.contextPath}/images/slideshows/logo_900_350.jpg"
							alt="Second slide">
					</div>
									
				</div>
				<a class="carousel-control-prev" style="color:red" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
			
			
			<div id="center_div" style="height: 20px"></div>
			

			<div class="row">
			
				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top" style="border-style: groove; border-color: gray; border-width: 1px"
							src="${pageContext.request.contextPath}/images/products/P1_700_400.png" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Item One</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur!</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

				<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="#"><img class="card-img-top" style="border-style: groove; border-color: gray; border-width: 1px"
							src="${pageContext.request.contextPath}/images/products/P2_700_400.png" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="#">Item Two</a>
							</h4>
							<h5>$24.99</h5>
							<p class="card-text">Lorem ipsum dolor sit amet, consectetur
								adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit
								amet.</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>

			</div>
			<!-- /.row -->


		</div>
		<!-- /.col-lg-9 -->
	</div>
	<!-- /.row -->
	
	
</body>
</html>