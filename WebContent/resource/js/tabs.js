// what to do when tabs are selected
function handleSelect(event, tab) {
	if (tab.index == 1) { // blog tab
		getBlogPreviews();
	} else if (tab.index == 3) { // reference tab
		getReferences();
	} else if (tab.index == 5) {
		$("#about").submit();
	}
}

// grab blog previews as JSON with AJAX
function getBlogPreviews() {
	$("#blogContent").empty();
	$.getJSON("/TimWeb/blogPreview", function(data) {
		$.each(data, function(i) {
			$("#blogContent").append("<div class='blogPost'><h3 class=head>" +
					data[i].blogTitle + "</h3>" +
					"<p style='display:none;'>" + data[i].blogBody + "</p></div><br/>");
		});
	});
}

// grab references as JSON with AJAX
function getReferences() {
	$("#referencesContent").empty();
	$.getJSON("/TimWeb/reference", function(data) {
		$.each(data, function(i) {
			$("#referencesContent").append("<div class='reference'><h3 class=head>" +
					data[i].referenceName + "</h3>" +
					"<p>" + data[i].referenceBody + "</p></div><br/>");
		});
	});
}