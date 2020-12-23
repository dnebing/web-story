/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dnebinger.webstory.service.impl;

import com.dnebinger.webstory.exception.NoSuchWebStoryException;
import com.dnebinger.webstory.model.WebStory;
import com.dnebinger.webstory.service.base.WebStoryLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The implementation of the web story local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.dnebinger.webstory.service.WebStoryLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.dnebinger.webstory.model.WebStory",
	service = AopService.class
)
public class WebStoryLocalServiceImpl extends WebStoryLocalServiceBaseImpl {

	/**
	 * addStory: Adds a new WebStory instance.
	 * @param title Title of the story.
	 * @param blurb Blurb for the story.
	 * @param url URL for the story.
	 * @param serviceContext Service context for the call.
	 * @return WebStory The new instance.
	 * @throws PortalException In case of error.
	 */
	public WebStory addStory(final String title, final String blurb, final String url, final ServiceContext serviceContext) throws PortalException {
		WebStory story = webStoryLocalService.createWebStory(counterLocalService.increment(WebStory.class.getName()));

		// update scope and audit fields
		story.companyId(serviceContext.getCompanyId()).groupId(serviceContext.getScopeGroupId());
		story.userId(serviceContext.getUserId());

		// update the regular column details.
		story.title(title).blurb(blurb).url(url);

		// persist the entity
		story = webStoryPersistence.update(story, serviceContext);

		// return it
		return story;
	}

	/**
	 * deleteStory: Deletes the given story.
	 * @param webStoryId WebStory instance id to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public WebStory deleteStory(final long webStoryId) throws PortalException {
		WebStory story = webStoryLocalService.getWebStory(webStoryId);

		return webStoryLocalService.deleteStory(story);
	}

	/**
	 * deleteStory: Deletes the given story.
	 * @param webStory Story to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public WebStory deleteStory(final WebStory webStory) throws PortalException {
		WebStory story;

		story = webStoryPersistence.remove(webStory);

		return story;
	}

	/**
	 * updateStory: Updates an existing WebStory instance.
	 * @param webStoryId WebStory instance id to update.
	 * @param title Title to use.
	 * @param blurb Blurb to use.
	 * @param url URL to use.
	 * @param serviceContext Service context for the call.
	 * @return WebStory The updated instance
	 * @throws PortalException in case of error.
	 */
	public WebStory updateStory(final long webStoryId, final String title, final String blurb, final String url, final ServiceContext serviceContext) throws PortalException {
		WebStory story = webStoryLocalService.getWebStory(webStoryId);

		// update the regular column details.
		story.title(title).blurb(blurb).url(url);

		// persist the entity
		story = webStoryPersistence.update(story, serviceContext);

		// return it
		return story;
	}

	private static final Logger _log = LoggerFactory.getLogger(WebStoryLocalServiceImpl.class);
}