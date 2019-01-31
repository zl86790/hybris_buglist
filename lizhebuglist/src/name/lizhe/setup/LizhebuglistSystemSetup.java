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
package name.lizhe.setup;

import static name.lizhe.constants.LizhebuglistConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import name.lizhe.constants.LizhebuglistConstants;
import name.lizhe.service.LizhebuglistService;


@SystemSetup(extension = LizhebuglistConstants.EXTENSIONNAME)
public class LizhebuglistSystemSetup
{
	private final LizhebuglistService lizhebuglistService;

	public LizhebuglistSystemSetup(final LizhebuglistService lizhebuglistService)
	{
		this.lizhebuglistService = lizhebuglistService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		lizhebuglistService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return LizhebuglistSystemSetup.class.getResourceAsStream("/lizhebuglist/sap-hybris-platform.png");
	}
}
