<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 30.03.2017
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>

<c:forEach items="${departmentList}" var="listDepartements">
    <c:out value="${listDepartements.departmentID}"></c:out>
    <c:out value="${listDepartements.departmentName}"></c:out>

</c:forEach>

</body>
</html>
