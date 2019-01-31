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
package name.lizhe.dao.impl;

import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import name.lizhe.dao.LizhebuglistDao;
import name.lizhe.model.LizheBugItemModel;

/**
 *
 */
public class LizhebuglistDaoImpl implements LizhebuglistDao
{
	
	private MediaService mediaService;
	private ModelService modelService;
	private FlexibleSearchService flexibleSearchService;
	
	@Required
	public void setMediaService(final MediaService mediaService)
	{
		this.mediaService = mediaService;
	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Override
	public void createBug(LizheBugItemModel model)
	{
		modelService.save(model);
	}

	@Override
	public void deleteBug(String bugnumber)
	{
		final String query = "SELECT {" + LizheBugItemModel.PK + "} FROM {" + LizheBugItemModel._TYPECODE + "} "
				+ "where {" + LizheBugItemModel.BUGNUMBER+"} ="+bugnumber;
		List<LizheBugItemModel> list = flexibleSearchService.<LizheBugItemModel> search(query).getResult();
		modelService.removeAll(list);
	}

	@Override
	public List<LizheBugItemModel> getBugList()
	{
		final String query = "SELECT {" + LizheBugItemModel.PK + "} FROM {" + LizheBugItemModel._TYPECODE + "}";
		List<LizheBugItemModel> list = flexibleSearchService.<LizheBugItemModel> search(query).getResult();
		return list;
	}

}
