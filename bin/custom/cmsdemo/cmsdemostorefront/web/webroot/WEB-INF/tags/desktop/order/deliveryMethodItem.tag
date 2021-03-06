<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="order" required="true" type="de.hybris.platform.commercefacades.order.data.OrderData" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="item_container_holder positive">
	<div class="title_holder">
		<h2><spring:theme code="text.deliveryMethod" text="Delivery Method"/></h2>
	</div>
	<div class="item_container">
		<ul class="pad_none">
			<li>${order.deliveryMode.name}</li>
			<li>${order.deliveryMode.description}</li>
		</ul>
		<c:if test="${not empty order.pickupOrderGroups}">
			<ul class="pad_none pad_none-pickup">
				<li><spring:theme code="checkout.pickup.items.to.pickup" arguments="${order.pickupItemsQuantity}"/></li>
				<li><spring:theme code="checkout.pickup.store.destinations" arguments="${fn:length(order.pickupOrderGroups)}"/></li>
			</ul>
		</c:if>
		
	</div>
</div>