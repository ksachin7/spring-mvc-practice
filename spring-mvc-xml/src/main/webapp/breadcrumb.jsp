<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>

<html>
<head>
    <title>Spring MVC XML</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <style>
        /* Adjust breadcrumb styling */
        .breadcrumb-item + .breadcrumb-item::before {
            content: var(--bs-breadcrumb-divider);
            vertical-align: middle;
            margin-right: 0.3rem;
        }
        .breadcrumb-item {
            display: flex;
            align-items: center;
        }
        .breadcrumb-item a{
            color: gray;
        }
        .breadcrumb-item a:hover, .breadcrumb-item a:focus, .breadcrumb-item a:active{
             color: mediumblue;
         }
    </style>
</head>
<body>
<!-- Breadcrumb navigation for home page -->
<nav aria-label="breadcrumb" class="my-2" id="breadcrumb-home" style="display: none;">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/">Home</a></li>
        <li class="breadcrumb-item"><a href="/practice">Practice</a></li>
        <li class="breadcrumb-item"><a href="/user/new">Register</a></li>
        <li class="breadcrumb-item"><a href="/user/showCookie">Show Cookie</a></li>
    </ol>
</nav>

<!-- Breadcrumb navigation for practice page -->
<nav aria-label="breadcrumb" class="my-2" id="breadcrumb-practice" style="display: none;">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/">Home</a></li>
        <li class="breadcrumb-item"><a class="active" href="/practice">Practice</a></li>
    </ol>
</nav>

<!-- Breadcrumb navigation for signup page -->
<nav aria-label="breadcrumb" class="my-2" id="breadcrumb-signup" style="display: none;">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/">Home</a></li>
<%--        <li class="breadcrumb-item"><a href="/user/register">Register</a></li>--%>
        <li class="breadcrumb-item"><a class="active"  href="/user/new">Register</a></li>
    </ol>
</nav>

<!-- Breadcrumb navigation for cookie page -->
<nav aria-label="breadcrumb" class="my-2" id="breadcrumb-cookie" style="display: none;">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/">Home</a></li>
        <li class="breadcrumb-item"><a class="active"  href="/user/showCookie">Show Cookie</a></li>
    </ol>
</nav>

<script>
    // Get the current page URL
    var currentPageUrl = window.location.pathname;

    // Show the appropriate breadcrumb navigation based on the current page
    if (currentPageUrl === "/") {
        document.getElementById("breadcrumb-home").style.display = "block";
    } else if (currentPageUrl === "/practice") {
        document.getElementById("breadcrumb-practice").style.display = "block";
    } else if (currentPageUrl === "/user/new") {
        document.getElementById("breadcrumb-signup").style.display = "block";
    } else if (currentPageUrl === '/user/showCookie'){
        document.getElementById("breadcrumb-cookie").style.display = "block";
    }

    // Set the breadcrumb divider based on the current page
    var divider;
    if (currentPageUrl === "/") {
        divider = "|";
    } else {
        divider = ">";
    }
    document.documentElement.style.setProperty('--bs-breadcrumb-divider', "'" + divider + "'");
</script>

<!-- jQuery cdn 3.x -->
<script
        src="https://code.jquery.com/jquery-3.7.1.min.js"
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous">
</script>

<!-- Latest compiled and minified JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
