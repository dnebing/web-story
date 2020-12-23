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
 * Provides the local service utility for WebStory. This utility wraps
 * <code>com.dnebinger.webstory.service.impl.WebStoryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryLocalService
 * @generated
 */
public class WebStoryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.dnebinger.webstory.service.impl.WebStoryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	 * Adds the web story to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WebStoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param webStory the web story
	 * @return the web story that was added
	 */
	public static com.dnebinger.webstory.model.WebStory addWebStory(
		com.dnebinger.webstory.model.WebStory webStory) {

		return getService().addWebStory(webStory);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new web story with the primary key. Does not add the web story to the database.
	 *
	 * @param webStoryId the primary key for the new web story
	 * @return the new web story
	 */
	public static com.dnebinger.webstory.model.WebStory createWebStory(
		long webStoryId) {

		return getService().createWebStory(webStoryId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Deletes the web story with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WebStoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param webStoryId the primary key of the web story
	 * @return the web story that was removed
	 * @throws PortalException if a web story with the primary key could not be found
	 */
	public static com.dnebinger.webstory.model.WebStory deleteWebStory(
			long webStoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteWebStory(webStoryId);
	}

	/**
	 * Deletes the web story from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WebStoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param webStory the web story
	 * @return the web story that was removed
	 */
	public static com.dnebinger.webstory.model.WebStory deleteWebStory(
		com.dnebinger.webstory.model.WebStory webStory) {

		return getService().deleteWebStory(webStory);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dnebinger.webstory.model.impl.WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dnebinger.webstory.model.impl.WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.dnebinger.webstory.model.WebStory fetchWebStory(
		long webStoryId) {

		return getService().fetchWebStory(webStoryId);
	}

	/**
	 * Returns the web story matching the UUID and group.
	 *
	 * @param uuid the web story's UUID
	 * @param groupId the primary key of the group
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public static com.dnebinger.webstory.model.WebStory
		fetchWebStoryByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchWebStoryByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
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
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the web stories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.dnebinger.webstory.model.impl.WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of web stories
	 */
	public static java.util.List<com.dnebinger.webstory.model.WebStory>
		getWebStories(int start, int end) {

		return getService().getWebStories(start, end);
	}

	/**
	 * Returns all the web stories matching the UUID and company.
	 *
	 * @param uuid the UUID of the web stories
	 * @param companyId the primary key of the company
	 * @return the matching web stories, or an empty list if no matches were found
	 */
	public static java.util.List<com.dnebinger.webstory.model.WebStory>
		getWebStoriesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getWebStoriesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of web stories matching the UUID and company.
	 *
	 * @param uuid the UUID of the web stories
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching web stories, or an empty list if no matches were found
	 */
	public static java.util.List<com.dnebinger.webstory.model.WebStory>
		getWebStoriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.dnebinger.webstory.model.WebStory> orderByComparator) {

		return getService().getWebStoriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of web stories.
	 *
	 * @return the number of web stories
	 */
	public static int getWebStoriesCount() {
		return getService().getWebStoriesCount();
	}

	/**
	 * Returns the web story with the primary key.
	 *
	 * @param webStoryId the primary key of the web story
	 * @return the web story
	 * @throws PortalException if a web story with the primary key could not be found
	 */
	public static com.dnebinger.webstory.model.WebStory getWebStory(
			long webStoryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getWebStory(webStoryId);
	}

	/**
	 * Returns the web story matching the UUID and group.
	 *
	 * @param uuid the web story's UUID
	 * @param groupId the primary key of the group
	 * @return the matching web story
	 * @throws PortalException if a matching web story could not be found
	 */
	public static com.dnebinger.webstory.model.WebStory
			getWebStoryByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getWebStoryByUuidAndGroupId(uuid, groupId);
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

	/**
	 * Updates the web story in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WebStoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param webStory the web story
	 * @return the web story that was updated
	 */
	public static com.dnebinger.webstory.model.WebStory updateWebStory(
		com.dnebinger.webstory.model.WebStory webStory) {

		return getService().updateWebStory(webStory);
	}

	public static WebStoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<WebStoryLocalService, WebStoryLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(WebStoryLocalService.class);

		ServiceTracker<WebStoryLocalService, WebStoryLocalService>
			serviceTracker =
				new ServiceTracker<WebStoryLocalService, WebStoryLocalService>(
					bundle.getBundleContext(), WebStoryLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}