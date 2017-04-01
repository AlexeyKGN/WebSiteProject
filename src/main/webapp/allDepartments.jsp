<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 09.03.2017
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All D</title>
</head>
<body>
<div style="width: 800px;margin-left: auto;margin-right: auto">
    <table class="table" border="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>Департамент</th>
            <th>Добавить</th>
            <th>Удалить</th>
            <th>Редактировать</th>
            <th>Список Сотрудников</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${departmentList}" var="listDepartements">
            <tr>
                <td>${listDepartements.departmentID}</td>
                <td>${listDepartements.departmentName}</td>
                <td><a href="/addDepartment.jsp">Добавить</a></td>
                <td>
                    <%--<a href="/deleteDepartments">--%>
                    <%--<input type="submit" value="Удалить">${departmentDelete.departmentID}--%>
                        <form action="deleteDepartments" method="post">
                            <input type="hidden" name="departmentDelete">
                            <input type="submit" value="${departmentDelete.departmentID} удалить" name="departmentDelete"/>
                        </form>
                    <%--</a>--%>
                </td>
                <td><input type="submit" value="Редактировать"></td>
                <td><a href="">Список Сотрудников</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%--<c:forEach items="${departmentList}" var="listDepartements">--%>
    <%--<c:out value="${listDepartements.departmentID}"></c:out>--%>
    <%--<c:out value="${listDepartements.departmentName}"></c:out>--%>

    <%--<form action="/deleteDepartments" method="post">--%>
        <%--<input type="hidden" name="departmentID">--%>
        <%--<input type="submit" value="${department.departmentID} удалить" name="departmentID"/>--%>
    <%--</form>--%>
<%--</c:forEach>--%>

</body>
</html>
