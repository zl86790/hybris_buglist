/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package name.lizhe.service;

import java.util.List;

import name.lizhe.model.LizheBugItemModel;

public interface LizhebuglistService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);

	List<LizheBugItemModel> getBugList();

	/**
	 * @param bugcomments 
	 * @param bugdescription 
	 * @param bugname 
	 * @param bugnumber 
	 *
	 */
	void createBug(String bugnumber, String bugname, String bugdescription, String bugcomments);

	/**
	 * 
	 */
	void deleteBug(String bugnumber);
}
