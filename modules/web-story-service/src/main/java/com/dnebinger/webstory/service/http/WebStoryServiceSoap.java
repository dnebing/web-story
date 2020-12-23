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

package com.dnebinger.webstory.service.http;

import com.dnebinger.webstory.service.WebStoryServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>WebStoryServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.dnebinger.webstory.model.WebStorySoap</code>. If the method in the
 * service utility returns a
 * <code>com.dnebinger.webstory.model.WebStory</code>, that is translated to a
 * <code>com.dnebinger.webstory.model.WebStorySoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class WebStoryServiceSoap {

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
	public static com.dnebinger.webstory.model.WebStorySoap addStory(
			String title, String blurb, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.dnebinger.webstory.model.WebStory returnValue =
				WebStoryServiceUtil.addStory(title, blurb, url, serviceContext);

			return com.dnebinger.webstory.model.WebStorySoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStoryId WebStory instance id to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public static com.dnebinger.webstory.model.WebStorySoap deleteStory(
			long webStoryId)
		throws RemoteException {

		try {
			com.dnebinger.webstory.model.WebStory returnValue =
				WebStoryServiceUtil.deleteStory(webStoryId);

			return com.dnebinger.webstory.model.WebStorySoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	/**
	 * deleteStory: Deletes the given story.
	 *
	 * @param webStory Story to delete.
	 * @return WebStory The deleted story.
	 * @throws PortalException In case of error.
	 */
	public static com.dnebinger.webstory.model.WebStorySoap deleteStory(
			com.dnebinger.webstory.model.WebStorySoap webStory)
		throws RemoteException {

		try {
			com.dnebinger.webstory.model.WebStory returnValue =
				WebStoryServiceUtil.deleteStory(
					com.dnebinger.webstory.model.impl.WebStoryModelImpl.toModel(
						webStory));

			return com.dnebinger.webstory.model.WebStorySoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
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
	public static com.dnebinger.webstory.model.WebStorySoap updateStory(
			long webStoryId, String title, String blurb, String url,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.dnebinger.webstory.model.WebStory returnValue =
				WebStoryServiceUtil.updateStory(
					webStoryId, title, blurb, url, serviceContext);

			return com.dnebinger.webstory.model.WebStorySoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(WebStoryServiceSoap.class);

}