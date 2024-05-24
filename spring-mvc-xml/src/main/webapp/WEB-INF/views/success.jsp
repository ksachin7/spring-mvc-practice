<%--
  Created by IntelliJ IDEA.
  User: sachin
  Date: 23/05/24
  Time: 7:56 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
        <title></title>
    </head>
    <body>
    <%@ include file="../../breadcrumb.jsp" %>

    <div class="container m-5 p-5">
            <h1 class="h1">You submitted!</h1>
            <p>${id} ${fullName} ${email}</p>   <!-- this is for form controller data -->
            <p>ID: ${user.id}</p>
            <p>Name: ${user.fullName}</p>
            <p>Email: ${user.email}</p>
        </div>
    </body>
</html>
