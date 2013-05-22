<html>
<body>
<h1>Home Page</h1>
<p>Anyone can view this page.</p>

<p>Your principal object is....: <%= request.getUserPrincipal() %></p>

<p><a href="secure/index.jsp">Secure page</a></p>
<p><a href="secure/extreme/index.jsp">Extremely secure page</a></p>
<p><a href="controller/simple">Simple Controller</a></p>
<p><a href="controller/model">ModelView Controller</a></p>

</body>

</html>