<%@page import="com.te.Employee.DTO.EmployeeDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>Hello
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<%
 EmployeeDTO emp1 = (EmployeeDTO)  request.getAttribute("details");
%>
<body>
<%= emp1.getId()  %>
<%= emp1.getName() %>
</body>
</html>