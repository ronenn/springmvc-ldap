<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>VERY Secure Page</h1>
This is a protected page. You can only see me if you are a supervisor.

<p><img src='<c:url value="/resources/images/superman.jpg" />'/></img></p>
<p><a href='<c:url value="/" />'>Home</a></p>
<p><a href='<c:url value="/j_spring_security_logout" />'>Logout</a>
</body>
</html>