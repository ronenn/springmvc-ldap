<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Secure Page</h1>
This is a protected page. You can get to me if you've been remembered,
or if you've authenticated this session.<br><br>

<%if (request.isUserInRole("ROLE_SUPERVISOR")) { %>
	You are a supervisor! You can therefore see the <a href='<c:url value="/secure/extreme/index" />'>extremely secure page</a>.<br><br>
<% } %>




<p><img src='<c:url value="/resources/images/superman.jpg" />'/></img></p>
<p><a href='<c:url value="/" />'>Home</a>
<p><a href='<c:url value="/j_spring_security_logout" />'>Logout</a>
</body>
</html>