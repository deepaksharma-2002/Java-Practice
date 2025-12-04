<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<h2>Edit Student Details</h2>
<form action="${pageContext.request.contextPath}/update" method="post">
    Student Id: <input type="text" name="id" value="${student.id}"><br><br>
    Name: <input type="text" name="name" value="${student.name}"><br><br>
    Email: <input type="email" name="email" value="${student.email}"><br><br>
    Mobile: <input type="text" name="number" value="${student.number}"><br><br>
    Address: <input type="text" name="address" value="${student.address}"><br><br>
    <input type="submit" value="Update">
</form>
