<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:import url="template/header.jsp" />


<h1>Profile:</h1>

<table>
	<tr>
		<td>id: ${User.id}</td>
	</tr>
	<tr>
		<td>name: ${User.lastName} ${User.firstName}</td>
	</tr>
	<tr>
		<td>email: ${User.email}</td>
	</tr>
	<tr>
		<td>team: ${User.team.name}</td>
	</tr>
</table>


<c:import url="template/footer.jsp" />
