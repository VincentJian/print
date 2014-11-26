zk.print = function(uuid, uri, cssuri) {
	if (uuid && uri) {
		var wgt = zk.Widget.$(uuid),
			body = document.body,
			ifr = jq('#zk_printframe');
		if (!ifr[0]) {
			jq(body).append('<iframe id="zk_printframe" name="zk_printframe"' +
				' style="width:0;height:0;border:0;position:fixed;"'+
				'></iframe>');
			ifr = jq('#zk_printframe');
		}
		// wait form submit response then call print function
		// reference: http://isometriks.com/jquery-ajax-form-submission-with-iframes
		ifr.unbind('load.ajaxsubmit').bind('load.ajaxsubmit', function() {
			var iw = ifr[0].contentWindow || ifr[0];
			iw.document.body.focus();
			iw.print();
		});
		
		jq(body).append('<form id="zk_printform" action="' + uri + '" method="post" target="zk_printframe"></form>');
		var form = jq('#zk_printform'),
			content = '<div style="width: ' + wgt.$n().offsetWidth + 'px">' + jq(wgt.$n())[0].outerHTML + '</div>';
		form.append(jq('<input/>').attr({name: 'printContent', value: content}));
		if (cssuri) {
			form.append(jq('<input/>').attr({name: 'printStyle', value: cssuri}));
		}
		form.submit().remove();
	} else {
		window.print();
	}
}