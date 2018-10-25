<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>说说</title>

<link
	href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="http://cdn.bootcss.com/font-awesome/4.4.0/css/font-awesome.min.css"
	rel="stylesheet">

<style type="text/css">
demo {
	padding: 2em 0;
	background: #fff;
}

a, a:hover, a:focus {
	text-decoration: none;
	outline: none;
}

#accordion:before {
	content: "";
	width: 1px;
	height: 90%;
	background: #550527;
	position: absolute;
	top: 20px;
	left: 24px;
	bottom: 20px;
}

#accordion .panel {
	border: none;
	border-radius: 0;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.15);
	margin: 0 0 12px 50px;
	position: relative;
}

#accordion .panel:before {
	content: "";
	width: 2px;
	height: 100%;
	background: linear-gradient(to bottom, #688e26 0%, #ff816a 100%);
	position: absolute;
	top: 0;
	left: -2px;
}

#accordion .panel-heading {
	padding: 0;
	background: #fff;
	position: relative;
}

#accordion .panel-heading:before {
	content: "";
	width: 15px;
	height: 15px;
	border-radius: 50px;
	background: #fff;
	border: 1px solid #550527;
	position: absolute;
	top: 50%;
	left: -48px;
	transform: translateY(-50%);
}

#accordion .panel-title a {
	display: block;
	padding: 15px 55px 15px 30px;
	font-size: 20px;
	font-weight: 600;
	color: #550527;
	border: none;
	margin: 0;
	position: relative;
}

#accordion .panel-title a:before, #accordion .panel-title a.collapsed:before
	{
	content: "";
	font-family: fontawesome;
	width: 25px;
	height: 25px;
	line-height: 25px;
	border-radius: 50%;
	font-size: 15px;
	font-weight: normal;
	color: #688e26;
	text-align: center;
	border: 0px solid #688e26;
	position: absolute;
	top: 50%;
	right: 25px;
	transform: translateY(-50%);
	transition: all 0.5s ease 0s;
}

#accordion .panel-title a.collapsed:before {
	content: "";
}

#accordion .panel-body {
	padding: 0 30px 15px;
	border: none;
	font-size: 14px;
	color: #305275;
	line-height: 28px;
}
</style>

</head>
<body>
	<input type="hidden" value="<%=basePath%>" id="basePath" />
	<div>
		<textarea name="moodText" id="moodText"></textarea>
		<button type="button" id="publishBtn" onclick="darling.addMood();">发表</button>
	</div>
	<hr>

	<div class="demo">
		<div class="container">
			<div class="row">
				<div class="col-md-offset-3 col-md-6">
					<div class="panel-group" id="accordion" role="tablist"
						aria-multiselectable="true">

						<c:forEach items="${moodLogs}" var="moodLog">
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingOne">
									<h4 class="panel-title">
										<a class="collapsed" role="button" data-parent="#accordion"
											href="#collapseOne" display="true"> ${moodLog.user} </a>
									</h4>
								</div>
								<div id="collapseOne" class="panel-collapse collapse in"
									role="tabpanel">
									<div class="panel-body">
										<p>${moodLog.moodText}</p>
										<p>
											<fmt:formatDate value="${moodLog.publishTime}"
												pattern="yyyy-MM-dd HH:mm:ss" />
										</p>
									</div>
								</div>
							</div>
						</c:forEach>

					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="<%=request.getContextPath()%>/resources/js/darling.js"
		type="text/javascript"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-1.8.3.min.js"
		type="text/javascript"></script>
</body>
</html>