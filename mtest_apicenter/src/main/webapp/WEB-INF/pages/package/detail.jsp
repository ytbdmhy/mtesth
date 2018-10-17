<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/pages/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title>游戏详情</title>
    <%@ include file="/WEB-INF/pages/common/css.jsp" %>
</head>
<body>
	<div class="wrap">
		<div class="game_head rows">
			<dl class="clearfix">
				<dt class="l">
					<img src="${detail.icon}" alt="">
				</dt>
				<dd class="game_desc">
					<h2>${detail.title}</h2>
					<div class="game_opts">
						<span>${detail.standard_category_name}</span> |
						<span><fmt:formatNumber type="number" value="${detail.download_size / 1024 / 1024}" maxFractionDigits="1"/>M</span>
						| <span>
								<c:if test="${detail.download_count gt 9999}">
									<fmt:formatNumber type="number" value="${detail.download_count / 10000}" maxFractionDigits="1" />万下载
								</c:if>
								<c:if test="${detail.download_count lt 10000}">
									${detail.download_count}下载
								</c:if>
						</span>
					</div>
					<div class="game_star">
					</div>
				</dd>
			</dl>

			<a href="${detail.download_url}" class="load_btn" target="_blank">下载</a>
		</div>

		<div class="game_main">
			<div class="game_tab clearfix">
				<a href="javascript:void(0)" class="tab_active">详情</a>
				<a href="javascript:void(0)">评论</a>
			</div>

			<div class="game_tabcon">
				<div class="game_tabcon_show game_tabcon_detail">
					<div class="game_tabcon_detail_list">
						<div class="game_tabcon_tit">
							<h2>游戏截图</h2>
						</div>
					
						<div class="pic_list">
							<div class="swiper-container">
								<div class="swiper-wrapper">
									<c:forEach items="${detail.screenshot_list}" var="screenshot">
						        		<div class="swiper-slide">
											<img src="${screenshot.preview}" alt="">
										</div>
						        	</c:forEach>
								</div>
							</div>
						</div>	
					</div>
					
					<div class="game_tabcon_detail_list">
						<div class="game_tabcon_tit">
							<h2>小编推荐</h2>
						</div>
						<div class="game_tabcon_con">
							<div class="txt">
								<p>${detail.summary}</p>
							</div>	
						</div>
					</div>
					
					<div class="game_tabcon_detail_list">
						<div class="game_tabcon_tit">
							<h2>简介</h2>
							<i class="icon arrow_down"></i>
						</div>	
						<div class="game_tabcon_con">
							<div class="txt desc_txt">
								<p class="txt_overflow">${detail.description}</p>
							</div>	
						</div>
					</div>
					
					<div class="game_tabcon_detail_list">
						<div class="game_tabcon_tit">
							<h2>适配信息</h2>
						</div>	
						<div class="game_tabcon_con">
							<div class="txt sp_txt">
								${detail.adapted_information}
							</div>	
						</div>
					</div>
					
				</div>

				<div class="game_tabcon_comment">
					<c:forEach var="item" items="${commentList.results}">
						<div class="comment_list">
							<dl class="clearfix">
								<dt>
									<img src="${item.userIcon}" alt="">
								</dt>
								<dd>
									<h2>${item.userName}</h2>
									<p class="comment_txt">${item.comment}</p>
								</dd>
							</dl>
							<span class="comment_time ">${item.submitDate}</span>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>

	<div class="share">
		<dl class="clearfix">
			<dt>
				<img src="http://media.feimo.cn/media/images/topic/2016/11/02/1451-36-997/logo.png" alt="">
			</dt>
			<dd>
				<p>飞魔助手</p>
				<p>海量VR游戏、视频资源</p>
			</dd>
		</dl>

		<a href="http://api.feimo.cn/api/download/clientversion/armeabi/0" class="load_btn" target="_blank">下载</a>
	</div>

		<!-- 指示safari打开 -->
	<div id="openMask">
		<div class="direct_icon"></div>

		<div class="direct_txt">
			<p>点击箭头所指右上角，选择在“safari”中打开~</p>
		</div>
	</div>
</body>
<%@ include file="/WEB-INF/pages/common/mainFooter.jsp" %>
<script>
	// 通过传入styleChange方法的参数来判断用哪种格式的截图显示
	$(document).ready(function(){
		var src = $(".swiper-wrapper").find(".swiper-slide").find("img").attr("src");
		styleChange(src);
	})
	
	function styleChange(src){
		var src = src;
		var img = new Image();
		img.src = src;
		img.onload = function(){
			var w = img.width;
			var h = img.height;
			if (w < h) {
				$(".pic_list").addClass('s_pic');
				var swiper = new Swiper('.swiper-container', {
			        pagination: '.swiper-pagination',
			        slidesPerView: 2.4,
			        spaceBetween: 5,
			        paginationAsRange : true,
			    });
			} else {
				$(".pic_list").removeClass("s_pic");
				$(".pic_list").find('img').attr('src', src);
	
				var swiper = new Swiper('.swiper-container', {
			        pagination: '.swiper-pagination',
			        slidesPerView: 1.6,
			        spaceBetween: 5,
			        paginationAsRange : true,
			    });
			}
		}
	}

	$(".arrow_down").on("touchstart", function(){
		var status = $(".desc_txt").find('p').hasClass("txt_overflow");
		if (status) {
			$(".desc_txt").find('p').removeClass("txt_overflow");
		} else {
			$(".desc_txt").find('p').addClass("txt_overflow");
		}
		
	})
	
	$(".game_tab a").on("touchstart", function(){
		$(this).addClass("tab_active").siblings().removeClass("tab_active");
		$(".game_tabcon>div").eq($(this).index()).addClass("game_tabcon_show").siblings().removeClass("game_tabcon_show");
	})	
	
	var starNum = '${detail.stars_average_int}';
	var starHtml = '';
	var addNum = 5 - parseInt(starNum);
	for(var i = 0; i < starNum; i++) {
		starHtml += '<span class="icon star star_focus"></span>';
	}
	for(var i = 0; i < addNum; i++) {
		starHtml += '<span class="icon star"></span>';
	}
	$(".game_star").append(starHtml);
</script>
</html>