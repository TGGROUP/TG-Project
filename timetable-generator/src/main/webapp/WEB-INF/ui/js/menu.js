$(document).ready(function(){
	$(".main-item").click(function(){
		if(!$(this).hasClass("active")){
			$(".main-item").removeClass("active");
			$(this).addClass("active");
			var a=$(".triangle").css("top");
			if(a=="-5px")
				$(".triangle").css("top","45px");
			else
				$(".triangle").css("top","-5px");
		}
		
	});
	
	$("#delete-ent").click(function(){
		$(this).css("display","none");
	});
	
});