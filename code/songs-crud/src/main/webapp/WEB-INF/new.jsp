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
   ${songs}


   <h2>Add a song to the list</h2>

   <form action="/songs" method="POST">
        title: <input type="text" name="title">
        artist: <input type="text" name="artist">

        <input type="submit" value="add song">
   </form>
<br>
<br>
   <h3>New and improved add form</h3>

   <form:form action="/songs" method="POST" modelAttribute="song" >

   <p>
    <form:label path="artist">artist</form:label>
    <form:input path="artist" />
    <form:errors path="artist"/>
   </p>

   <p>
    <form:label path="title">title</form:label>
    <form:input path="title" />
    <form:errors path="title"/>
   </p>

   <p>
    <form:label path="rating">rating</form:label>
    <form:input path="rating" />
    <form:errors path="rating"/>
   </p>

   <input type="submit" value="add song">

   </form:form>
</body>
</html>

