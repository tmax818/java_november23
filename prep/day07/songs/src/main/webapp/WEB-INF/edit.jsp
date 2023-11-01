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
    <form action="/songs/${song.id}" method="POST">
        <input type="hidden" name="_method" value="put">
        title: <input type="text" name="title" value="${song.title}">
        artist: <input type="text" name="artist" value="${song.artist}">
        
        <input type="submit" value="edit song">
    </form>
    
    <br>
    <br>
    
    <h3>new form</h3>
    song: ${song}
    <br>
    esong: ${esong}
    <form:form action="/songs/${song.id}" method="POST" modelAttribute="song">
        <input type="hidden" name="_method" value="put">
    <p>
        <form:label path="title">title</form:label>
        <form:input path="title"/>
        <form:errors path="title"/>
    </p>
    <p>
        <form:label path="artist">artist</form:label>
        <form:input path="artist"/>
        <form:errors path="artist"/>
    </p>

    <input type="submit" value="edit song">

    </form:form>
</body>
</html>

