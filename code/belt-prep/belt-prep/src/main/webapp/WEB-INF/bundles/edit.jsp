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
<html  data-bs-theme="dark">
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <h1>Welcome, ${user.userName}</h1>

    <h3>Add a name</h3>

    <form:form action="/bundles/${bundle.id}" method="POST" modelAttribute="bundle">
        <input type="hidden" name="user" value="${userId}">
        <input type="hidden" name="_method" value="put">
        <p>
            <form:label path="name">name</form:label>
            <form:input path = "name" />
            <form:errors path = "name" />
        </p>
        <p>
            <form:label path="gender">artist</form:label>
            <form:select path="gender">
                    <form:option value="MALE" >male</form:option>
                    <form:option value="FEMALE" >female</form:option>
                    <form:option value="NEUTRAL" >neutral</form:option>
            </form:select>
            <form:errors path = "gender" />
        </p>
        <p>
            <form:label path="origin">origin</form:label>
            <form:input path = "origin" />
            <form:errors path = "origin" />
        </p>

        <p>
            <form:label path="meaning">meaning</form:label>
            <form:input path = "meaning" />
            <form:errors path = "meaning" />
        </p>
     
        <p>
            <form:label path="year">year</form:label>
            <form:input path = "year" />
            <form:errors path = "year" />
        </p>

        <input type="submit" value="add song">
    </form:form>

    <form action="/bundles/${bundle.id}" method="post">
        <input type="hidden" name="_method" value="delete">
        <input type="submit" value="Delete">
    </form>

    <a class="btn btn-outline" href="/bundles">cancel</a>
   

   
</body>
</html>

