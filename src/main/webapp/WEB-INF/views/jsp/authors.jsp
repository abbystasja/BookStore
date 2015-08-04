<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link href="<c:url value="/resources/core/css/table.css" />" rel="stylesheet">
</head>
<body>
<c:if test="${not empty objects}">
  <table id="authors" >
    <tr>
      <th>Name</th>
      <th>Short Biography</th>
      <th>Year when was born</th>
      <th>Country</th>
    </tr>
    <c:forEach  items="${objects}" var="o">
      <tr>
        <td>${o.name}</td>
        <td>${o.shorBiography}</td>
        <td>${o.yearBorn}</td>
        <td>${o.country}</td>
      </tr>
    </c:forEach>
  </table>
</c:if>
</body>
</html>
