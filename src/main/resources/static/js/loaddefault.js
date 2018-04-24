// JavaScript Document

$(function(){

	loadHtml();
});

function loadHtml(){

	$("#top").load("common/top.html");//顶部
	$("#rigthMenu").load("common/rigthMenu.html");//顶部
	
	$(".list-1").load("common/list-1.html");//栏目1
	$(".list-2").load("common/list-2.html");//栏目2
	$(".list-3").load("common/list-3.html");//栏目3
	
	$("#loadJs").load("common/loadJs.html");//load后执行的js
}