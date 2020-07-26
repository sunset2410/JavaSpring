<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Settings</title>
</head>
<body>
	<div style="margin-left: 300px">
		<div style="padding: 5px; color: red; font-style: italic;">
			${errorMessage}</div>

		<h2>Settings</h2>

		<form method="post"
			action="${pageContext.request.contextPath}/admin-settings"
			enctype="multipart/form-data">
			 <h3>Chọn 3 hình ảnh slideshow kích thước "900X350" với định dạng ảnh ".png" và tên file đặt là "1.png", "2.png", "3.png":</h3> 
			 <br/> 
			 <input type="file" name="file 1" /> 
			  <br />
			 <input type="file" name="file 2" /> 
			  <br />
			 <input type="file" name="file 3" /> 
			  <br/>
			  <input type="submit" value="Upload" style="background-color: #99FFFF;" />
		</form>

	</div>
</body>
</html>