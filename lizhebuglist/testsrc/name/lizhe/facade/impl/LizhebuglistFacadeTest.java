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

import name.lizhe.facade.LizhebuglistFacade;
import name.lizhe.service.LizhebuglistService;

/**
 *
 */
public class LizhebuglistFacadeTest
{
	private LizhebuglistFacade lizhebuglistFacade;
	private LizhebuglistService lizhebuglistService;
	
	@Before
   public void setUp()
   {
		lizhebuglistFacade = new LizhebuglistFacadeImpl();

//		lizhebuglistService = mock(LizhebuglistService.class);
//		lizhebuglistFacade.setLizhebuglistService(lizhebuglistService);
   }
}
