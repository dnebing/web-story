package com.dnebinger.webstory.service.internal.search.result.contributor;

import com.dnebinger.webstory.model.WebStory;
import com.dnebinger.webstory.service.WebStoryLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.search.spi.model.result.contributor.ModelVisibilityContributor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dnebinger.webstory.model.WebStory",
        service = ModelVisibilityContributor.class
)
public class WebStoryModelVisibilityContributor implements ModelVisibilityContributor {

    @Override
    public boolean isVisible(long classPK, int status) {
        try {
            WebStory entry = _webStoryLocalService.getWebStory(classPK);

            return isVisible(entry.getStatus(), status);
        } catch (PortalException pe) {
            if (_log.isWarnEnabled()) {
                _log.warn("Unable to check visibility for web story " + classPK, pe);
            }
        }

        return false;
    }

    protected boolean isVisible(int entryStatus, int queryStatus) {
        if (((queryStatus != WorkflowConstants.STATUS_ANY) && (entryStatus == queryStatus)) || (entryStatus != WorkflowConstants.STATUS_IN_TRASH)) {
            return true;
        }

        return false;
    }

    @Reference
    protected WebStoryLocalService _webStoryLocalService;

    private static final Logger _log = LoggerFactory.getLogger(WebStoryModelVisibilityContributor.class);
}
