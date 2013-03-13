<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Tim Hagberg - Contact</title>
	</head>
	<body>
		<div id="contactInfo">
			<h3>Contact Information</h3><br/>
			<p>Email: <a href="${emailMailTo}">${emailAddress }</a><br/>
			Phone: ${phoneNumber }<br/>
			Twitter: <a href="${twitterAddress }">${twitterName }</a><br/>
			Facebook: <a href="${facebookAddress }">${facebookName }</a><br/>
			For contact information for references, please contact me.</p>
		</div>
	</body>
</html>