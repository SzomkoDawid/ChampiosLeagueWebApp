<%@ page import="java.util.Collections" %>
<%@ page import="pl.ds.servlet.Player" %>
<%@ page import="java.util.Comparator" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 17.07.2019
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous">
</script>
<html>
<head>
    <title>best scorers</title>
</head>
<body>
<center><a href="index.jsp">Back to homepage</a></center>
<table class="table">
    <thead>
    <tr>
        <th scope="col">PLAYER</th>
        <th scope="col">CLUB</th>
        <th scope="col">COUNTRY</th>
        <th scope="col">SCORE</th>
    </tr>
    </thead>
    <tbody>
       <c:forEach var="players" items="${sessionScope.scorers}" begin="0" end="4">
    <tr>
        <td scope="row">
            <c:out value="${players.name}"/>
        </td>
        <td scope="row">
            <c:out value="${players.club}"/>
        </td>
        <td scope="row">
            <c:out value="${players.country}"/>
        </td>
        <td scope="row">
            <c:out value="${players.goals}"/>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<form method="POST" action="canadian">
    <input type="submit" name="button1" disable="disabled" value="Click to show canadian clasification" class="btn btn-primary btn-lg btn-block">
</form>
<center>
    <table class="table">
        </thead>
        <tbody>
        <c:forEach var="players" items="${sessionScope.canadian}" begin="0" end="4">
            <tr>
                <td scope="row">
                    <c:out value="${players.name}"/>
                </td>
                <td scope="row">
                    <c:out value="${players.club}"/>
                </td>
                <td scope="row">
                    <c:out value="${players.country}"/>
                </td>
                <td scope="row">
                    <c:out value="${players.goals+players.assist}"/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</form>
</center>
</body>
</html>
