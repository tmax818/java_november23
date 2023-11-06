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

    <br>
    
    <h3>edit song</h3>

    <form:form action="/songs/${song.id}" method="POST" modelAttribute="song">
        <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="title">title</form:label>
        <form:input path="title" value="${esong.title}"/>
        <form:errors path="title"/>
    </p>
    <p>
        <form:label path="artist">artist</form:label>
        <form:select path="artist">
            <c:forEach var="artist" items="${artists}">
                <form:option value="${artist}" path="song.artist">${artist.name}</form:option>
            </c:forEach>
        </form:select>
        <form:errors path = "artist" />
    </p>

    <input type="submit" value="edit song">

    </form:form>
</body>
</html>

