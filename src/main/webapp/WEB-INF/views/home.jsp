<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title><spring:message code="label.home" text="Home Page"/></title>
<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>' />
<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap-theme.min.css"/>'/>

</head>
<body>
	<%@include file="template/navigation.jsp" %>
	<div class="container">
		<div class="page-header" style="margin: 0!important;">
		  <h1>Hello MVC <small>Our demo website</small></h1>
		</div>
	</div>
</body>
</html>