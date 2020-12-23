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

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WebStory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WebStoryCacheModel
	implements CacheModel<WebStory>, Externalizable, MVCCModel {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WebStoryCacheModel)) {
			return false;
		}

		WebStoryCacheModel webStoryCacheModel = (WebStoryCacheModel)object;

		if ((webStoryId == webStoryCacheModel.webStoryId) &&
			(mvccVersion == webStoryCacheModel.mvccVersion)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int hashCode = HashUtil.hash(0, webStoryId);

		return HashUtil.hash(hashCode, mvccVersion);
	}

	@Override
	public long getMvccVersion() {
		return mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{mvccVersion=");
		sb.append(mvccVersion);
		sb.append(", uuid=");
		sb.append(uuid);
		sb.append(", webStoryId=");
		sb.append(webStoryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", lastPublishDate=");
		sb.append(lastPublishDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", blurb=");
		sb.append(blurb);
		sb.append(", url=");
		sb.append(url);
		sb.append(", urlTitle=");
		sb.append(urlTitle);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WebStory toEntityModel() {
		WebStoryImpl webStoryImpl = new WebStoryImpl();

		webStoryImpl.setMvccVersion(mvccVersion);

		if (uuid == null) {
			webStoryImpl.setUuid("");
		}
		else {
			webStoryImpl.setUuid(uuid);
		}

		webStoryImpl.setWebStoryId(webStoryId);
		webStoryImpl.setGroupId(groupId);
		webStoryImpl.setCompanyId(companyId);
		webStoryImpl.setUserId(userId);

		if (userName == null) {
			webStoryImpl.setUserName("");
		}
		else {
			webStoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			webStoryImpl.setCreateDate(null);
		}
		else {
			webStoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			webStoryImpl.setModifiedDate(null);
		}
		else {
			webStoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (lastPublishDate == Long.MIN_VALUE) {
			webStoryImpl.setLastPublishDate(null);
		}
		else {
			webStoryImpl.setLastPublishDate(new Date(lastPublishDate));
		}

		if (title == null) {
			webStoryImpl.setTitle("");
		}
		else {
			webStoryImpl.setTitle(title);
		}

		if (blurb == null) {
			webStoryImpl.setBlurb("");
		}
		else {
			webStoryImpl.setBlurb(blurb);
		}

		if (url == null) {
			webStoryImpl.setUrl("");
		}
		else {
			webStoryImpl.setUrl(url);
		}

		if (urlTitle == null) {
			webStoryImpl.setUrlTitle("");
		}
		else {
			webStoryImpl.setUrlTitle(urlTitle);
		}

		webStoryImpl.setStatus(status);
		webStoryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			webStoryImpl.setStatusByUserName("");
		}
		else {
			webStoryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			webStoryImpl.setStatusDate(null);
		}
		else {
			webStoryImpl.setStatusDate(new Date(statusDate));
		}

		webStoryImpl.resetOriginalValues();

		return webStoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		mvccVersion = objectInput.readLong();
		uuid = objectInput.readUTF();

		webStoryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		lastPublishDate = objectInput.readLong();
		title = objectInput.readUTF();
		blurb = objectInput.readUTF();
		url = objectInput.readUTF();
		urlTitle = objectInput.readUTF();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(mvccVersion);

		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(webStoryId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(lastPublishDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (blurb == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(blurb);
		}

		if (url == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (urlTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(urlTitle);
		}

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public long mvccVersion;
	public String uuid;
	public long webStoryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long lastPublishDate;
	public String title;
	public String blurb;
	public String url;
	public String urlTitle;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}