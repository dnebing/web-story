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

package com.dnebinger.webstory.uad.exporter;

import com.dnebinger.webstory.model.WebStory;
import com.dnebinger.webstory.service.WebStoryLocalService;
import com.dnebinger.webstory.uad.constants.webstoryUADConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the web story UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link WebStoryUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseWebStoryUADExporter
	extends DynamicQueryUADExporter<WebStory> {

	@Override
	public Class<WebStory> getTypeClass() {
		return WebStory.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return webStoryLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return webstoryUADConstants.USER_ID_FIELD_NAMES_WEB_STORY;
	}

	@Override
	protected String toXmlString(WebStory webStory) {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.dnebinger.webstory.model.WebStory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>webStoryId</column-name><column-value><![CDATA[");
		sb.append(webStory.getWebStoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(webStory.getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(webStory.getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(webStory.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(webStory.getUserName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected WebStoryLocalService webStoryLocalService;

}