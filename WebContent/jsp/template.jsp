<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/custom-theme/jquery-ui.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/reset.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/tim.css"/>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-ui.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/tim.js"></script>
		<title>Tim Hagberg</title>
	</head>
	<body>
		<!-- FB JavaScript SDK -->
		<div id="fb-root"></div>
			<script>(function(d, s, id) {
			  var js, fjs = d.getElementsByTagName(s)[0];
			  if (d.getElementById(id)) return;
			  js = d.createElement(s); js.id = id;
			  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
			  fjs.parentNode.insertBefore(js, fjs);
			}(document, 'script', 'facebook-jssdk'));</script>
		<div class="top">
			<tiles:insertAttribute name="top" />
			<div class="content">
				<tiles:insertAttribute name="content" />	
			</div>
		</div>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</body>
</html>