//存放主要交互逻辑的js代码
// javascript 模块化(package.类.方法)

var darling = {

	//封装秒杀相关ajax的url
	URL : {
		add : function() {
			return $("#basePath").val()+'darling/add';
		},
		list : function() {
			return $("#basePath").val()+'darling/list';
		}
	},

	//验证内容
	validateMoodText : function(text) {
		if (!text && text.length == 0) {
			return false;//直接判断对象会看对象是否为空,空就是undefine就是false;
		} else {
			return true;
		}
	},

	//发布说说
	addMood : function() {
		var moodText = $("#moodText").val();
		if (darling.validateMoodText(moodText)) {
			var addUrl = darling.URL.add();
			$.ajax({
				url : addUrl,
				type : "POST",
				dataType : "text",
				success : function() {
					alert("success");
				},
				data : {
					"moodText" : moodText
				}
			});
		} else {
			alert("不能为空!!!");
		}
	},

}