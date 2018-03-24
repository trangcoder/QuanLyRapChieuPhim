<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title><spring:message code="label.demo" text="Demo"/></title>
<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>' />
<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap-theme.min.css"/>'/>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #c6c6c6;
	-webkit-border-radius: 15px;
	-moz-border-radius: 15px;
	border-radius: 15px;
	border: 1px solid #f4f4f4;
}
</style>

</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">    
			<div class="panel panel-info" >
	            <div class="panel-heading">
	                <div class="panel-title"><spring:message code="label.signin" text="Sign in"/></div>
	            </div>     
	
	            <div style="padding-top:30px" class="panel-body" >
	                <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
	                <form name='loginForm' action="<c:url value='j_spring_security_check'/>" method='POST' class="form-horizontal" role="form">
	                            
	                    <div style="margin-bottom: 25px" class="input-group">
	                         <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
	                         <input id="login-username" type="text" class="form-control" name="j_username" value="" placeholder="<spring:message code="label.username" text="Username or email address"/>" autofocus>                                        
	                     </div>
	                        
	                    <div style="margin-bottom: 25px" class="input-group">
	                         <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
	                         <input id="login-password" type="password" class="form-control" name="j_password" placeholder="<spring:message code="label.password" text="Password"/>">
	                     </div>
	
                        <div style="margin-top:10px" class="form-group">
                            <!-- Button -->
                            <div class="col-sm-12 controls">
                              <input type="submit" id="btn-login" class="btn btn-success" value="Login" />
                              <a href="register"><spring:message code="label.register.now" text="Register Now" /></a>
                              <span> | </span>
                              <a href="forgot-password"><spring:message code="label.forgot.password" text="Forgot password?" /></a>
                            </div>
                        </div>
	
                        <div class="form-group">
                            <div class="col-md-12 control">
                                <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                    Need the help?  
                                <a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                    Create ticket here
                                </a>
                                </div>
                            </div>
                        </div>    
	            	</form>     
	            </div>                     
            </div>  
        </div>
	</div>

</body>
</html>