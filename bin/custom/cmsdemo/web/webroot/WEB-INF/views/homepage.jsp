<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.css" />
	</head>
	<body>
		<div class="container">
			<div class="header row">
				<h5>This is header</h5>
				<cms:pageSlot position="Header" var="feature">
					<cms:component component="${feature}" element="div" />
				</cms:pageSlot>
			</div>
			<div class="sidebar col-md-4 col-xs-4">
				<h5>This is sidebar</h5>
				<cms:pageSlot position="Sidebar" var="feature">
					<cms:component component="${feature}" element="div" />
				</cms:pageSlot>
			</div>
			<div class="body col-md-8 col-xs-8">
				<h5>This is body</h5>
				<cms:pageSlot position="Body" var="feature">
					<cms:component component="${feature}" element="div" />
				</cms:pageSlot>
			</div>
			<div class="footer row">
				<h5>This is footer</h5>
				<cms:pageSlot position="Footer" var="feature">
					<cms:component component="${feature}" element="div" />
				</cms:pageSlot>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.js"></script>
</html>