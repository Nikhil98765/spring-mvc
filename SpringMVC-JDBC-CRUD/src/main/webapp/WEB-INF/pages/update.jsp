<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Update</title>
<%@ page isELIgnored="false" %>
</head>
<body>
	<h2>Update form</h2>

<form action=".../update" method="post">
<pre>
<c:forEach var="employee" items="${listEmployee}">

Id:    	<input type="hidden" name="id" value="${employee.id}"/>
Name:  	<input type="text" name="name" value="${employee.name}" />

Department: 	<input type="text" name="department" value="${employee.department}" />

        <input type="submit" value="Update" />
</c:forEach>
</pre>
</form>
${msg}
</body>
</html>