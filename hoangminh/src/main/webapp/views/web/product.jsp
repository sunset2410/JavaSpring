<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product detail</title>
</head>
<body>
	<div style="padding: 30px; margin: 20px;">
		<h2>${model.title}</h2>
		<img
			style="margin-left: 200px; margin-top: 20px; margin-bottom: 5px; align-content: center;"
			style="border-style: solid; border-color: WhiteSmoke; border-width: 2px"
			src="${pageContext.request.contextPath}/${model.thumbnail}" alt="">
		<h5 style="margin-left: 400px; margin-top: 5px; margin-bottom: 5px; align-content: center; color: red; font-size: 10">Giá: ${model.price}</h5>
		<p>${model.content}</p>
	</div>

</body>
</html>