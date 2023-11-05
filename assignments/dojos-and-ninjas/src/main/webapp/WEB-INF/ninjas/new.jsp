<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

    <h1>New Dojo</h1>

    <form:form action="/ninjas" method="POST" modelAttribute="ninja">
        <p>
            <form:label path="dojo">dojo</form:label>
            <form:select path="dojo">
            <c:forEach var="dojo" items="${dojos}">
                <form:option value="${dojo}" path="ninja.dojo">${dojo.name}</form:option>
            </c:forEach>                
            </form:select>
        </p>
        <p>
            <form:label path="firstName">firstName</form:label>
            <form:input path="firstName" />
            <form:errors path="firstName" />
        </p>
        <p>
            <form:label path="lastName">lastName</form:label>
            <form:input path="lastName" />
            <form:errors path="lastName" />
        </p>
        <p>
            <form:label path="age">age</form:label>
            <form:input path="age" />
            <form:errors path="age" />
        </p>


        <input type="submit" value="add ninja">


    </form:form>


   
</body>
</html>

