/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2019 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package name.lizhe.facade.impl;

import org.junit.Before;
import org.junit.Test;

import name.lizhe.facade.LizhebuglistFacade;
import name.lizhe.service.LizhebuglistService;

import static org.junit.Assert.assertEquals;

import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;

import javax.annotation.Resource;

/**
 *
 */
public class LizhebuglistFacadeTest extends ServicelayerTransactionalTest
{
	
	@Resource
	private LizhebuglistFacade lizhebuglistFacade;
	
	@Test
	public void lizhebuglistFacadeTest() {
		assertEquals(0,lizhebuglistFacade.getBugList().size());
	}
}
