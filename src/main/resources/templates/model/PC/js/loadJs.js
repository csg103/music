// JavaScript Document

$(function(){
	//轮播栏目
	$(".swiperBox").each(function(i,elem){
		var btnnl = $(this).find(".swiper-button-next").addClass("swiper-button-next"+i);
		var btnnR = $(this).find(".swiper-button-prev").addClass("swiper-button-prev"+i);
		var swiper = new Swiper($(this).find('.swiper-container'), {
		    slidesPerView: 4,
		    spaceBetween: 30,
		    slidesPerGroup: 4,
		    loop: true,
		    loopFillGroupWithBlank: false,
		    navigation: {
		        nextEl: btnnl,
		        prevEl: btnnR,
		    },
		    on: {
			    resize: function(){
			    	swiper.update();
			    	setTimeout(function(){
			    		swiper.update();
			    	},200)
			    	
			      //窗口变化了
			    }, 
			},
		});
	});
	
	//栏目标题
	$(".title-1").each(function(){
		$(this).find("h2").find("a").text($(this).parents(".menuTitle").attr("cnTitle"));
		$(this).find("h2").find("a").attr("href",$(this).parents(".menuTitle").attr("href"));
		$(this).find("h3").find("span").text($(this).parents(".menuTitle").attr("enTitle"));
	})
	
	//视频滑入播放 开始
	$(".videoBox li").mouseover(function(){
		$(this).find("video").css("z-index","20")
		$(this).find("video")[0].play()
	})
	$(".videoBox li").mouseout(function(){
		$(this).find("video").css("z-index","0")
		$(this).find("video")[0].pause()
	})
	//视频滑入播放 结束
	
	//左侧电梯
	if($(".js_floor").length>=1){
		var leftMenu = '<div class="leftMenu">'
			leftMenu+= '<ul></ul>'
			leftMenu+= '</div>'
		$("body").append(leftMenu)
	}
	$(".js_floor").each(function(i,elem){
		var li = "<li>";
			li+= $(this).attr("floorTitle");
			li+= "</li>";
		$(".leftMenu ul").append(li);
	})
	$(".leftMenu").css("margin-top",-$(".leftMenu").height()/2)
	$(".leftMenu").delegate("li","click",function(){
		var liTop = $(".js_floor").eq($(this).index()).offset().top;
		$('body,html').stop().animate({scrollTop:liTop},1000);
	})
});