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
package com.crownpartners.cmsdemo.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.crownpartners.cmsdemo.fulfilmentprocess.constants.CmsdemoFulfilmentProcessConstants;

import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class CmsdemoFulfilmentProcessManager extends GeneratedCmsdemoFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( CmsdemoFulfilmentProcessManager.class.getName() );
	
	public static final CmsdemoFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CmsdemoFulfilmentProcessManager) em.getExtension(CmsdemoFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
