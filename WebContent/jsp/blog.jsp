<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Tim Hagberg - Blog</title>
	</head>
	<body>
		<br/>
		<br />
		<c:if test="${!empty blog}">
			<a href="#comments">Go to Comments</a><br/><br/>
			<h3>${blog.blogTitle} - ${blog.blogDate}</h3>
			<p class="blogBody">${blog.blogBody}</p>
			<br/>
			<div id="social">
			<div class="fb-like" data-send="true" data-width="450" data-show-faces="true"></div>
			<br/><g:plusone></g:plusone>
			</div>
			<br/>
			<div id="comments">
				<h3>Comments</h3>
				<br/>
				<div id="disqus_thread"></div>
				<script type="text/javascript">
				    /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
				    var disqus_shortname = 'timhagbergportfolio'; // required: replace example with your forum shortname
					var disqus_developer = 1;
				    /* * * DON'T EDIT BELOW THIS LINE * * */
				    (function() {
				        var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
				        dsq.src = 'http://' + disqus_shortname + '.disqus.com/embed.js';
				        (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
				    })();
				</script>
				<noscript>Please enable JavaScript to view the <a href="http://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>
				<a href="http://disqus.com" class="dsq-brlink">blog comments powered by <span class="logo-disqus">Disqus</span></a>
			</div>
		</c:if>
		<c:if test="${empty blog}">
			<p>Click the title of a blog to view a preview.</p>
			<script>
				$(document).ready(function() {
									
					getBlogPreviews();
					
					// when a user clicks on the title of a blog preview, the body of the preview,
					// which is not shown by default, should be toggled
					$(document).on("click", ".content .blogTitle", function(){ $(this).next().toggle(); });
				});
			</script>
		</c:if>
		<!-- Google +1 -->
		<script type="text/javascript">
		  (function() {
		    var po = document.createElement('script'); po.type = 'text/javascript'; po.async = true;
		    po.src = 'https://apis.google.com/js/plusone.js';
		    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(po, s);
		  })();
		</script>
	</body>
</html>