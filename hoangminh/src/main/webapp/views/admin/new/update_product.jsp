<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update sản phẩm</title>
</head>
<body>

	<div style="margin-left: 300px">
		<div style="padding: 5px; color: red; font-style: italic;">
			${errorMessage}</div>

		<h2>Update sản phẩm</h2>

		<form method="post"
			action="${pageContext.request.contextPath}/admin-update-product"
			enctype="multipart/form-data">

			- Tên sản phẩm: <br /> <input type="text" name="title" size="100"
				value="${model.title}" /> <br /> <br /> - Giá sản Phẩm (VD:
			7.490.000₫): <br /> <input type="text" name="price"
				value="${model.price}" size="100" /> <br /> <br /> - Mô tả ngắn:
			<br />
			<textarea style="height: 35px; width: 740px" name="shortdescription">
			${model.shortDescription}
			</textarea>
			<br /> <br /> - Chi tiết sản phẩm: <br />
			<textarea name="content" style="height: 150px; width: 740px">
			${model.content}
			</textarea>
			<br /> <br /> - Chọn hình ảnh mô tả của sản phẩm kích thước
			700x400: <br /> <input type="file" name="file" /> <br /> <br /> <input
				type="submit" value="Update" style="background-color: coral;" />
		</form>

	</div>

</body>
</html>