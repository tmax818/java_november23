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
    ${result}

    <table class="table">
        <thead>
            <tr>
                <th>id</th>
                <th>title</th>
                <th>artist</th>
                <th>actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="song" items="${songs}">
                <tr>
                    <td><c:out value="${song.id}"></c:out></td>
                    <td><c:out value="${song.title}"></c:out></td>
                    <td><c:out value="${song.artist}"></c:out></td>
                    <td>
                        <a href="/songs/${song.id}">show</a>
                        <a href="/songs/edit/${song.id}">edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <hr>

    <form action="/songs" method="POST">
        title: <input type="text" name="title">
        artist: <input type="text" name="artist">

        <input type="submit" value="add song">

    </form>

    <br>
    <br>
    <br>
    <h3>New and improved form</h3>

    <form:form action="/songs" method="POST" modelAttribute="song">
        <p>
            <form:label path="title">Title</form:label>
            <form:input path = "title" />
            <form:errors path = "title" />
        </p>
        <p>
            <form:label path="artist">artist</form:label>
            <form:input path = "artist" />
            <form:errors path = "artist" />
        </p>
        <p>
            <form:label path="rating">rating</form:label>
            <form:input path = "rating" />
            <form:errors path = "rating" />
        </p>

        <input type="submit" value="add song">
    </form:form>

   
</body>
</html>

