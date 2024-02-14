<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Form</title>
</head>
<body>
<%--@elvariable id="eobj" type="com"--%>
<form:form action="saveData" modelAttribute="eobj">
    <table>
        <tr>
            <td>Employee id </td>
            <td><form:input path="empid"/></td>
        </tr>
        <tr>
            <td>Employee name</td>
            <td><form:input path="empname"/></td>
        </tr>
        <tr>
            <Td>Salary</Td>
            <td><form:input path="salary"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save Data"/>
    </table>
</form:form>
</body>
</html>
