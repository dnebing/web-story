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

import com.dnebinger.webstory.model.WebStory;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for WebStory. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface WebStoryService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.dnebinger.webstory.service.impl.WebStoryServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the web story remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link WebStoryServiceUtil} if injection and service tracking are not available.
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
	public WebStory addStory(
			String title, String blurb, String url,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStoryId WebStory instance id to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public WebStory deleteStory(long webStoryId) throws PortalException;

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStory Story to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public WebStory deleteStory(WebStory webStory) throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

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
	public WebStory updateStory(
			long webStoryId, String title, String blurb, String url,
			ServiceContext serviceContext)
		throws PortalException;

}