<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Home Page</h1>
<p>Anyone can view this page.</p>

<p>Your principal object is....: <%= request.getUserPrincipal() %></p>
<p><img src='<c:url value="/resources/images/superman.jpg" />'/></img></p>
<p><a href='<c:url value="secure/index" />'>Secure page</a></p>
<p><a href='<c:url value="secure/extreme/index" />'>Extremely secure page</a></p>
<p><a href='<c:url value="simple" />'>Simple Controller</a></p>
<p><a href='<c:url value="model" />'>ModelView Controller</a></p>

</body>

</html>