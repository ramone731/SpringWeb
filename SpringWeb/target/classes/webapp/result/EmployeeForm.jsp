<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
<%-- Might be key problem--%>
         pageEncoding="ISO-8859-1"%>  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Data</title>
</head>
<body>
<table>
    <%--Employee: id,Name,Salary--%>
    <tr>
        <th>Employee id </th>
        <th>Employee Name</th>
        <th>Salary</th>
    </tr>
    <%--Creates a table to display; Employee: id,name,salary--%>
    <c:forEach var="data" items="${elist}">
        <tr>
            <td><c:out value="${data.empid }"/></td>
            <td><c:out value="${data.empname }"/></td>
            <td><c:out value="${data.salary }"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
