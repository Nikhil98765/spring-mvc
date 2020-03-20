<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Create</title>
<%@ page isELIgnored="false" %>
</head>
<body>
	<h2>Add Employee</h2>
<form:form action="/../create" method="post">
<pre>

    Id: <input type="text" name="id" />

	Name: <input type="text" name="name" />

	Department: <input type="text" name="department" />

	<input type="submit" value="Create" />
</pre>
</form:form>
${msg}
</body>
</html>