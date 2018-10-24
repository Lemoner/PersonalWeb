<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>说说</title>
</head>
<body>
	<input type="hidden" value="<%=basePath%>" id="basePath" />
	<div>
		<button type="button" id="publishBtn" onclick="darling.listMood();">列表</button>
	</div>
	<hr>
</body>
<script src="<%=request.getContextPath()%>/resources/script/darling.js"	type="text/javascript"></script>
<script	src="<%=request.getContextPath()%>/resources/script/jquery-1.8.0.min.js" type="text/javascript"></script>
</html>