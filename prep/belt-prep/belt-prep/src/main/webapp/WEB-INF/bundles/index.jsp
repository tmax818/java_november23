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
            <c:forEach var="bundle" items="${bundles}">
                <tr>
                    <td><c:out value="${bundle.id}"></c:out></td>
                    <td><c:out value="${bundle.name}"></c:out></td>
                    <!-- <td><c:out value="${bundle.artists}"></c:out></td> -->
                    <td>
                        <c:forEach var="artist" items="${bundle.artists}">
                            <c:out value="${artist.name}"></c:out>
                        </c:forEach>
                    </td>
                        <td>
                        <a href="/bundles/${bundle.id}">show</a>
                        <a href="/bundles/edit/${bundle.id}">edit</a>
                        <form action="/bundles/${bundle.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete">
                        </form>
                        
                    </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <hr>

    <h3>Add a bundle with artist</h3>

    <form:form action="/bundles" method="POST" modelAttribute="bundle">
        <input type="hidden" name="user" value="${userId}">
        <p>
            <form:label path="name">name</form:label>
            <form:input path = "name" />
            <form:errors path = "name" />
        </p>
        <p>
            <form:label path="gender">Gender</form:label>
            <form:select path="gender">
                <form:option value="${bundle.gender.MALE}" path="gender">male</form:option>
                <form:option value="FEMALE" path="gender">female</form:option>
            </form:select>
            <form:errors path = "gender" />
        </p>
        <p>
            <form:label path="meaning">meaning</form:label>
            <form:input path = "meaning" />
            <form:errors path = "meaning" />
        </p>

        <input type="submit" value="add bundle">
    </form:form>

    <a href="/artists">add artist</a>

   
</body>
</html>

