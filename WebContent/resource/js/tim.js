function getBlogPreviews() {
	$(".content").empty();
	$.getJSON("/blogPreview", function(data) {
		$.each(data, function(i) {
			$(".content").append("<div class='blogPost'><h3 class='blogTitle'>" +
					data[i].blogTitle + "     " + data[i].blogDate + "</h3>" +
					"<p class='blogBody' style='display:none;'>" + data[i].blogBody + "<br/><br/>" + 
					"<a href='/blog/" + data[i].blogTitle + "'>Read More</a>" + "</p></div><br/>");
		});
	});
}
