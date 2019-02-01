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

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import name.lizhe.data.LizhebugBean;
import name.lizhe.facade.LizhebuglistFacade;
import name.lizhe.model.LizheBugItemModel;
import name.lizhe.service.LizhebuglistService;

/**
 *
 */
public class LizhebuglistFacadeImpl implements LizhebuglistFacade
{
	@Autowired
	private LizhebuglistService lizhebuglistService;

	@Override
	public List<LizhebugBean> getBugList()
	{
		List<LizheBugItemModel> list = lizhebuglistService.getBugList();
		List<LizhebugBean> results = new ArrayList<>();
		
		for(LizheBugItemModel model:list) {
			LizhebugBean bean = this.populateBean(model);
			results.add(bean);
		}
		
		return results;
	}
	
	private LizhebugBean populateBean(LizheBugItemModel model) {
		LizhebugBean bean = new LizhebugBean();
		bean.setBugnumber(model.getBugnumber());
		bean.setBugname(model.getBugname());
		bean.setBugdescription(model.getBugdescription());
		bean.setBugcomments(model.getBugcomments());
		return bean;
	}

	@Override
	public void createBug(LizhebugBean lizhebugBean)
	{
		String bugnumber = lizhebugBean.getBugnumber();
		String bugname = lizhebugBean.getBugname();
		String bugdescription = lizhebugBean.getBugdescription();
		String bugcomments = lizhebugBean.getBugcomments();
		lizhebuglistService.createBug(bugnumber, bugname, bugdescription, bugcomments);
	}

	@Override
	public void deleteBug(String bugnumber)
	{
		lizhebuglistService.deleteBug(bugnumber);
	}

	@Override
	public void setLizhebuglistService(LizhebuglistService lizhebuglistService)
	{
		this.lizhebuglistService = lizhebuglistService;
	}

}
