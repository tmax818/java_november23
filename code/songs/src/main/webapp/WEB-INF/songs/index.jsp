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
                    <!-- <td><c:out value="${song.artists}"></c:out></td> -->
                    <td>
                        <c:forEach var="artist" items="${song.artists}">
                            <c:out value="${artist.name}"></c:out>
                        </c:forEach>
                    </td>
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
    <hr>

    <h3>Add a song with artist</h3>

    <form:form action="/songs" method="POST" modelAttribute="song">
        <input type="hidden" name="user" value="${userId}">
        <p>
            <form:label path="title">Title</form:label>
            <form:input path = "title" />
            <form:errors path = "title" />
        </p>
        <p>
            <form:label path="artists">artist</form:label>
            <form:select path="artists">
                <c:forEach var="artist" items="${artists}">
                    <form:option value="${artist.id}" >${artist.name}</form:option>

                </c:forEach>
            </form:select>
            <form:errors path = "artists" />
        </p>
        <p>
            <form:label path="rating">rating</form:label>
            <form:input path = "rating" />
            <form:errors path = "rating" />
        </p>

        <input type="submit" value="add song">
    </form:form>

    <a href="/artists">add artist</a>

   
</body>
</html>

