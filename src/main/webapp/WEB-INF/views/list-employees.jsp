<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 30px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        table {
            width: 90%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
        }

        th {
            background-color: #4CAF50;
            color: white;
            text-transform: uppercase;
            letter-spacing: 0.05em;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e2f0d9;
        }

        a {
            text-decoration: none;
            padding: 5px 10px;
            border-radius: 5px;
            color: #fff;
            background-color: #4CAF50;
            transition: 0.3s;
        }

        a:hover {
            background-color: #45a049;
        }

        .add-btn {
            display: block;
            width: 120px;
            margin: 20px auto;
            text-align: center;
            background-color: #2196F3;
        }

        .add-btn:hover {
            background-color: #0b7dda;
        }
    </style>
</head>
<body>

<h1>Employee List</h1>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Dept</th>
        <th>Salary</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${employees}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <a href="employees/edit/${emp.id}">Edit</a>
                <a href="employees/delete/${emp.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<a href="employees/add" class="add-btn">Add Employee</a>

</body>
</html>
