<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/api-admin-new" />
<c:url var="NewURL" value="/admin-new" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách bài viết</title>
</head>

<body>
	<div class="main-content">
		<form action="<c:url value='/admin-new'/>" id="formSubmit"
			method="get">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
								chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							<div class="col-xs-12">
								<div class="table-responsive">
									<table class="table">
										<thead>
											<tr>
												<th scope="col">Ten bai viet</th>
												<th scope="col">Mo ta ngan</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>Mark</td>
												<td>Otto</td>
											</tr>
											<tr>
												<td>Jacob</td>
												<td>Thornton</td>
											</tr>
											<tr>
												<td>Larry</td>
												<td>the Bird</td>
											</tr>
										</tbody>
									</table>
									<ul class="pagination" id="pagination"></ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		$(function () {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages: 20,
				visiblePages: 7,
				onPageClick: function (event, page) {
					console.info(page + ' (from options)');
				}
			}).on('page', function (event, page) {
				console.info(page + ' (from event listening)');
			});
		});
	</script>
	
</body>

</html>