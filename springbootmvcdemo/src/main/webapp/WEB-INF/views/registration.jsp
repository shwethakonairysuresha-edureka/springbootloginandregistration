<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
This is Registration Page

<table>
<form action="/auth/registration.html" method="post">
<tr>
<td>FirstName
</td>
<td><input type="text" name="firstName" /><div>${firstName }</div>
</tr>

<tr>
<td>LastName
</td>
<td><input type="text" name="lastName" /><div>${lastName }</div>
</tr>

<tr>
<td>Address
</td>
<td><input type="text" name="address" /><div>${address }</div>
</tr>

<tr>
<td>EmailId
</td>
<td><input type="text" name="emailId" /><div>${emailId }</div>
</tr>

<tr>
<td><input type="submit"/></td></tr>
</form>
</table>
</body>
</html>