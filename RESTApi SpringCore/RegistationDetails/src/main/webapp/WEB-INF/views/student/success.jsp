<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<title>Registration Successful</title>
</head>
<body>

<h2>Registration Successful!</h2>

<h3>Student Details</h3>

<p><b>ID:</b> ${student.id}</p>
<p><b>Name:</b> ${student.name}</p>
<p><b>Email:</b> ${student.email}</p>
<p><b>Mobile:</b> ${student.number}</p>
<p><b>Address:</b> ${student.address}</p>

<br>
<a href="allStudents">View All Students</a>

</body>
</html>
