<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DiaplayAll</title>
</head>
<body>
	<c:forEach var="displayAll" items="${mapDis}">
	${displayAll }  <br><br>
	</c:forEach>
</body>
</html>