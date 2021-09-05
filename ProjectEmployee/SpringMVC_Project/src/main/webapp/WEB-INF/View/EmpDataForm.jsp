<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data Form</title>
</head>
<body>
	<form action="./data_inserted" method="post">
		<table>
			<caption style="color: blue; font-size: 20px;">Employee
				Data Form</caption>
			<tr>
				<td><label for="">Name:</label></td>
				<td><input type="text" name="name" id=""></td>
			</tr>
			<tr>
				<td><label for="">EmpId:</label></td>
				<td><input type="text" name="id" id=""></td>
			</tr>
			<tr>
				<td><label>Submit:</label></td>
				<td><input type="submit"></td>
			</tr>
			<!-- <tr>
                <td><label for="">Email:</label></td>
                <td><input type="email" name="" id=""></td>
            </tr>
            <tr>
                <td><label for="">Password:</label></td>
                <td><input type="password" name="" id=""></td>
            </tr>
            <tr>
                <td><label for="">Number:</label></td>
                <td><input type="number" name="" id="" minlength="10" maxlength="10"></td>
            </tr>
            <tr>
                <td><label for="">Gender:</label></td>
                <td>
                    <label for="">Male </label><input type="radio" name="1" id="">
                    <label for="">Female </label><input type="radio" name="1" id="">
                </td>
            </tr>
            <tr>
                <td><label for="">Date of Birth</label></td>
                <td>
                    <select name="" id="">
                        <option value="" selected>Date</option>
                    </select>
                    <select name="" id="">
                        <option value="" selected>Month</option>
                    </select>
                    <select name="" id="">
                        <option value="" selected>Year</option>
                    </select>
                </td>
            </tr> -->
		</table>
	</form>
</body>
</html>