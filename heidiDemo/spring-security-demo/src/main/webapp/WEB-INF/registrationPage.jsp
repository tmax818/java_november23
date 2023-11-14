<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Registration Page</title>

</head>
<body>
	<h1 class="test">Register!</h1>

	<p>
		<form:errors path="user.*" />
	</p>

	<form:form method="POST" action="/register" modelAttribute="user">
		<p>
			<form:label path="username">Username:</form:label>
			<form:input path="username" />
		</p>
		<p>
			<form:label path="password">Password:</form:label>
			<form:password path="password" />
		</p>
		<p>
			<form:label path="passwordConfirmation">Password Confirmation:</form:label>
			<form:password path="passwordConfirmation" />
		</p>
		<input type="submit" value="Register!" />
	</form:form>

	<c:if test="${logoutMessage != null}">
		<c:out value="${logoutMessage}"></c:out>
	</c:if>
	<h1>Login</h1>
	<c:if test="${errorMessage != null}">
		<c:out value="${errorMessage}"></c:out>
	</c:if>
	<form:form method="POST" action="/login" modelAttribute="user">
		<p>
			<form:label path="username">Username</form:label> 
			<form:input type="text" id="username" path="username" />
		</p>
		<p>
			<form:label path="password">Password</form:label> 
			<form:input type="password" id="password" path="password" />
		</p>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" /> 
			<input type="submit" value="Login!" />
	</form:form>


</body>
</html>