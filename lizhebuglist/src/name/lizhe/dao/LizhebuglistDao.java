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
package name.lizhe.dao;

import java.util.List;

import name.lizhe.model.LizheBugItemModel;

/**
 *
 */
public interface LizhebuglistDao
{
	List<LizheBugItemModel> getBugList();
	public void createBug(LizheBugItemModel model);
	void deleteBug(String bugnumber);
}
