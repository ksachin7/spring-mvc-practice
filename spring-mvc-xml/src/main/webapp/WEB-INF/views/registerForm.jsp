<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: sachin
  Date: 18/05/24
  Time: 5:44 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <%@ include file="../../breadcrumb.jsp" %>

        <!-- signup content goes here -->
        <h1 class="text-center text-success mt-5">Spring MVC with XML Configuration</h1>
<%--    passing data from view to controller--%>
        <form action="${pageContext.request.contextPath}/user/processform" method="post" class="form-control border-light w-50 mx-auto p-5">
            <h2 class="h2 text-center text-capitalize"><strong>Registration form</strong></h2>
            <div class="my-3">
                <label for="id" class="form-label">User ID</label>
                <input name="id" type="number" class="form-control border-secondary-subtle" id="id" value=${user.id} readonly>
            </div>
            <div class="my-3">
                <label for="fullName" class="form-label">Full name</label>
                <input name="fullName" type="text" class="form-control border-secondary-subtle" id="fullName" value="${user.fullName}">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input name="email" type="email" class="form-control border-secondary-subtle" id="email" value="${user.email}">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input name="password" type="password" class="form-control border-secondary-subtle" value="${user.password}" id="password">
            </div>
<%--            <div class="mb-3">--%>
<%--                <label for="confirmPassword" class="form-label">Confirm Password</label>--%>
<%--                <input type="password" class="form-control border-secondary-subtle" id="confirmPassword">--%>
<%--            </div>--%>

            <button type="submit" class="btn btn-secondary">Submit</button>
        </form>
    </div>

    <%--    jQuery cdn 3.x--%>
    <script
            src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
            crossorigin="anonymous">
    </script>

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
