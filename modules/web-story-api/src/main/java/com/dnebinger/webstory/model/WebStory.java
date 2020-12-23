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

package com.dnebinger.webstory.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the WebStory service. Represents a row in the &quot;WS_WebStory&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryModel
 * @generated
 */
@ImplementationClassName("com.dnebinger.webstory.model.impl.WebStoryImpl")
@ProviderType
public interface WebStory extends PersistedModel, WebStoryModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.dnebinger.webstory.model.impl.WebStoryImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<WebStory, Long> WEB_STORY_ID_ACCESSOR =
		new Accessor<WebStory, Long>() {

			@Override
			public Long get(WebStory webStory) {
				return webStory.getWebStoryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<WebStory> getTypeClass() {
				return WebStory.class;
			}

		};

	public WebStory webStoryId(long webStoryId);

	public WebStory groupId(long groupId);

	public WebStory companyId(long companyId);

	public WebStory userId(long userId);

	public WebStory userName(String userName);

	public WebStory createDate(java.util.Date createDate);

	public WebStory modifiedDate(java.util.Date modifiedDate);

	public WebStory lastPublishDate(java.util.Date lastPublishDate);

	public WebStory title(String title);

	public WebStory blurb(String blurb);

	public WebStory url(String url);

	public WebStory urlTitle(String urlTitle);

	public WebStory status(int status);

	public WebStory statusByUserId(long statusByUserId);

	public WebStory statusByUserName(String statusByUserName);

	public WebStory statusDate(java.util.Date statusDate);

}