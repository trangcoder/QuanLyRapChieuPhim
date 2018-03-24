<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		  <h1>Hello MVC <small>List User</small></h1>
		</div>
		<table class="table table-responsive">
		<thead>
			<tr>
				<th>ID</th>
				<th>Username</th>
				<th>Pass</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.username}</td>
					<td>${user.password}</td>
					<td>
					<a href="<%=getServletContext().getContextPath()%>/user/update?id=${user.id}" class="btn btn-primary">Update</a>
					<a href="<%=getServletContext().getContextPath()%>/user/delete?id=${user.id}" class="btn btn-danger">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>