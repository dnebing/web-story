package com.dnebinger.webstory.permission;

import com.dnebinger.webstory.model.WebStory;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.resource.ModelResourcePermission;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true)
public class WebStoryPermission {

    public void check(PermissionChecker permissionChecker, WebStory entry, String actionId) throws PortalException {
        if (!contains(permissionChecker, entry, actionId)) {
            throw new PrincipalException.MustHavePermission(
                    permissionChecker, WebStory.class.getName(), entry.getWebStoryId(), actionId);
        }
    }

    public void check(PermissionChecker permissionChecker, long entryId, String actionId) throws PortalException {
        if (!contains(permissionChecker, entryId, actionId)) {
            throw new PrincipalException.MustHavePermission(
                    permissionChecker, WebStory.class.getName(), entryId, actionId);
        }
    }

    public boolean contains(PermissionChecker permissionChecker, WebStory entry, String actionId) throws PortalException {
        return _webStoryModelResourcePermission.contains(permissionChecker, entry, actionId);
    }

    public boolean contains(PermissionChecker permissionChecker, long entryId, String actionId) throws PortalException {
        return _webStoryModelResourcePermission.contains(permissionChecker, entryId, actionId);
    }

    @Reference(
            target = "(model.class.name=com.dnebinger.webstory.model.WebStory)",
            unbind = "-"
    )
    protected void setEntryModelPermission(ModelResourcePermission<WebStory> modelResourcePermission) {
        _webStoryModelResourcePermission = modelResourcePermission;
    }

    private static ModelResourcePermission<WebStory>
            _webStoryModelResourcePermission;
}
