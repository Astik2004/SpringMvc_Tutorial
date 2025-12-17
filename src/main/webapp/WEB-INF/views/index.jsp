<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f8;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #2c3e50;
            color: white;
            padding: 15px;
            text-align: center;
        }

        nav {
            background-color: #34495e;
            padding: 10px;
            text-align: center;
        }

        nav a {
            color: white;
            margin: 0 15px;
            text-decoration: none;
            font-weight: bold;
        }

        nav a:hover {
            text-decoration: underline;
        }

        .container {
            padding: 30px;
            text-align: center;
        }

        footer {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>

<body>

<header>
    <h1>Welcome to My JSP Application</h1>
    <p>Learning JSP, Servlet & Spring MVC</p>
</header>

<nav>
    <a href="home">Home</a>
    <a href="about">About</a>
    <a href="contact">Contact</a>
    <a href="login">Login</a>
</nav>

<div class="container">
    <h2>Hello, User 👋</h2>

    <p>
        This is the <strong>Home Page</strong> of a JSP-based web application.
    </p>

    <p>
        Current Date & Time:
        <strong><%= new java.util.Date() %></strong>
    </p>
</div>

<footer>
    <p>© 2025 Astik Yadav | JSP Application</p>
</footer>

</body>
</html>
