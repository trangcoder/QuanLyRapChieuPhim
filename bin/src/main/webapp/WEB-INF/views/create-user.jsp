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
		  <h1>Hello MVC <small>Create User</small></h1>
		</div>
		<form:form modelAttribute="appUser" action="${pageContext.request.contextPath}/user" method='POST' class="form-horizontal" role="form">
              <form:hidden path="id"/>
               <div style="margin-bottom: 25px" class="input-group">
                   <span class="input-group-addon"><i class="glyphicon glyphicon-usd"></i></span>
                   <form:input class="form-control input-sm" path="username" placeholder="username" />
               </div>
               <div style="margin-bottom: 25px" class="input-group">
                   <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                   <form:password class="form-control input-sm" path="password" placeholder="password" />
               </div>
               <div style="margin-top:10px" class="form-group">
                     <!-- Button -->
                     <div class="col-sm-12 controls">
                     	<input type="submit" id="btn-login" class="btn btn-success" value="OK" />
                     </div>
                 </div>
      	</form:form>  
	</div>
</body>
</html>