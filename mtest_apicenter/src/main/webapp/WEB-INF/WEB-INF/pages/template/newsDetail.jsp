<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/pages/common/taglibs.jsp" %>
<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit">
<meta name="viewport" content="user-scalable=0, width=device-width">
<meta name="format-detection" content="telphone=no, email=no">
<script src='http://static.ccplay.com.cn/static/common/js/jquery.min.js'></script>
<script src='http://static.ccplay.com.cn/static/common/js/scrollLoading.js'></script>
<title>${news.newsTitle }</title>
<style>
html { -ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100% }
body {font:100% "Hiragino Sans GB","Microsoft YaHei",Arial,sans-serif;}
body, h1, h2, h3, h4, h5, p, ul, ol, dl, dd { margin: 0 }
ul,ol{ padding-left: 0; list-style-type: none; list-style-position: inside }
a img{ border: 0 }
.fix, .fix:after{ visibility: hidden; display: block; font-size: 0; content: " "; clear: both; height: 0; overflow: hidden }

.dis-head{padding:15px 15px 0 15px; overflow:hidden}
.dis-head h1{font-size:150%; line-height:120%}
.dis-head span{font-size:12px; display:inline-block; line-height:none}
.dis-head .top span{padding-right:10px; color:#999}

.dis-main{padding:15px 15px 0; overflow:hidden; font-size:100%; line-height:150%; Color: #222;}
.dis-main p {clear: both; padding-bottom:10px; text-align: justify;}
.dis-main img{max-width:100%;display:block;margin:0 auto;}
.dis-main  * {max-width: 100%; box-sizing: border-box; -webkit-box-sizing: border-box; word-wrap: break-word}

.dis-game{border-top:20px solid #eee; border-bottom:20px solid #eee; padding-top:10px}
.dis-game a,.dis-list a{color:#333; text-decoration:none}
.dis-game .title{font-weight:bold; margin-left:10px}
.dis-game .title b{display:inline-block; background:#31B0D5; padding:0 5px ; margin-right:5px; font-weight:100; color:#fff; border-radius:.3em; font-size:12px}
.dis-game .btn{float:right; display:inline-block; padding:1px 10px; border:1px solid #e60000; border-radius:.3em; color:#e60000; margin-right:10px}
.dis-game .img{clear:both; display:block; height:140px; overflow:hidden; padding-top:10px}
.dis-game .img img{max-width:100%;display:block;margin:0 auto;}

.dis-list{background:#fff}
.dis-list .tab-title{padding:10px 10px 10px 0; border-bottom:.5px solid #ddd; margin-left:10px; color:#e60000}
.dis-list li{clear:both; display:block}
.dis-list a{display:block; height:80px; position:relative; margin-left:10px; border-bottom:.5px solid #ddd;}
.dis-list .title{line-height:120%; display:block; padding-top:10px; margin-right:100px; height:40px; overflow:hidden}
.dis-list .img{width:80px; height:60px; position:absolute; top:10px; right:10px}
.dis-list .time{color:#ccc; font-size:12px}

.li-2,.li-3,.li-4,.li-5{width:50%; float:left!important; clear:none!important}
.li-3 a,.li-5 a{margin-left:0px; padding-left:10px; border-left:.5px solid #ddd}
.li-2 img,.li-3 img,.li-4 img,.li-5 img{display:none}
.li-2 .title,.li-3 .title,.li-4 .title,.li-5 .title{margin-right:10px}
li.more{text-align:center; padding:10px; margin-bottom:20px; border-bottom:none; color:#ccc}

.down-cc{background:#f5f5f5; padding:15px; font-size:90%; display:none}
.d-cc-box{background:url(http://static.ccplay.com.cn/static/common/img/favicon.png) no-repeat; background-size:contain; padding-left:10%; position:relative}
.d-cc-install{position:absolute; right:0; top:0; display:inline-block; padding:7px; background:#06F; color:#fff; -moz-border-radius:5px; -webkit-border-radius:5px; border-radius:5px;}

@media only screen and (min-width : 800px) {
html{height:100%}
html{background:#f5f5f5;}
body{width:740px; margin:0 auto; background-color: #FFF;border-left: 1px solid #E8E8E8;border-right: 1px solid #E8E8E8}
.dis-head h1{font-size:170%}
.dis-head{padding:20px 20px 10px 20px}
.dis-main{padding:20px}
.dis-list .tab-title{border-bottom:1px solid #ddd}
.dis-list a{border-bottom:1px solid #ddd;}
.li-3 a,.li-5 a{border-left:1px solid #ddd}
.down-cc{display:none}
}
.share {
	padding-bottom: 3.125rem;
}
.load {
	position: fixed;
	bottom: 0;
	left: 0;
	z-index: 999;
	padding: 0.25rem 3.125%;
	height: 3.125rem;
	width: 100%;
	background: #f7f7f7;
	border-top: 1px solid #d9d9d9;
	-webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
			-ms-box-sizing: border-box;
				box-sizing: border-box;
}
.load img {
	float: left;
	display: block;
	width: 2.625rem;
	height: 2.625rem;
}
.load_txt {
	float: left;
	margin: 0 0 0 0.5rem;
	font-size: 0.625rem;
	color: #636363;
}
.load_txt h2 {
	font-size: 0.875rem;
	color: #000;
	line-height: 1.5rem;
}
.btn {
	display: block;
	width: 3rem;
	height: 1.25rem;
	color: #FFF;
	text-align: center;
	font-size: 0.75rem;
	background: #ff5455;
	line-height: 1.25rem;
	border-radius: 0.25rem;
}
.load_btn {
	float: right;
	text-decoration: none;
	margin: 0.6875rem 0 0;
}
#openMask {
	display: none;
	position: fixed;
	top: 0;
	left: 0;
	z-index: 1001;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, 0.7);
}
.direct_icon {
	position: absolute;
	top: 0.375rem;
	right: 1.875rem;
	height: 1.8125rem;
	width: 2.25rem;
	background: url(../images/direct_icon.png) center no-repeat;
	background-size: 100%;
}
.direct_txt {
	padding: 1rem 1.625rem;
	margin: 3.125rem auto 0;
	width: 12.875rem;
	color: #FFF;
	font-size: 1rem;
	background: rgba(0, 0, 0, 0.8);
	border: 1px solid #4b5c63;
	border-radius: 0.25rem;
	line-height: 1.25rem;
}
.share {
	display: none;
	position: fixed;
	bottom: 0;
	left: 0;
	padding: 0.3125rem 4%;
	width: 96%;
	height: 2.6875rem;
	background: #FFF;
	border-top: 1px solid #dbdbdb;
}
.share dt {
	float: left;
}
.share dt img {
	display: block;
	width: 2.625rem;
	height: 2.625rem;
}
.share dd {
	margin: 0 0 0 3.3125rem;
}
.share dd p {
	font-size: 0.75rem;
	color: #1e1e1e;
}
.share dd p:nth-child(1) {
	font-size: 0.8125rem;
	line-height: 1.5rem;
}
.share dd p:nth-child(2) {
	color: #636363;
}
.share .load_btn {
	top: 0.25rem;
	right: 8%;
	background: #ff5455;
	color: #FFF;
	border: none;
}
.share a {
	text-decoration: none;
}
.tag {
	display: inline-block;
	margin-top: -2px;
	vertical-align: middle;
	padding: 0.0625rem 0.15625rem;
	color: #67b2ff;
	font-size: 0.6875rem;
	line-height: 1;
	text-align: center;
	border: 1px solid #67b2ff;
}
.load_btn {
	position: absolute;
	top: 0.25rem;
	right: 4%;
	font-size: 0.8125rem;
	text-align: center;
	color: #ff9c00;
	height: 1.375rem;
	width: 3.3125rem;
	border: 1px solid #fe9b00;
	line-height: 1.375rem;
	-webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
			-ms-box-sizing: border-box;
				box-sizing: border-box;
	border-radius: 0.25rem;
}
</style>
</head> 
<body>
<input type="hidden" name="deviceType" id="deviceType" value="${deviceType}">
<div class="page news-dis">
	<div class="dis-head">
    		<h1>${news.newsTitle}</h1>
            <div class="top">
              	<span class="author">${news.source}</span>
            	<span class="time">${news.releasedDatetime}</span>
               <%--  <span class="number">有${news.visitsnum }人看过</span> --%>
            </div>
    </div><!--/dis-head--> 
    
    <div class="dis-main">
		${news.newsContent }
    </div>
    <!--/dis-main-->
    
</div><!--/news-dis-->

	<%-- <div class="share web">
		<dl class="clearfix">
			<dt>
				<a href="#"><img src="${news.packageIcon}" alt=""></a>
			</dt>
			<dd>
				<a href="#">
					<p>飞魔助手</p>
					<p>海量VR游戏、视频资源</p>	
				</a>
			</dd>
		</dl>

		<a href="#" class="load_btn">下载</a>
	</div>
	
	<div class="share ios">
		<dl class="clearfix">
			<dt>
				<a href="javascript:void(0)"><img src="${news.packageIcon}" alt=""></a>
			</dt>
			<dd>
				<a href="javascript:void(0)">
					<p>${news.packageTitle}</p>
					<p>${news.packageSize}</p>	
				</a>
			</dd>
		</dl>

		<a href="https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewSoftware?id=${iosShopAppId}" class="load_btn">下载</a>
	</div>
	
	<div class="share android">
		<dl class="clearfix">
			<dt>
				<a href="#"><img src="${news.packageIcon}" alt=""></a>
			</dt>
			<dd>
				<a href="javascript:void(0)">
					<p>${news.packageTitle}</p>
					<p><span class="android_size">0</span>M | <span class="downCount"></span>下载</p>	
				</a>
			</dd>
		</dl>

		<a href="m25258://download_app?apkName=${news.packageTitle}&pkgName=${news.packageName}&url=${news.downloadUrl}&iconUrl=${news.packageIcon}&size=${news.packageSize}" class="load_btn">下载</a>
	</div> --%>

 <script type="text/javascript">
	$(function() {
		$(".dis-main img").each(function() {
			var _this = $(this);
			_this.attr("data-original", _this.attr("src"));
			_this.removeAttr("src");
			_this.addClass("lazy");
		});
		$(".dis-main img.lazy").scrollLoading({
			attr : "data-original"
		});
		$.get("http://api.feimo.cn/api/news/updateVisits/${news.id}");

		var loadStatus = $("#deviceType").val();	// 判断是否为应用内打开
		
		if(loadStatus == '') {	// web内打开事件
			var u = navigator.userAgent;
			var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端
			var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
			if(isiOS) {
				$(".web").find('.load_btn').attr("href", 'http://www.baidu.com');
			}
			if(isAndroid) {
				$(".web").find('.load_btn').attr("href", 'http://www.sinna.com');
			}
		}
		
		var downCount = parseInt('${news.downloadCount}');
		if(downCount >= 10000) {
			var sCount = parseFloat(downCount / 10000).toFixed(2);
			$(".downCount").text(sCount + '万');
		} else {
			$(".downCount").text(downCount);
		}
		
	 	switch(loadStatus) {
	 		case 'ios':
	 			$(".ios").show();
	 			break;
	 		case 'android':
	 			$('.android').show();
	 			var num = '${news.packageSize}';
	 			var size = parseFloat(num/1024/1024).toFixed(2);
	 			$(".android_size").text(size);
	 			break;
	 		case '':
	 			$(".web").show();
	 			break;
	 	}
	});
</script>
  
</body>
<script type="text/javascript">
	if(getQueryString("share") == "Y"){
	  $(".load").show();
	}else{
	  $(".load").hide();
	}
	function getQueryString(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
		var r = window.location.search.substr(1).match(reg);
		if (r != null)
			return unescape(r[2]);
		return null;
	}
	
	// 分享下载按钮事件
	/* $(".load_btn").on("touchstart", function(){
		var status = isWeiXin();
		if (status) {
			$("#openMask").show();
		} else {
			window.location = 'https://itunes.apple.com/WebObjects/MZStore.woa/wa/viewSoftware?id=1115971809';
		}
	}) */

		// 判断是否为微信客户端
	function isWeiXin(){ 
	    var ua = window.navigator.userAgent.toLowerCase(); 
	    if(ua.match(/MicroMessenger/i) == 'micromessenger'){ 
	        return true; 
	    } else { 
	       	return false; 
	    } 
	} 
		
	$('img').each(function(){
		$(this).css({
			'max-width':'100%',
			"height" : "auto",
			"margin" : "0.625rem 0"
		});
	})
	
	$(".dis-main a").each(function(){
		if(!$(this).hasClass('add_link')) {
			$(this).attr('href', 'javascript:void(0)');
		}
	}) 
	$(".dis-main p").each(function(){
		$(this).attr("background-color", '#FFF');
	}) 
</script>
</html>
    