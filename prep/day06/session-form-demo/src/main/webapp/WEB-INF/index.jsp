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
<html data-bs-theme="dark">
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <div class="container">
        <p><c:out value="${count}"></c:out></p>

        <a class="btn btn-primary" href="/increase">increase</a>
        <a class="btn btn-primary" href="/reset">reset</a>
        <br>
        <br>

        <form action="/process" method="POST">
            <label for="name">Name</label>
            <input type="text" name="name">
            <label for="language"> Favorite langauge
            </label>
            <select name="language" id="language">
                <option value="Java">Java</option>
                <option value="C++">C++</option>
                <option value="C">C</option>
                <option value="Python">Python</option>
            </select>
            <hr>
            <input type="submit" value="submit">
            
        </form>

    </div>
</body>
</html>

