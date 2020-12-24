package com.dnebinger.webstory.service.internal.search.query.contributor;

import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.search.spi.model.query.contributor.ModelPreFilterContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchSettings;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dnebinger.webstory.model.WebStory",
        service = ModelPreFilterContributor.class
)
public class WebStoryModelPreFilterContributor implements ModelPreFilterContributor {

    @Override
    public void contribute(BooleanFilter booleanFilter, ModelSearchSettings modelSearchSettings, SearchContext searchContext) {
        addWorkflowStatusFilter(booleanFilter, modelSearchSettings, searchContext);
    }

    protected void addWorkflowStatusFilter(BooleanFilter booleanFilter, ModelSearchSettings modelSearchSettings, SearchContext searchContext) {
        workflowStatusModelPreFilterContributor.contribute(booleanFilter, modelSearchSettings, searchContext);
    }

    @Reference(target = "(model.pre.filter.contributor.id=WorkflowStatus)")
    protected ModelPreFilterContributor workflowStatusModelPreFilterContributor;
}
