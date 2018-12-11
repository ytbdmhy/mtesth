<%@ page import="java.util.Date" %>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="/WEB-INF/myElFunction.tld" prefix="myFn" %>
<spring:eval var="resourceVersion" expression="@propertyConfigurer.getProperty('release.version')" />
<spring:eval var="fileServer" expression="@propertyConfigurer.getProperty('file.server')" />

<%
int serverPort = request.getServerPort();
String basePath = "//" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
String basePath80 = "//" + request.getServerName() + request.getContextPath();
%>
<c:if test="${empty resourceVersion}">
	<c:set var="resourceVersion" value="<%=new Date().getTime()%>" />
</c:if>
<c:set var="serverPort" value="<%=serverPort%>"/>
<c:if test="${serverPort!=80}">
	<c:set var="ctx" value="<%=basePath%>"/>
</c:if>
<c:if test="${serverPort==80}">
	<c:set var="ctx" value="<%=basePath80%>"/>
</c:if>
<c:set var="resourceHost" value="//ios-resource.ccplay.cc/static/resource" />
<%--<c:set var="resourceHost" value="${ctx}"  />--%>