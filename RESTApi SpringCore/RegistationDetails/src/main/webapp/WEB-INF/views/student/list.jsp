<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.registation.entity.io.Students" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
    <style>
        table { width: 80%; margin: 20px auto; border-collapse: collapse; }
        th, td { padding: 10px; border: 1px solid #ccc; text-align: center; }
        th { background: #007bff; color: white; }
        a { text-decoration: none; padding: 5px 10px; border-radius: 4px; color: white; }
        .edit { background: #28a745; }
        .delete { background: #dc3545; }
    </style>
</head>
<body>

<h2 style="text-align:center;">All Registered Students</h2>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Mobile</th>
        <th>Address</th>
        <th>Actions</th>
    </tr>

    <%
        List<Students> students = (List<Students>) request.getAttribute("students");
        if (students != null) {
            for (Students s : students) {
    %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getNumber() %></td>
            <td><%= s.getAddress() %></td>
            <td>
                <a href="edit/<%= s.getId() %>" class="edit">Edit</a>
                <a href="delete/<%= s.getId() %>" class="delete"
                   onclick="return confirm('Are you sure you want to delete this student?');">
                    Delete
                </a>
              
                
                <a href="reg" class="btn" style="color: white; background: blue; margin: 5px">New Student</a>
                
            </td>
        </tr>
    <%
            }
        }
    %>

</table>

                <a href="reg" class="btn" style="color: white; background: blue; margin: 5px">New Student</a>
                  <a href="deleteAll" 
				   onclick="return confirm('Are you sure you want to delete ALL students?');"
				   class="delete" style="margin: 5px">Delete All</a>


</body>
</html>
