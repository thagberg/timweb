<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
		<title>Tim Hagberg - Work Examples</title>
	</head>
	<body>
		<div class="workExamplesContent">
			<c:forEach var="example" items="${workExamples}">
				<h3><c:out value="${example.workName}" /></h3>
				<p><c:out value="${example.workDescription}" /></p>
				<c:if test="${!empty example.workImageLocation}"><br/><img src="${pageContext.request.contextPath}${example.workImageLocation}" alt="${example.workName} image"/></c:if>
				<c:if test="${!empty example.workDownloadLocation}"><br/><a href="${pageContext.request.contextPath}${example.workDownloadLocation}">Download</a></c:if>
				<br/>
			</c:forEach>
		</div>
	</body>
</html>