<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Tim Hagberg - References</title>
	</head>
	<body>
		<div id="referenceContent">
			<c:forEach var="reference" items="${references}">
				<h3>${reference.referenceName}</h3>
				<p>${reference.referenceBody}</p>
				<br/>
			</c:forEach>
		</div>
	</body>
</html>