/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package name.lizhe.cockpit.components.navigationarea;

import de.hybris.platform.cockpit.components.navigationarea.DefaultNavigationAreaModel;
import de.hybris.platform.cockpit.session.impl.AbstractUINavigationArea;

import name.lizhe.cockpit.session.impl.LizhebuglistcockpitNavigationArea;


/**
 * Lizhebuglistcockpit navigation area model.
 */
public class LizhebuglistcockpitNavigationAreaModel extends DefaultNavigationAreaModel
{
	public LizhebuglistcockpitNavigationAreaModel()
	{
		super();
	}

	public LizhebuglistcockpitNavigationAreaModel(final AbstractUINavigationArea area)
	{
		super(area);
	}

	@Override
	public LizhebuglistcockpitNavigationArea getNavigationArea()
	{
		return (LizhebuglistcockpitNavigationArea) super.getNavigationArea();
	}
}
