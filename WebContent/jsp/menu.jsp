<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Tim Hagberg</title>
</head>
<body>
	<div class="pageHeader">
		<div id="logo">
			<img src="${pageContext.request.contextPath}/resource/images/timhagberglogo.jpg" alt="Tim Hagberg"/>
		</div><br/><br/><br/>
		<div id="welcomeMessage">Professional Enterprise Web Engineer</div>
		
		<!-- navigation menu -->
		<div class="buttons">
			<ul id="topMenu">
				<li id="homeButton"><button>Home</button></li>
				<li id="blogButton"><button>Blog</button></li>
				<li id="resumeButton"><button>Résumé</button></li>
				<li id="referencesButton"><button>References</button></li>
				<li id="examplesButton"><button>Work Examples</button></li>
				<li id="aboutButton"><button>About Me</button></li>
				<li id="contactButton"><button>Contact</button></li>
			</ul>
			
			<form id="home" action="${pageContext.request.contextPath}/home"></form>
			<form id="blog" action="${pageContext.request.contextPath}/blog"></form>
			<form id="resume" action="${pageContext.request.contextPath}/resume"></form>
			<form id="references" action="${pageContext.request.contextPath}/references"></form>
			<form id="examples" action="${pageContext.request.contextPath}/workexamples"></form>
			<form id="about" action="${pageContext.request.contextPath}/about"></form>
			<form id="contact" action="${pageContext.request.contextPath}/contact"></form>
			
		</div>
	</div>
	
	<script>
		$(document).ready(function() {
			
			$("button", "#topMenu").button();
			
			$("#homeButton").click(function() {
				$("#home").submit();
			});
			
			$("#blogButton").click(function() {
				$("#blog").submit();
			})
			
			$("#resumeButton").click(function() {
				$("#resume").submit();
			});
			
			$("#referencesButton").click(function() {
				$("#references").submit();
			});
			
			$("#examplesButton").click(function() {
				$("#examples").submit();
			});
			
			$("#aboutButton").click(function() {
				$("#about").submit();
			});
			
			$("#contactButton").click(function() {
				$("#contact").submit();
			});

		});
	</script>
</body>
</html>