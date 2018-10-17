<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/pages/common/taglibs.jsp"%>

<c:set var="requestUrl" value="${param.requestUrl}"/>
<c:set var="paginationObjectName" value="${(not empty param.paginationObjectName)?(param.paginationObjectName):'pagination'}"/>
<c:set var="pageNoName" value="${(not empty param.pageNoName)?(param.pageNoName):'page'}"/>
<c:set var="pagination" value="${requestScope[paginationObjectName]}"/>
<c:set var="totalPages" value="${pagination.totalPages}"/>
<c:set var="curPage" value="${pagination.curPage}"/>
<c:set var="refreshDiv" value="${param.refreshDiv}"/>
<c:choose>
	<c:when test="${!fn:contains(requestUrl,'?') && !fn:contains(requestUrl,'&')}">
		<c:set var="requestUrl" value="${requestUrl}?${pageNoName}"/>
	</c:when>
	<c:otherwise>
		<c:set var="requestUrl" value="${requestUrl}&${pageNoName}"/>
	</c:otherwise>
</c:choose>
<c:if test="${totalPages gt 1}">				
	<div class="pages clearfix">
		<c:choose>
			<c:when test="${curPage==1}">
				<a href="javascript:void(0);" class="prev_btn btn">&lt;</a>
			</c:when>
			<c:otherwise>
				<a href="${requestUrl}=${curPage-1}" class="prev_btn btn">&lt;</a>
			</c:otherwise>
		</c:choose>
		<ul>
			<c:choose>
				<c:when test="${curPage <= 10 }">
					<c:forEach var="n" begin="1" end="${totalPages>10?10:totalPages}" step="1">
						<c:choose>
							<c:when test="${n==curPage}">
								<li><a href="javascript:void(0);" class="current_pages">${n}</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${requestUrl}=${n}">${n}</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</c:when>
				<c:when test="${curPage+5 <= totalPages}">
					<c:forEach var="n" begin="${curPage-4}" end="${curPage+5}" step="1">
						<c:choose>
							<c:when test="${n==curPage}">
								<li><a href="javascript:void(0);" class="current_pages">${n}</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${requestUrl}=${n}">${n}</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<c:forEach var="n" begin="${curPage-4}" end="${totalPages}" step="1">
						<c:choose>
							<c:when test="${n==curPage}">
								<li><a href="javascript:void(0);" class="current_pages">${n}</a></li>
							</c:when>
							<c:otherwise>
								<li><a href="${requestUrl}=${n}">${n}</a></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			<li><a class="more_page">...</a></li>
		</ul>
		<c:choose>
			<c:when test="${curPage==totalPages}">
				<a href="javascript:void(0);" class="next_btn btn">&gt;</a>
			</c:when>
			<c:otherwise>
				<a href="${requestUrl}=${curPage+1}" class="next_btn btn">&gt;</a>
			</c:otherwise>
		</c:choose>
	</div>
</c:if>