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
package name.lizhe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import name.lizhe.facade.LizhebuglistFacade;
import name.lizhe.service.LizhebuglistService;

/**
 *
 */
@Controller
public class LizhebuglistDeleteController
{
	
	@Autowired
	private LizhebuglistFacade lizhebuglistFacade;
	
	/**
	 * @param lizhebuglistFacade the lizhebuglistFacade to set
	 */
	public void setLizhebuglistFacade(LizhebuglistFacade lizhebuglistFacade)
	{
		this.lizhebuglistFacade = lizhebuglistFacade;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String create(final HttpServletRequest request)
	{
		String bugnumber = request.getParameter("bugnumber");
		lizhebuglistFacade.deleteBug(bugnumber);
		return "redirect:/showlistpage";
	}
}
