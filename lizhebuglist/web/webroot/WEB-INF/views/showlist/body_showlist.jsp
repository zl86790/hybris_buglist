<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="height:30em;padding-left: 20px;padding-top: 20px;
    background-color: #eeece5;
    background: linear-gradient(125deg,#eeece5,#f3f3f3 41%,#ededed 0,#fff);">
	<table>
		<tr>
			<td>No.</td>
			<td>Name</td>
			<td>Description</td>
			<td>Comments</td>
			<td>Action</td>
		</tr>
		<c:forEach items="${buglist}" var="item" varStatus="status">
			<tr>
			<td>${item.bugnumber}</td>
			<td>${item.bugname}</td>
			<td>${item.bugdescription}</td>
			<td>${item.bugcomments}</td>
			<td><a href="delete?bugnumber=${item.bugnumber}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>