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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link WebStory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WebStory
 * @generated
 */
public class WebStoryWrapper
	extends BaseModelWrapper<WebStory>
	implements ModelWrapper<WebStory>, WebStory {

	public WebStoryWrapper(WebStory webStory) {
		super(webStory);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("webStoryId", getWebStoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("lastPublishDate", getLastPublishDate());
		attributes.put("title", getTitle());
		attributes.put("blurb", getBlurb());
		attributes.put("url", getUrl());
		attributes.put("urlTitle", getUrlTitle());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long webStoryId = (Long)attributes.get("webStoryId");

		if (webStoryId != null) {
			setWebStoryId(webStoryId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date lastPublishDate = (Date)attributes.get("lastPublishDate");

		if (lastPublishDate != null) {
			setLastPublishDate(lastPublishDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String blurb = (String)attributes.get("blurb");

		if (blurb != null) {
			setBlurb(blurb);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String urlTitle = (String)attributes.get("urlTitle");

		if (urlTitle != null) {
			setUrlTitle(urlTitle);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public WebStory blurb(String blurb) {
		return model.blurb(blurb);
	}

	@Override
	public WebStory companyId(long companyId) {
		return model.companyId(companyId);
	}

	@Override
	public WebStory createDate(Date createDate) {
		return model.createDate(createDate);
	}

	/**
	 * Returns the blurb of this web story.
	 *
	 * @return the blurb of this web story
	 */
	@Override
	public String getBlurb() {
		return model.getBlurb();
	}

	/**
	 * Returns the company ID of this web story.
	 *
	 * @return the company ID of this web story
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this web story.
	 *
	 * @return the create date of this web story
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this web story.
	 *
	 * @return the group ID of this web story
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last publish date of this web story.
	 *
	 * @return the last publish date of this web story
	 */
	@Override
	public Date getLastPublishDate() {
		return model.getLastPublishDate();
	}

	/**
	 * Returns the modified date of this web story.
	 *
	 * @return the modified date of this web story
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this web story.
	 *
	 * @return the mvcc version of this web story
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the primary key of this web story.
	 *
	 * @return the primary key of this web story
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this web story.
	 *
	 * @return the status of this web story
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this web story.
	 *
	 * @return the status by user ID of this web story
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this web story.
	 *
	 * @return the status by user name of this web story
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this web story.
	 *
	 * @return the status by user uuid of this web story
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this web story.
	 *
	 * @return the status date of this web story
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the title of this web story.
	 *
	 * @return the title of this web story
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the trash entry created when this web story was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this web story.
	 *
	 * @return the trash entry created when this web story was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this web story.
	 *
	 * @return the class primary key of the trash entry for this web story
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this web story.
	 *
	 * @return the trash handler for this web story
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the url of this web story.
	 *
	 * @return the url of this web story
	 */
	@Override
	public String getUrl() {
		return model.getUrl();
	}

	/**
	 * Returns the url title of this web story.
	 *
	 * @return the url title of this web story
	 */
	@Override
	public String getUrlTitle() {
		return model.getUrlTitle();
	}

	/**
	 * Returns the user ID of this web story.
	 *
	 * @return the user ID of this web story
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this web story.
	 *
	 * @return the user name of this web story
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this web story.
	 *
	 * @return the user uuid of this web story
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this web story.
	 *
	 * @return the uuid of this web story
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the web story ID of this web story.
	 *
	 * @return the web story ID of this web story
	 */
	@Override
	public long getWebStoryId() {
		return model.getWebStoryId();
	}

	@Override
	public WebStory groupId(long groupId) {
		return model.groupId(groupId);
	}

	/**
	 * Returns <code>true</code> if this web story is approved.
	 *
	 * @return <code>true</code> if this web story is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this web story is denied.
	 *
	 * @return <code>true</code> if this web story is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this web story is a draft.
	 *
	 * @return <code>true</code> if this web story is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this web story is expired.
	 *
	 * @return <code>true</code> if this web story is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this web story is inactive.
	 *
	 * @return <code>true</code> if this web story is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this web story is incomplete.
	 *
	 * @return <code>true</code> if this web story is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this web story is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this web story is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this web story is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this web story is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrashContainer() {
		return model.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return model.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return model.isInTrashImplicitly();
	}

	/**
	 * Returns <code>true</code> if this web story is pending.
	 *
	 * @return <code>true</code> if this web story is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this web story is scheduled.
	 *
	 * @return <code>true</code> if this web story is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public WebStory lastPublishDate(Date lastPublishDate) {
		return model.lastPublishDate(lastPublishDate);
	}

	@Override
	public WebStory modifiedDate(Date modifiedDate) {
		return model.modifiedDate(modifiedDate);
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the blurb of this web story.
	 *
	 * @param blurb the blurb of this web story
	 */
	@Override
	public void setBlurb(String blurb) {
		model.setBlurb(blurb);
	}

	/**
	 * Sets the company ID of this web story.
	 *
	 * @param companyId the company ID of this web story
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this web story.
	 *
	 * @param createDate the create date of this web story
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this web story.
	 *
	 * @param groupId the group ID of this web story
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last publish date of this web story.
	 *
	 * @param lastPublishDate the last publish date of this web story
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate) {
		model.setLastPublishDate(lastPublishDate);
	}

	/**
	 * Sets the modified date of this web story.
	 *
	 * @param modifiedDate the modified date of this web story
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this web story.
	 *
	 * @param mvccVersion the mvcc version of this web story
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the primary key of this web story.
	 *
	 * @param primaryKey the primary key of this web story
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this web story.
	 *
	 * @param status the status of this web story
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this web story.
	 *
	 * @param statusByUserId the status by user ID of this web story
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this web story.
	 *
	 * @param statusByUserName the status by user name of this web story
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this web story.
	 *
	 * @param statusByUserUuid the status by user uuid of this web story
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this web story.
	 *
	 * @param statusDate the status date of this web story
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the title of this web story.
	 *
	 * @param title the title of this web story
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the url of this web story.
	 *
	 * @param url the url of this web story
	 */
	@Override
	public void setUrl(String url) {
		model.setUrl(url);
	}

	/**
	 * Sets the url title of this web story.
	 *
	 * @param urlTitle the url title of this web story
	 */
	@Override
	public void setUrlTitle(String urlTitle) {
		model.setUrlTitle(urlTitle);
	}

	/**
	 * Sets the user ID of this web story.
	 *
	 * @param userId the user ID of this web story
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this web story.
	 *
	 * @param userName the user name of this web story
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this web story.
	 *
	 * @param userUuid the user uuid of this web story
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this web story.
	 *
	 * @param uuid the uuid of this web story
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the web story ID of this web story.
	 *
	 * @param webStoryId the web story ID of this web story
	 */
	@Override
	public void setWebStoryId(long webStoryId) {
		model.setWebStoryId(webStoryId);
	}

	@Override
	public WebStory status(int status) {
		return model.status(status);
	}

	@Override
	public WebStory statusByUserId(long statusByUserId) {
		return model.statusByUserId(statusByUserId);
	}

	@Override
	public WebStory statusByUserName(String statusByUserName) {
		return model.statusByUserName(statusByUserName);
	}

	@Override
	public WebStory statusDate(Date statusDate) {
		return model.statusDate(statusDate);
	}

	@Override
	public WebStory title(String title) {
		return model.title(title);
	}

	@Override
	public WebStory url(String url) {
		return model.url(url);
	}

	@Override
	public WebStory urlTitle(String urlTitle) {
		return model.urlTitle(urlTitle);
	}

	@Override
	public WebStory userId(long userId) {
		return model.userId(userId);
	}

	@Override
	public WebStory userName(String userName) {
		return model.userName(userName);
	}

	@Override
	public WebStory webStoryId(long webStoryId) {
		return model.webStoryId(webStoryId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected WebStoryWrapper wrap(WebStory webStory) {
		return new WebStoryWrapper(webStory);
	}

}