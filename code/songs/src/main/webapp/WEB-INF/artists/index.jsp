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
    ${artists}
    ${result}

    <table class="table">
        <thead>
            <tr>
                <th>id</th>
                <th>name</th>

                <th>actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="artist" items="${artists}">
                <tr>
                    <td><c:out value="${artist.id}"></c:out></td>
                    <td><c:out value="${artist.name}"></c:out></td>

                    <td>
                        <a href="/artists/${artist.id}">show</a>
                        <a href="/artists/edit/${artist.id}">edit</a>
                        <form action="/artists/${artist.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete">
                        </form>
                        
                    </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <hr>


    <br>
    <br>
    <br>
    <h3>add artist</h3>
    ${artists}
    <form:form action="/artists" method="POST" modelAttribute="artist">
        <p>
            <form:label path="name">name</form:label>
            <form:input path = "name" />
            <form:errors path = "name" />
        </p>


        <input type="submit" value="add artist">
    </form:form>

    <a href="/songs">add song</a>

   
</body>
</html>