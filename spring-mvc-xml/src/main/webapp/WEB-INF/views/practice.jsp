<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: sachin
  Date: 20/05/24
  Time: 1:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%--jstl lib. has some issue will fix later--%>
<%-- jstl Exception-info: 20-May-2024 12:56:34.283 SEVERE [RMI TCP Connection(2)-127.0.0.1] org.apache.catalina.core.StandardContext.startInternal Error during ServletContainerInitializer processing jakarta.servlet.ServletException: java.io.FileNotFoundException: JAR entry META-INF/taglib.tld not found in /target/spring-mvc-xml/WEB-INF/lib/jakarta.servlet.jsp.jstl-api-3.0.0.jar--%>
<%--<%@ taglib prefix="c" uri="https://jakarta.servlet.jsp.jstl.core" %>--%>
<%--<%@ taglib prefix="c" uri="org.apache.taglibs.standard.tag.el.core" %>--%>
<%--<%@ taglib prefix="c" uri="jakarta.tags.*" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="c" uri="http://jakarta.apache.org/taglibs/*" %>--%>
<html>
<head>
    <title>jsp practice</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <%@ include file="../../breadcrumb.jsp" %>

        <h5 class="text-dark mb-3">Practicing how to get data from controller to view</h5>
<%--     using jsp to get data from conntroller--%>
        <%-- Variables declarations for JSP & not for EL --%>
        <%
            String msg = (String) request.getAttribute("message");
            List<String> friends = (List<String>) request.getAttribute("frnd");
            LocalDateTime time= (LocalDateTime) request.getAttribute("time");
        %>

        <%-- using jsp expression tags to get data from controller--%>
        <p class="text-info-emphasis">Message from the controller: <span class="text-secondary"><%=msg %>(<%=time %>)</span></p>
        <p><%=friends %>
        </p>
        <%
            for (String f : friends) {
                out.println(f);
            }
        %>

        <%-- to print in newline and styling--%>
        <%
            for (String f : friends) {
        %>
        <h5><%=f %> </h5>
        <%
            }
        %>

<%--    using EL to get data from controller--%>
        <p class="text-info-emphasis">Message from the controller: <span class="text-secondary">${message}</span>
        </p>
        <p>${frnd}</p>
        <ul>
            <%-- <c:forEach var="f" items="${frnd}">--%>
            <%-- <li>${f}</li>--%>
            <%-- </c:forEach>--%>
        </ul>
    </div>
</body>
</html>
