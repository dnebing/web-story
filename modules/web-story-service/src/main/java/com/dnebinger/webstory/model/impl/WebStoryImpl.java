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

package com.dnebinger.webstory.model.impl;

import com.dnebinger.webstory.model.WebStory;

import java.util.Date;

/**
 * The extended model implementation for the WebStory service. Represents a row in the &quot;WS_WebStory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.dnebinger.webstory.model.WebStory</code> interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class WebStoryImpl extends WebStoryBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. All methods that expect a web story model instance should use the {@link com.dnebinger.webstory.model.WebStory} interface instead.
	 */
	public WebStoryImpl() {
	}

	public WebStory webStoryId(final long webStoryId) {
		setWebStoryId(webStoryId);
		return this;
	}

	public WebStory groupId(final long groupId) {
		setGroupId(groupId);
		return this;
	}

	public WebStory companyId(final long companyId) {
		setCompanyId(companyId);
		return this;
	}

	public WebStory userId(final long userId) {
		setUserId(userId);
		return this;
	}

	public WebStory userName(final String userName) {
		setUserName(userName);
		return this;
	}

	public WebStory createDate(final Date createDate) {
		setCreateDate(createDate);
		return this;
	}

	public WebStory modifiedDate(final Date modifiedDate) {
		setModifiedDate(modifiedDate);
		return this;
	}

	public WebStory lastPublishDate(final Date lastPublishDate) {
		setLastPublishDate(lastPublishDate);
		return this;
	}

	public WebStory title(final String title) {
		setTitle(title);
		return this;
	}

	public WebStory blurb(final String blurb) {
		setBlurb(blurb);
		return this;
	}

	public WebStory url(final String url) {
		setUrl(url);
		return this;
	}

	public WebStory urlTitle(final String urlTitle) {
		setUrlTitle(urlTitle);
		return this;
	}

	public WebStory status(final int status) {
		setStatus(status);
		return this;
	}

	public WebStory statusByUserId(final long statusByUserId) {
		setStatusByUserId(statusByUserId);
		return this;
	}

	public WebStory statusByUserName(final String statusByUserName) {
		setStatusByUserName(statusByUserName);
		return this;
	}

	public WebStory statusDate(final Date statusDate) {
		setStatusDate(statusDate);
		return this;
	}
}