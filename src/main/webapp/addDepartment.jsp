<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Форма для добавления</title>
</head>
<body>
<div align="center">
    <h1>Form on addDepartment</h1>
    <form action="addDepartments" method="post">
        <input type="text" name="departmentName">
        <input type="submit" value="${department.departmentID} addDepartment" name="departmentName">
    </form>
    <a href="/showDepartments">return to allDepartments</a>
</div>
</body>
</html>
