<%@ page import="pl.ds.servlet.Team" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 15.07.2019
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>teams</title>
</head>
<center><a href="index.jsp">Back to homepage</a></center>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col" align="left">TEAM</th>
        <th scope="col" align="left">COUNTRY</th>
        <th scope="col" align="left">ACHIEVMENT</th>
    </tr>
    </thead>
        <tbody>
<c:forEach var="teams" items="${sessionScope.teams}">
    <tr>
        <td scope="row">
            <c:out value="${teams.name}"/>
        </td>
        <td>
            <c:if test="${fn:contains(teams.country, 'ENG')}">
            <img src="http://i66.tinypic.com/2q9mh01.jpg">
            </c:if>
            <c:if test="${fn:contains(teams.country, 'ESP')}">
            <img src="http://i65.tinypic.com/1z2prar.jpg">
            </c:if>
            <c:if test="${fn:contains(teams.country, 'ITA')}">
            <img src="http://i63.tinypic.com/sqmse0.png">
            </c:if>
            <c:if test="${fn:contains(teams.country, 'FRA')}">
                <img src="http://i64.tinypic.com/zu2vk5.png">
            </c:if>
            <c:if test="${fn:contains(teams.country, 'POR')}">
                <img src="http://i65.tinypic.com/99194l.png">
            </c:if>
            <c:if test="${fn:contains(teams.country, 'RUS')}">
                <img src="http://i66.tinypic.com/ny5n4k.jpg">
            </c:if>
        </td>
        <td>
            <c:out value="${teams.achievment}"/>
        </td>
    </tr>
</c:forEach>
</tbody>
</table>
</body>
</html>