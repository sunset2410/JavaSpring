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

			- Tên sản phẩm: <br /> <input type="text" name="title" size="100" />
			<br /> 
			<br /> 
			- Giá sản Phẩm (VD: 7.490.000₫):
			<br /> <input type="text" name="price" size="100" />
			<br /> 
			<br /> 
			- Mô tả ngắn: 
			<br /> 
			<textarea style="height: 35px; width: 740px"
				name="shortdescription" >
			</textarea>
			<br /> 
			<br /> 
			- Chi tiết sản phẩm: 
			<br /> 
			<textarea  name="content"  style="height: 150px; width: 740px">
			</textarea>			
			<br />
			<br /> 
			- Chọn hình ảnh mô tả của sản phẩm kích thước 700x400:
			<br /> <input type="file" name="file"/> <br /> <br /> <input
				type="submit" value="Upload" style="background-color: #99FFFF;" />
		</form>

	</div>

</body>
</html>