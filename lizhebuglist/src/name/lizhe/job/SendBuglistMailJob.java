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
package name.lizhe.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.Date;

/**
 *
 */
public class SendBuglistMailJob extends AbstractJobPerformable<CronJobModel>
{
  
 
    @Override
    public PerformResult perform(final CronJobModel cronJob)
    {
   	 System.out.println("test cron job..."+new Date().toGMTString());
       return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

}