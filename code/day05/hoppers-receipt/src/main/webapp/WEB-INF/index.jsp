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
${items}
    <div class="container">


        <h1>Hopper's Receipt</h1>
            <c:forEach var="item" items="${items}" >

                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title"><c:out value="${item.name}"></c:out></h5>
                        <h6 class="card-subtitle mb-2 text-muted"><c:out value="${item.itemName}"></c:out></h6>
                        <p class="card-text"><c:out value="${item.price}"></c:out></p>
                        <p class="card-text"><c:out value="${item.description}"></c:out></p>
                        <p class="card-text"><c:out value="${item.vendor}"></c:out></p>
                        <a href="#" class="card-link">Card link</a>
                    </div>
                </div>
            </c:forEach>
        

    </div>
    
</body>
</html>

