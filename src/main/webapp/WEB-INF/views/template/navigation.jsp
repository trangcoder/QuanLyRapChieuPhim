<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="">My MVC</a>
    </div>
    <ul class="nav navbar-nav">
	      
	      <li class="dropdown active">
	        <a class="dropdown-toggle" data-toggle="dropdown" href="javascript:void(0)">Admin<span class="caret"></span></a>
	      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Welcome <c:out value="${loggedin}"/></a></li>
      <li><a href="<c:url value="/j_spring_security_logout" />"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
    <a class="btn btn-primary navbar-btn" href="home"><spring:message code="label.new.coin" text="New Request"/></a>
  </div>
</nav>