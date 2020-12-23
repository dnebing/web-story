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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for WebStory. This utility wraps
 * <code>com.dnebinger.webstory.service.impl.WebStoryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryService
 * @generated
 */
public class WebStoryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dnebinger.webstory.service.impl.WebStoryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static com.dnebinger.webstory.model.WebStory addStory(
			String title, String blurb, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addStory(title, blurb, url, serviceContext);
	}

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStoryId WebStory instance id to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public static com.dnebinger.webstory.model.WebStory deleteStory(
			long webStoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStory(webStoryId);
	}

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStory Story to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public static com.dnebinger.webstory.model.WebStory deleteStory(
			com.dnebinger.webstory.model.WebStory webStory)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteStory(webStory);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
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
	public static com.dnebinger.webstory.model.WebStory updateStory(
			long webStoryId, String title, String blurb, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateStory(
			webStoryId, title, blurb, url, serviceContext);
	}

	public static WebStoryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WebStoryService, WebStoryService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(WebStoryService.class);

		ServiceTracker<WebStoryService, WebStoryService> serviceTracker =
			new ServiceTracker<WebStoryService, WebStoryService>(
				bundle.getBundleContext(), WebStoryService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}