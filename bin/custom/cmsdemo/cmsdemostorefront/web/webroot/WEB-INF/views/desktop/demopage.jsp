<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<html>
<head>
	<style>
		.sidebar {
			float: left;
		}

		div.header, div.sidebar, div.body, div.footer {
			border: 1px solid;
			margin: 5px;
		}
	</style>
</head>
<body>
<div class="container">
	<div class="header">
		<h5>This is header</h5>
		<cms:pageSlot position="Header" var="feature">
			<cms:component component="${feature}" element="div" />
		</cms:pageSlot>
	</div>
	<div class="sidebar">
		<h5>This is sidebar</h5>
		<cms:pageSlot position="Sidebar" var="feature">
			<cms:component component="${feature}" element="div" />
		</cms:pageSlot>
	</div>
	<div class="body">
		<h5>This is body</h5>
		<cms:pageSlot position="Body" var="feature">
			<cms:component component="${feature}" element="div" />
		</cms:pageSlot>
	</div>
	<div class="footer">
		<h5>This is footer</h5>
		<cms:pageSlot position="Footer" var="feature">
			<cms:component component="${feature}" element="div" />
		</cms:pageSlot>
	</div>
</div>
</body>
</html>