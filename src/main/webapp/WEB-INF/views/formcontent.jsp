<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="true" %>

<html>
<head>
	<title>forms</title>
	<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />
	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
</head>
<body>

	<div id="formsContent">
		<h2>Forms</h2>
			<div class="header">
		  		<h2>Form</h2>
		  		<c:if test="${not empty message}">
					<div id="message" class="success">${message}</div>
		  		</c:if>

		  			<c:if test="${status.error}">
				  		<div id="message" class="error">Form has errors</div>
		  			</c:if>

			</div>
		  	<fieldset>
		  		<legend>Name</legend>
		  		${formBean.name}
		  	</fieldset>


			<fieldset class="checkbox">
			<legend>Request Additional Info </legend>
			${formBean.additionalInfo}
			</fieldset>

			<fieldset class="radio">
				<legend>Subscribe to Newsletter? </legend>
				${formBean.subscribeNewsletter}
			</fieldset>

	</div>

</body>
</html>
