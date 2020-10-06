<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Workers</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>Personnel Number</td>
        <td>Full Name</td>
        <td>Category</td>
        <td>Machine</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${workersList}" var="worker">
        <tr>
            <td>${worker.personnelNumber}</td>
            <td>${worker.fullName}</td>
            <td>${worker.category}</td>
            <td>${worker.machine.type}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>