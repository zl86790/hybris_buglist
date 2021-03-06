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
package name.lizhe.facade;

import java.util.List;

import name.lizhe.data.LizhebugBean;
import name.lizhe.model.LizheBugItemModel;
import name.lizhe.service.LizhebuglistService;

/**
 *
 */
public interface LizhebuglistFacade
{
	List<LizhebugBean> getBugList();
	
	void createBug(LizhebugBean lizhebugBean);

	void deleteBug(String bugnumber);
	
	public void setLizhebuglistService(final LizhebuglistService lizhebuglistService);
}
