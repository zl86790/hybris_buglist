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

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import name.lizhe.model.LizheBugItemModel;
//import name.lizhe.model.LizheBugItemModel;
import name.lizhe.service.LizhebuglistService;

/**
 *
 */
@Controller
public class LizhebuglistShowListController
{
	@Autowired
	private LizhebuglistService lizhebuglistService;

	@RequestMapping(value = "/showlistpage", method = RequestMethod.GET)
	public String home(final HttpSession session)
	{
		final List<LizheBugItemModel> list = lizhebuglistService.getBugList();
		session.setAttribute("buglist", list);
		return "showlist/showlist";
	}
}
