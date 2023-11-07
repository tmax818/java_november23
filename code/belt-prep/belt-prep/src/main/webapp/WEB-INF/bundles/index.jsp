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
            ${bundles}
        <h1>Welcome, ${user.userName}</h1>

        <table class="table">
            <thead>
                <tr>
                    <th>name</th>
                    <th>gender</th>
                    <th>origin</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="bundle" items="${bundles}">
                    <tr>
                        <td>
                            <a href="/bundles/${bundle.id}">
                                <c:out value="${bundle.name}"></c:out>
                            </a>
                        </td>
                        <td><c:out value="${bundle.gender.toString().toLowerCase()}"></c:out></td>
                        <td>Origin: <c:out value="${bundle.origin}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>



        <a class="btn btn-success" href="/bundles/new">new name</a>


    </div>
</body>
</html>