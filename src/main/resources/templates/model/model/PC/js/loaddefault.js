// JavaScript Document

$(function(){
	loadHtml();
});

function loadHtml(){
	$("#top").load("common/top.html");//椤堕儴
	$("#header").load("common/header.html");//椤堕儴
	$("#indexHeader").load("common/indexHeader.html");//椤堕儴
	$("#rigthMenu").load("common/rigthMenu.html");//椤堕儴
	
	$(".list-1").load("common/list-1.html");//鏍忕洰1
	$(".list-2").load("common/list-2.html");//鏍忕洰2
	$(".list-3").load("common/list-3.html");//鏍忕洰3
	
	$("#loadJs").load("common/loadJs.html");//load鍚庢墽琛岀殑js
}