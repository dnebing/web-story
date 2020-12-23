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

package com.dnebinger.webstory.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WebStoryService}.
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryService
 * @generated
 */
public class WebStoryServiceWrapper
	implements ServiceWrapper<WebStoryService>, WebStoryService {

	public WebStoryServiceWrapper(WebStoryService webStoryService) {
		_webStoryService = webStoryService;
	}

	/**
	 * addStory: Adds a new WebStory instance.
	 *
	 * @param title Title of the story.
	 * @param blurb Blurb for the story.
	 * @param url URL for the story.
	 * @param serviceContext Service context for the call.
	 * @return WebStory The new instance.
	 * @throws PortalException In case of error.
	 */
	@Override
	public com.dnebinger.webstory.model.WebStory addStory(
			String title, String blurb, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _webStoryService.addStory(title, blurb, url, serviceContext);
	}

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStoryId WebStory instance id to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	@Override
	public com.dnebinger.webstory.model.WebStory deleteStory(long webStoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _webStoryService.deleteStory(webStoryId);
	}

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStory Story to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	@Override
	public com.dnebinger.webstory.model.WebStory deleteStory(
			com.dnebinger.webstory.model.WebStory webStory)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _webStoryService.deleteStory(webStory);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _webStoryService.getOSGiServiceIdentifier();
	}

	/**
	 * updateStory: Updates an existing WebStory instance.
	 *
	 * @param webStoryId WebStory instance id to update.
	 * @param title Title to use.
	 * @param blurb Blurb to use.
	 * @param url URL to use.
	 * @param serviceContext Service context for the call.
	 * @return WebStory The updated instance
	 * @throws PortalException in case of error.
	 */
	@Override
	public com.dnebinger.webstory.model.WebStory updateStory(
			long webStoryId, String title, String blurb, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _webStoryService.updateStory(
			webStoryId, title, blurb, url, serviceContext);
	}

	@Override
	public WebStoryService getWrappedService() {
		return _webStoryService;
	}

	@Override
	public void setWrappedService(WebStoryService webStoryService) {
		_webStoryService = webStoryService;
	}

	private WebStoryService _webStoryService;

}