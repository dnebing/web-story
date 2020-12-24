package com.dnebinger.webstory.permission;

import com.dnebinger.webstory.constants.WebStoryConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class WebStoriesPermission {

    public void check (PermissionChecker permissionChecker, long groupId, String actionId) throws PortalException {
        if (! contains(permissionChecker, groupId, actionId)) {
            throw new PrincipalException.MustHavePermission(
                    permissionChecker.getUserId(), WebStoryConstants.RESOURCE_NAME,
                    groupId, actionId);
        }
    }

    public boolean contains(PermissionChecker permissionChecker, long groupId, String actionId) {
        return _portletResourcePermission.contains(permissionChecker, groupId, actionId);
    }

    @Reference(
            target = "(resource.name=" + WebStoryConstants.RESOURCE_NAME + ")",
            unbind = "-"
    )
    protected void setPortletResourcePermission(PortletResourcePermission portletResourcePermission) {
        _portletResourcePermission = portletResourcePermission;
    }

    private static PortletResourcePermission _portletResourcePermission;
}
