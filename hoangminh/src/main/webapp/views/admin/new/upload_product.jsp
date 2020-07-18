<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Upload sản phẩm</title>
</head>
<body>

	<div style="margin-left: 300px">
		<div style="padding: 5px; color: red; font-style: italic;">
			${errorMessage}</div>

		<h2>Thêm sản phẩm</h2>

		<form method="post"
			action="${pageContext.request.contextPath}/admin-upload-product"
			enctype="multipart/form-data">

			-Tên sản phẩm: <br /> <input type="text" name="title" size="100" />
			<br /> <br /> 
			-Mô tả ngắn: <br /> <input type="text"
				name="shortdescription" size="100" /> <br /> <br /> 
			-Chi tiết sản phẩm: 
			<br /> <input type="text" name="content" size="100" />
			<br /> <br /> -Chọn hình ảnh mô tả của sản phẩm kích thước 700x400:
			<br /> <input type="file" name="file" /> <br /> <br /> <input
				type="submit" value="Upload" style="background-color: coral;" />
		</form>

	</div>

</body>
</html>