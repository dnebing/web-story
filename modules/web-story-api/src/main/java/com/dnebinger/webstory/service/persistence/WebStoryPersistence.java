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

package com.dnebinger.webstory.service.persistence;

import com.dnebinger.webstory.exception.NoSuchWebStoryException;
import com.dnebinger.webstory.model.WebStory;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the web story service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WebStoryUtil
 * @generated
 */
@ProviderType
public interface WebStoryPersistence extends BasePersistence<WebStory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WebStoryUtil} to access the web story persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the web stories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByUuid(String uuid);

	/**
	 * Returns a range of all the web stories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where uuid = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByUuid_PrevAndNext(
			long webStoryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Removes all the web stories where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of web stories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching web stories
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the web story where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWebStoryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUUID_G(String uuid, long groupId)
		throws NoSuchWebStoryException;

	/**
	 * Returns the web story where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the web story where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the web story where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the web story that was removed
	 */
	public WebStory removeByUUID_G(String uuid, long groupId)
		throws NoSuchWebStoryException;

	/**
	 * Returns the number of web stories where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching web stories
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the web stories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the web stories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByUuid_C_PrevAndNext(
			long webStoryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Removes all the web stories where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of web stories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching web stories
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the web stories where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByC_S(long companyId, int status);

	/**
	 * Returns a range of all the web stories where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByC_S(
		long companyId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByC_S_First(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByC_S_Last(
			long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByC_S_PrevAndNext(
			long webStoryId, long companyId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns all the web stories where companyId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByC_S(long companyId, int[] statuses);

	/**
	 * Returns a range of all the web stories where companyId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByC_S(
		long companyId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_S(
		long companyId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_S(
		long companyId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 */
	public void removeByC_S(long companyId, int status);

	/**
	 * Returns the number of web stories where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching web stories
	 */
	public int countByC_S(long companyId, int status);

	/**
	 * Returns the number of web stories where companyId = &#63; and status = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param statuses the statuses
	 * @return the number of matching web stories
	 */
	public int countByC_S(long companyId, int[] statuses);

	/**
	 * Returns all the web stories where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByG_S(long groupId, int status);

	/**
	 * Returns a range of all the web stories where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByG_S(
		long groupId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByG_S_PrevAndNext(
			long webStoryId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns all the web stories where groupId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statuses the statuses
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByG_S(long groupId, int[] statuses);

	/**
	 * Returns a range of all the web stories where groupId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByG_S(
		long groupId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_S(
		long groupId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_S(
		long groupId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of web stories where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching web stories
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns the number of web stories where groupId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param statuses the statuses
	 * @return the number of matching web stories
	 */
	public int countByG_S(long groupId, int[] statuses);

	/**
	 * Returns all the web stories where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int status);

	/**
	 * Returns a range of all the web stories where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByC_U_S_First(
			long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByC_U_S_First(
		long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByC_U_S_Last(
			long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByC_U_S_Last(
		long companyId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByC_U_S_PrevAndNext(
			long webStoryId, long companyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns all the web stories where companyId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int[] statuses);

	/**
	 * Returns a range of all the web stories where companyId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63; and userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByC_U_S(
		long companyId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories where companyId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByC_U_S(long companyId, long userId, int status);

	/**
	 * Returns the number of web stories where companyId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching web stories
	 */
	public int countByC_U_S(long companyId, long userId, int status);

	/**
	 * Returns the number of web stories where companyId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching web stories
	 */
	public int countByC_U_S(long companyId, long userId, int[] statuses);

	/**
	 * Returns all the web stories where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int status);

	/**
	 * Returns a range of all the web stories where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_U_S_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_U_S_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_U_S_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_U_S_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByG_U_S_PrevAndNext(
			long webStoryId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns all the web stories where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int[] statuses);

	/**
	 * Returns a range of all the web stories where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_U_S(
		long groupId, long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of web stories where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching web stories
	 */
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of web stories where groupId = &#63; and userId = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching web stories
	 */
	public int countByG_U_S(long groupId, long userId, int[] statuses);

	/**
	 * Returns all the web stories where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByU_S(long userId, int status);

	/**
	 * Returns a range of all the web stories where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByU_S(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByU_S(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByU_S(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByU_S_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByU_S_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByU_S_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByU_S_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByU_S_PrevAndNext(
			long webStoryId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns all the web stories where userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByU_S(long userId, int[] statuses);

	/**
	 * Returns a range of all the web stories where userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByU_S(
		long userId, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByU_S(
		long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByU_S(
		long userId, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByU_S(long userId, int status);

	/**
	 * Returns the number of web stories where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching web stories
	 */
	public int countByU_S(long userId, int status);

	/**
	 * Returns the number of web stories where userId = &#63; and status = any &#63;.
	 *
	 * @param userId the user ID
	 * @param statuses the statuses
	 * @return the number of matching web stories
	 */
	public int countByU_S(long userId, int[] statuses);

	/**
	 * Returns all the web stories where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int status);

	/**
	 * Returns a range of all the web stories where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int status, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_UT_ST_First(
			long groupId, String urlTitle, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_UT_ST_First(
		long groupId, String urlTitle, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_UT_ST_Last(
			long groupId, String urlTitle, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_UT_ST_Last(
		long groupId, String urlTitle, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByG_UT_ST_PrevAndNext(
			long webStoryId, long groupId, String urlTitle, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns all the web stories where groupId = &#63; and urlTitle = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param statuses the statuses
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int[] statuses);

	/**
	 * Returns a range of all the web stories where groupId = &#63; and urlTitle = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int[] statuses, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and urlTitle = &#63; and status = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param statuses the statuses
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63; and urlTitle = &#63; and status = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByG_UT_ST(
		long groupId, String urlTitle, int[] statuses, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories where groupId = &#63; and urlTitle = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 */
	public void removeByG_UT_ST(long groupId, String urlTitle, int status);

	/**
	 * Returns the number of web stories where groupId = &#63; and urlTitle = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param status the status
	 * @return the number of matching web stories
	 */
	public int countByG_UT_ST(long groupId, String urlTitle, int status);

	/**
	 * Returns the number of web stories where groupId = &#63; and urlTitle = &#63; and status = any &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param statuses the statuses
	 * @return the number of matching web stories
	 */
	public int countByG_UT_ST(long groupId, String urlTitle, int[] statuses);

	/**
	 * Returns the web story where groupId = &#63; and urlTitle = &#63; or throws a <code>NoSuchWebStoryException</code> if it could not be found.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByG_UT(long groupId, String urlTitle)
		throws NoSuchWebStoryException;

	/**
	 * Returns the web story where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_UT(long groupId, String urlTitle);

	/**
	 * Returns the web story where groupId = &#63; and urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByG_UT(
		long groupId, String urlTitle, boolean useFinderCache);

	/**
	 * Removes the web story where groupId = &#63; and urlTitle = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the web story that was removed
	 */
	public WebStory removeByG_UT(long groupId, String urlTitle)
		throws NoSuchWebStoryException;

	/**
	 * Returns the number of web stories where groupId = &#63; and urlTitle = &#63;.
	 *
	 * @param groupId the group ID
	 * @param urlTitle the url title
	 * @return the number of matching web stories
	 */
	public int countByG_UT(long groupId, String urlTitle);

	/**
	 * Returns the web story where urlTitle = &#63; or throws a <code>NoSuchWebStoryException</code> if it could not be found.
	 *
	 * @param urlTitle the url title
	 * @return the matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByURLTitle(String urlTitle)
		throws NoSuchWebStoryException;

	/**
	 * Returns the web story where urlTitle = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param urlTitle the url title
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByURLTitle(String urlTitle);

	/**
	 * Returns the web story where urlTitle = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param urlTitle the url title
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByURLTitle(String urlTitle, boolean useFinderCache);

	/**
	 * Removes the web story where urlTitle = &#63; from the database.
	 *
	 * @param urlTitle the url title
	 * @return the web story that was removed
	 */
	public WebStory removeByURLTitle(String urlTitle)
		throws NoSuchWebStoryException;

	/**
	 * Returns the number of web stories where urlTitle = &#63;.
	 *
	 * @param urlTitle the url title
	 * @return the number of matching web stories
	 */
	public int countByURLTitle(String urlTitle);

	/**
	 * Returns all the web stories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByGroupId(long groupId);

	/**
	 * Returns a range of all the web stories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByGroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where groupId = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByGroupId_PrevAndNext(
			long webStoryId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Removes all the web stories where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of web stories where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching web stories
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the web stories where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByUserIdGroupId(
		long userId, long groupId);

	/**
	 * Returns a range of all the web stories where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByUserIdGroupId(
		long userId, long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUserIdGroupId(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63; and groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUserIdGroupId(
		long userId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUserIdGroupId_First(
			long userId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUserIdGroupId_First(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUserIdGroupId_Last(
			long userId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUserIdGroupId_Last(
		long userId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where userId = &#63; and groupId = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByUserIdGroupId_PrevAndNext(
			long webStoryId, long userId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Removes all the web stories where userId = &#63; and groupId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 */
	public void removeByUserIdGroupId(long userId, long groupId);

	/**
	 * Returns the number of web stories where userId = &#63; and groupId = &#63;.
	 *
	 * @param userId the user ID
	 * @param groupId the group ID
	 * @return the number of matching web stories
	 */
	public int countByUserIdGroupId(long userId, long groupId);

	/**
	 * Returns all the web stories where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByUserId(long userId);

	/**
	 * Returns a range of all the web stories where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where userId = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByUserId_PrevAndNext(
			long webStoryId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Removes all the web stories where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of web stories where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching web stories
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the web stories where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching web stories
	 */
	public java.util.List<WebStory> findByCompanyId(long companyId);

	/**
	 * Returns a range of all the web stories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of matching web stories
	 */
	public java.util.List<WebStory> findByCompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching web stories
	 */
	public java.util.List<WebStory> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first web story in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the first web story in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the last web story in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story
	 * @throws NoSuchWebStoryException if a matching web story could not be found
	 */
	public WebStory findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Returns the last web story in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching web story, or <code>null</code> if a matching web story could not be found
	 */
	public WebStory fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns the web stories before and after the current web story in the ordered set where companyId = &#63;.
	 *
	 * @param webStoryId the primary key of the current web story
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory[] findByCompanyId_PrevAndNext(
			long webStoryId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<WebStory>
				orderByComparator)
		throws NoSuchWebStoryException;

	/**
	 * Removes all the web stories where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of web stories where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching web stories
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Caches the web story in the entity cache if it is enabled.
	 *
	 * @param webStory the web story
	 */
	public void cacheResult(WebStory webStory);

	/**
	 * Caches the web stories in the entity cache if it is enabled.
	 *
	 * @param webStories the web stories
	 */
	public void cacheResult(java.util.List<WebStory> webStories);

	/**
	 * Creates a new web story with the primary key. Does not add the web story to the database.
	 *
	 * @param webStoryId the primary key for the new web story
	 * @return the new web story
	 */
	public WebStory create(long webStoryId);

	/**
	 * Removes the web story with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param webStoryId the primary key of the web story
	 * @return the web story that was removed
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory remove(long webStoryId) throws NoSuchWebStoryException;

	public WebStory updateImpl(WebStory webStory);

	/**
	 * Returns the web story with the primary key or throws a <code>NoSuchWebStoryException</code> if it could not be found.
	 *
	 * @param webStoryId the primary key of the web story
	 * @return the web story
	 * @throws NoSuchWebStoryException if a web story with the primary key could not be found
	 */
	public WebStory findByPrimaryKey(long webStoryId)
		throws NoSuchWebStoryException;

	/**
	 * Returns the web story with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param webStoryId the primary key of the web story
	 * @return the web story, or <code>null</code> if a web story with the primary key could not be found
	 */
	public WebStory fetchByPrimaryKey(long webStoryId);

	/**
	 * Returns all the web stories.
	 *
	 * @return the web stories
	 */
	public java.util.List<WebStory> findAll();

	/**
	 * Returns a range of all the web stories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @return the range of web stories
	 */
	public java.util.List<WebStory> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the web stories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of web stories
	 */
	public java.util.List<WebStory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the web stories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WebStoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of web stories
	 * @param end the upper bound of the range of web stories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of web stories
	 */
	public java.util.List<WebStory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WebStory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the web stories from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of web stories.
	 *
	 * @return the number of web stories
	 */
	public int countAll();

}