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

   <table class="table">
    <thead>
        <tr>
            <th>id</th>
            <th>Artist</th>
            <th>Title</th>
            <th>actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="song" items="${songs}">
            <tr>
                <td><c:out value="${song.id}"></c:out></td>
                <td><c:out value="${song.artist.name}"></c:out></td>
                <td><c:out value="${song.title}"></c:out></td>
                <td>
                    <a href="/songs/${song.id}">show</a>
                    <a href="/songs/edit/${song.id}">edit</a>
                    <form action="/songs/${song.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input type="submit" value="Delete">
                    </form>
                    
                </td>
            </tr>
        </c:forEach>
    </tbody>
   </table>

   <a class="btn btn-warning" href="/songs/new">add song</a>

   <h2>Add a song to the list</h2>

   <form action="/songs" method="POST">
        title: <input type="text" name="title">
        artist: <input type="text" name="artist">

        <input type="submit" value="add song">

   </form>
</body>
</html>

