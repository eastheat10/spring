<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <table>
    	<tr>
    		<td>ID</td>
    		<td>${ student.id }</td>
    	</tr>
    	<tr>
    		<td>학번</td>
    		<td>${ student.studentNumber }</td>
    	</tr>
    	<tr>
    		<td>이름</td>
    		<td>${ student.studentName }</td>
    	</tr>
    	<tr>
    		<td>Email</td>
    		<td>${ student.email }</td>
    	</tr>
    </table>
</body>
</html>
