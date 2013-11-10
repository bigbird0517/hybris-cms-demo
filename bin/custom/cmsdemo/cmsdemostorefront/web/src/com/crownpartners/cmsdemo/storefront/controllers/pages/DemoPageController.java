/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 *  
 */
package com.crownpartners.cmsdemo.storefront.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.address.AddressVerificationFacade;
import de.hybris.platform.commercefacades.address.data.AddressVerificationResult;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.i18n.I18NFacade;
import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.order.OrderFacade;
import de.hybris.platform.commercefacades.order.data.CCPaymentInfoData;
import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.commercefacades.order.data.OrderHistoryData;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegionData;
import de.hybris.platform.commercefacades.user.data.TitleData;
import de.hybris.platform.commercefacades.user.exceptions.PasswordMismatchException;
import de.hybris.platform.commerceservices.address.AddressVerificationDecision;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.util.Config;
import com.crownpartners.cmsdemo.storefront.annotations.RequireHardLogIn;
import com.crownpartners.cmsdemo.storefront.breadcrumb.Breadcrumb;
import com.crownpartners.cmsdemo.storefront.breadcrumb.ResourceBreadcrumbBuilder;
import com.crownpartners.cmsdemo.storefront.controllers.ControllerConstants;
import com.crownpartners.cmsdemo.storefront.controllers.util.GlobalMessages;
import com.crownpartners.cmsdemo.storefront.forms.AddressForm;
import com.crownpartners.cmsdemo.storefront.forms.UpdateEmailForm;
import com.crownpartners.cmsdemo.storefront.forms.UpdatePasswordForm;
import com.crownpartners.cmsdemo.storefront.forms.UpdateProfileForm;
import com.crownpartners.cmsdemo.storefront.forms.address.verification.AddressVerificationResultHandler;
import com.crownpartners.cmsdemo.storefront.forms.validation.AddressValidator;
import com.crownpartners.cmsdemo.storefront.forms.validation.EmailValidator;
import com.crownpartners.cmsdemo.storefront.forms.validation.PasswordValidator;
import com.crownpartners.cmsdemo.storefront.forms.validation.ProfileValidator;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * Controller for home page
 */
@Controller
@Scope("tenant")
@RequestMapping("/demo")
public class DemoPageController extends AbstractSearchPageController
{
	
	@RequestMapping()
	public String demo(final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId("demopage"));
		return "demopage";
	}
}
