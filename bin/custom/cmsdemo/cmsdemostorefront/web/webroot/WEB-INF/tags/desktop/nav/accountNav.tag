<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="selected" required="false" type="java.lang.String" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<div class="span-4">
	<div class="span-4 nav_column">
		<div class="title_holder">
			<h2><spring:theme code="text.account.yourAccount" text="Your Account"/></h2>
		</div>
		<div class="item">
			<ul class="facet_block indent">
				<li class='${selected eq 'profile' ? 'nav_selected' : ''}'>
					<c:url value="/my-account/profile" var="encodedUrl" />
					<ycommerce:testId code="myAccount_profile_navLink">
						<a href="${encodedUrl}"><spring:theme code="text.account.profile" text="Profile"/></a>
					</ycommerce:testId>
				</li>
				<li class='${selected eq 'address-book' ? 'nav_selected' : ''}'>
					<c:url value="/my-account/address-book" var="encodedUrl" />
					<ycommerce:testId code="myAccount_addressBook_navLink">
						<a href="${encodedUrl}"><spring:theme code="text.account.addressBook" text="Address Book"/></a>
					</ycommerce:testId>
				</li>
				<li class='${selected eq 'payment-details' ? 'nav_selected' : ''}'>
					<c:url value="/my-account/payment-details" var="encodedUrl" />
					<ycommerce:testId code="myAccount_paymentDetails_navLink">
						<a href="${encodedUrl}"><spring:theme code="text.account.paymentDetails" text="Payment Details"/></a>
					</ycommerce:testId>
				</li>
				<li class='${selected eq 'orders' ? 'nav_selected' : ''}'>
					<c:url value="/my-account/orders" var="encodedUrl" />
					<ycommerce:testId code="myAccount_orders_navLink">
						<a href="${encodedUrl}"><spring:theme code="text.account.orderHistory" text="Order History"/></a>
					</ycommerce:testId>
				</li>
			</ul>
		</div>
	</div>
	<cms:pageSlot position="SideContent" var="feature" element="div" class="span-4 side-content-slot cms_disp-img_slot">
		<cms:component component="${feature}"/>
	</cms:pageSlot>
</div>