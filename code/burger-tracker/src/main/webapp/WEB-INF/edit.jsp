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
   ${burgers}
    <h1>Edit burger</h1>

   <form:form action="/burgers/${burger.id}" method="POST" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">name</form:label>
        <form:input path="name" />
        <form:errors path="name"/>
    </p>
    <p>
        <form:label path="restaurant">restaurant</form:label>
        <form:input path="restaurant" />
        <form:errors path="restaurant"/>
    </p>
    <p>
        <form:label path="rating">rating</form:label>
        <form:input path="rating" />
        <form:errors path="rating"/>
    </p>

    <input type="submit" value="add burger">
   </form:form>
</body>
</html>