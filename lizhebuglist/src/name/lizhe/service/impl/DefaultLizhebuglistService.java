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
package name.lizhe.service.impl;

import de.hybris.platform.catalog.model.CatalogUnawareMediaModel;
import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.servicelayer.exceptions.SystemException;
import de.hybris.platform.servicelayer.media.MediaService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

import name.lizhe.model.LizheBugItemModel;
import name.lizhe.service.LizhebuglistService;


public class DefaultLizhebuglistService implements LizhebuglistService
{
	private static final Logger LOG = LoggerFactory.getLogger(DefaultLizhebuglistService.class);

	private MediaService mediaService;
	private ModelService modelService;
	private FlexibleSearchService flexibleSearchService;

	@Override
	public String getHybrisLogoUrl(final String logoCode)
	{
		final MediaModel media = mediaService.getMedia(logoCode);

		// Keep in mind that with Slf4j you don't need to check if debug is enabled, it is done under the hood.
		LOG.debug("Found media [code: {}]", media.getCode());

		return media.getURL();
	}

	@Override
	public void createLogo(final String logoCode)
	{
		final Optional<CatalogUnawareMediaModel> existingLogo = findExistingLogo(logoCode);

		final CatalogUnawareMediaModel media = existingLogo.isPresent() ? existingLogo.get()
				: modelService.create(CatalogUnawareMediaModel.class);
		media.setCode(logoCode);
		media.setRealFileName("sap-hybris-platform.png");
		modelService.save(media);

		mediaService.setStreamForMedia(media, getImageStream());
	}

	private final static String FIND_LOGO_QUERY = "SELECT {" + CatalogUnawareMediaModel.PK + "} FROM {"
			+ CatalogUnawareMediaModel._TYPECODE + "} WHERE {" + CatalogUnawareMediaModel.CODE + "}=?code";

	private Optional<CatalogUnawareMediaModel> findExistingLogo(final String logoCode)
	{
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(FIND_LOGO_QUERY);
		fQuery.addQueryParameter("code", logoCode);

		try
		{
			return Optional.of(flexibleSearchService.searchUnique(fQuery));
		}
		catch (final SystemException e)
		{
			return Optional.empty();
		}
	}

	private InputStream getImageStream()
	{
		return DefaultLizhebuglistService.class.getResourceAsStream("/lizhebuglist/sap-hybris-platform.png");
	}

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
	public List<LizheBugItemModel> getBugList()
	{	
		final String query = "SELECT {" + LizheBugItemModel.PK + "} FROM {" + LizheBugItemModel._TYPECODE + "}";
		List<LizheBugItemModel> list = flexibleSearchService.<LizheBugItemModel> search(query).getResult();
		return list;
	}

	@Override
	public void createBug(String bugnumber, String bugname, String bugdescription, String bugcomments)
	{
		final LizheBugItemModel itemModel = new LizheBugItemModel();
		itemModel.setBugnumber(bugnumber);
		itemModel.setBugname(bugname);
		itemModel.setBugdescription(bugdescription);
		itemModel.setBugcomments(bugcomments);
		try
		{
			modelService.save(itemModel);
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void deleteBug(String bugnumber)
	{
		final String query = "SELECT {" + LizheBugItemModel.PK + "} FROM {" + LizheBugItemModel._TYPECODE + "} "
				+ "where {" + LizheBugItemModel.BUGNUMBER+"} ="+bugnumber;
		List<LizheBugItemModel> list = flexibleSearchService.<LizheBugItemModel> search(query).getResult();
		modelService.removeAll(list);
	}
}
