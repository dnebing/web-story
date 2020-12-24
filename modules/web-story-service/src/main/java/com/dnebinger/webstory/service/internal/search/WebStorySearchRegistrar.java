package com.dnebinger.webstory.service.internal.search;

import com.dnebinger.webstory.model.WebStory;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.registrar.ModelSearchRegistrarHelper;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import com.liferay.portal.search.spi.model.result.contributor.ModelVisibilityContributor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = {})
public class WebStorySearchRegistrar {

    @Activate
    protected void activate(BundleContext bundleContext) {
        _serviceRegistration = modelSearchRegistrarHelper.register(WebStory.class, bundleContext,
                modelSearchDefinition -> {
                    modelSearchDefinition.setDefaultSelectedFieldNames(
                            Field.ASSET_TAG_NAMES, Field.COMPANY_ID,
                            Field.ENTRY_CLASS_NAME, Field.ENTRY_CLASS_PK,
                            Field.GROUP_ID, Field.MODIFIED_DATE, Field.SCOPE_GROUP_ID,
                            Field.UID, Field.CONTENT, Field.TITLE, Field.URL);

                    modelSearchDefinition.setModelIndexWriteContributor(modelIndexWriterContributor);
                    modelSearchDefinition.setModelSummaryContributor(modelSummaryContributor);
                    modelSearchDefinition.setModelVisibilityContributor(modelVisibilityContributor);
                    modelSearchDefinition.setSelectAllLocales(true);
                });
    }

    @Deactivate
    protected void deactivate() {
        _serviceRegistration.unregister();
    }

    @Reference(target = "(indexer.class.name=com.dnebinger.webstory.model.WebStory)")
    protected ModelIndexerWriterContributor<WebStory> modelIndexWriterContributor;

    @Reference
    protected ModelSearchRegistrarHelper modelSearchRegistrarHelper;

    @Reference(target = "(indexer.class.name=com.dnebinger.webstory.model.WebStory)")
    protected ModelSummaryContributor modelSummaryContributor;

    @Reference(target = "(indexer.class.name=com.dnebinger.webstory.model.WebStory)")
    protected ModelVisibilityContributor modelVisibilityContributor;

    private ServiceRegistration<?> _serviceRegistration;
}
