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
			<h1 class="my-41" style="color:blue; font-size: 30px; margin-top: 50px; margin-left: 20px">Sản Phẩm</h1>
			<div class="list-group1">
				<c:forEach var ="item" items="${categories}">
					<a href="#" class="list-group-item">${item.name}</a> 
				</c:forEach>		
			</div>
		</div>
		<!-- /.col-lg-3 -->


		<div class="col-lg-9">

			<!-- slide show -->
			<div id="carouselExampleIndicators" class="carousel slide my-4"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
				
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
			
			<!-- product list -->
			<div class="row">

				<c:forEach var ="item" items="${model.listResult}">
					<div class="col-lg-4 col-md-6 mb-4">
					<div class="card h-100">
						<a href="${pageContext.request.contextPath}/web-product?id=${item.id}"><img class="card-img-top" style="border-style: solid; border-color: WhiteSmoke; border-width: 2px"
							src="${pageContext.request.contextPath}/${item.thumbnail}" alt=""></a>
						<div class="card-body">
							<h4 class="card-title">
								<a href="${pageContext.request.contextPath}/web-product?id=${item.id}">${item.title}</a>
							</h4>
							<h5>${item.price}</h5>
							<p class="card-text">${item.shortDescription}</p>
						</div>
						<div class="card-footer">
							<small class="text-muted">&#9733; &#9733; &#9733; &#9733;
								&#9734;</small>
						</div>
					</div>
				</div>
				</c:forEach>	
		
			</div>
			<!-- /.row -->

		</div>
		<!-- /.col-lg-9 -->
	</div>
	<!-- /.row -->
	
	
</body>
</html>