<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="create">
	<table>
		<tr>
			<td>Bug number</td>
			<td><input type="text" name="bugnumber" /></td>
		</tr>
		<tr>
			<td>Bug name</td>
			<td><input type="text" name="bugname" /></td>
		</tr>
		<tr>
			<td>Bug description</td>
			<td><input type="text" name="bugdescription" /></td>
		</tr>
		<tr>
			<td>Bug comments</td>
			<td><input type="text" name="bugcomments" /></td>
		</tr>
		<tr>
			<td>Submit</td>
			<td><input type="submit"/></td>
		</tr>
	</table>
	</form>
</body>
</html>