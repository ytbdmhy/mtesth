<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/pages/common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <link rel="stylesheet" href="${resourceHost}/css/forum_common.css">
    <title>ccplay</title>
    <script>
        ;(function (doc, win) {
            var docEl = doc.documentElement,
                resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize';
            function recalc() {
                var clientWidth = docEl.clientWidth;
                if (!clientWidth) return;
                var size = (clientWidth / 720) * 100;
                docEl.style.fontSize = (size < 100 ? size : 100) + 'px';

                // var realfz = window.getComputedStyle(document.getElementsByTagName("html")[0]).fontSize.replace('px','')
                // if (size !== realfz) {
                //     if (size < 100) {
                //         document.getElementsByTagName("html")[0].style.cssText = 'font-size: ' + size * (size / realfz) +"px";
                //     } else {
                //         docEl.style.fontSize = '100px';
                //     }
                // }
            };

            if (!doc.addEventListener) return;
            win.addEventListener(resizeEvt, recalc, false);
            doc.addEventListener('DOMContentLoaded', recalc, false);
            recalc();
        })(document, window);
    </script>
</head>
<body>
<div class="wrap">
    <div class="loadbar">
        <dl class="dl">
            <dt>
                <img src="${resourceHost}/images/logo.png" alt="">
            </dt>
            <dd>
                <p class="tit">虫虫游戏</p>
                <p>资讯互动，就上虫虫助手</p>
            </dd>
        </dl>
        
        <a href="javascript:downloadHref()" class="btn" id="downloadHref"></a>
        <a href="ccplay://" class="btn-lg" id="ccplay">打开虫虫助手</a>
            
    </div>

    <div class="main">
        <%--<div class="appbar">--%>
            <%--<dl class="dl">--%>
                <%--<dt>--%>
                    <%--<img src="${resourceHost}/images/pic-app.png" alt="">--%>
                <%--</dt>--%>
                <%--<dd>--%>
                    <%--<p class="tit">新闻资讯</p>--%>
                    <%--<p class="app-opts">--%>
                        <%--<span>今日：689</span>--%>
                        <%--<span>贴子：897</span>--%>
                    <%--</p>--%>
                <%--</dd>--%>
            <%--</dl>--%>
        <%--</div>--%>

        <div class="posts">
            <div class="posts-author">
                <dl class="dl">
                    <dt>
                        <img src="${subjectDetail.userIcon}" alt="">
                    </dt>
                    <dd>
                        <p class="tit">${subjectDetail.authorName}</p>
                        <p class="create_time_comment">${subjectDetail.createTime}</p>
                    </dd>
                </dl>
            </div>

            <div class="posts-wrap">
                <h1 class="posts-tit">${subjectDetail.title}</h1>
                <div class="posts-content">
                    <p>${subjectDetail.content}</p>
                </div>
                <div class="upload_append_list game-pic-list" id="imagePreviewDiv" align="center">
                    <c:if test="${not empty subjectDetail.videoFileUrl}">
                        <section>
                            <video controls="controls" name="media" id="media" x5-video-player-type="h5" x5-video-player-fullscreen="true" playsinline="true" webkit-playsinline="true">
                                <source src="${subjectDetail.videoFileUrl}" type="video/mp4" class="upload_image">
                            </video>
                        </section>
                    </c:if>
                </div>

                <a href="javascript:downloadHref()" class="btn-lg">下载app讨论参加或发帖</a>

            </div>
        </div>
    </div>

    <div class="comments">
        <div class="comments-head">
            <span>共${commentList.count}个人回帖</span>
        </div>
        <div class="comments-body">
            <div class="comments-list">
                <c:forEach items="${commentList.results}" var="item">
                    <div class="c-item">
                        <div class="c-author">
                            <dl class="dl">
                                <dt>
                                    <img src="${item.userIcon}" alt="">
                                </dt>
                                <dd>
                                    <p class="tit">${item.authorName}</p>
                                    <p>
                                        <span>${item.floor}楼</span>
                                        <span class="create_time_comment">${item.createTime}</span>
                                    </p>

                                    <div class="c-content">
                                        <p>${item.replyContent}</p>
                                        <c:if test="${not empty item.picList}">
                                            <c:forEach items="${item.picList}" var="pic">
                                                <p>
                                                    <img src="${pic}" alt="">
                                                </p>
                                            </c:forEach>
                                        </c:if>

                                        <div class="c-opts">
                                            <a href="javascript:void(0)" class="download">
                                                <i class="icon icon-like"></i> 0
                                            </a>

                                            <a href="javascript:void(0)" class="download">
                                                <i class="icon icon-comment"></i> 回复
                                            </a>
                                        </div>
                                    </div>
                                </dd>
                            </dl>
                        </div>
                    </div>
                </c:forEach>
            </div>

            <div class="more">
                <a href="javascript:void(0)" class="download">点击加载更多</a>
            </div>
        </div>
    </div>

    <div class="loadbar">
        <dl class="dl">
            <dt>
                <img src="${resourceHost}/images/logo.png" alt="">
            </dt>
            <dd>
                <p class="tit">虫虫游戏</p>
                <p>资讯互动，就上虫虫助手</p>
            </dd>
        </dl>

        <a href="javascript:downloadHref()" class="btn" id="downloadHref2"></a>

    </div>
</div>

<div class="modal">
    <div class="modal-mask"></div>
    <div class="modal-content">
        <div class="modal-box">
            <a href="javascript:void(0)" class="btn-modal-close"></a>
            <h2>提示</h2>
            <p>点击下方下载按键下载应用参与讨论与互动</p>

            <a href="javascript:downloadHref()" class="btn-lg">下载</a>

        </div>
    </div>
</div>

<script src="${resourceHost}/js/zepto.min.js"></script>
</body>
<script>
    var deviceType = window.navigator.userAgent.toLowerCase();

    $(".download").on("click", function () {
        $(".modal").show();
    })
    $(".btn-modal-close").on("click", function () {
        $(this).parents(".modal").hide();
    })

    // 初始化评论时间
    $(".create_time_comment").each(function () {
        if (!$(this).hasClass("time_init")) {
            var times = parseInt($(this).text());
            var test = getDateDiff(times * 1000);
            $(this).text(test).addClass('time_init');
        }
    })

    function getDateDiff(dateTimeStamp){
        var minute = 1000 * 60;
        var hour = minute * 60;
        var day = hour * 24;
        var halfamonth = day * 15;
        var month = day * 30;
        var now = new Date().getTime();
        var diffValue = now - dateTimeStamp;
        if(diffValue < 0){return;}
        var monthC =diffValue/month;
        var weekC =diffValue/(7*day);
        var dayC =diffValue/day;
        var hourC =diffValue/hour;
        var minC =diffValue/minute;

        if(dayC >= 1){
            result = getDate(dateTimeStamp);
        } else if(hourC>=1){
            result=""+ parseInt(hourC) +"小时前";
        } else if(minC>=1){
            result=""+ parseInt(minC) +"分钟前";
        } else {
            result="刚刚";
        }
        return result;
    }

    function getDate(timeStamp){
        var date = new Date(timeStamp);
        var years = date.getFullYear();
        var month = date.getMonth() + 1
        var day = date.getDate();
        if (month < 10) {
            month = '0'+month;
        }
        if (day < 10) {
            day = "0"+day;
        }
        return years + "-" + month + "-" + day;
    }

    function downloadHref() {
        if(deviceType.indexOf("android")!=-1){
            window.location.href = "http://android-api.ccplay.cc/api/v3/download/client/com.lion.market";
        }else if(deviceType.indexOf("iphone")!=-1){
            window.location.href = "itms-apps://itunes.apple.com/cn/app/id1438603958?id=8";
        }else {
            window.location.href = "http://www.ccplay.cc/";
        }
    }

    $(function () {
        if(deviceType.indexOf("android")!=-1){
            document.getElementById("downloadHref").innerHTML = "下载";
            document.getElementById("downloadHref2").innerHTML = "下载";
            $("#ccplay").hide();
            document.getElementById("media").setAttribute("style","width:100%;height:100%");
        } else if (deviceType.indexOf("iphone")!=-1) {
            document.getElementById("downloadHref").innerHTML = "下载";
            document.getElementById("downloadHref2").innerHTML = "下载";
            document.getElementById("media").setAttribute("style","width:100%;height:100%");
        } else {
            document.getElementById("downloadHref").innerHTML = "官网";
            document.getElementById("downloadHref2").innerHTML = "官网";
            $("#ccplay").hide();
            document.getElementById("media").setAttribute("style","width:;height:");
        }
    })

</script>
</html>