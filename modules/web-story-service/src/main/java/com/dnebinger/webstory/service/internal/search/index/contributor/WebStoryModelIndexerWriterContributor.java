package com.dnebinger.webstory.service.internal.search.index.contributor;

import com.dnebinger.webstory.model.WebStory;
import com.dnebinger.webstory.service.WebStoryLocalService;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.batch.DynamicQueryBatchIndexingActionableFactory;
import com.liferay.portal.search.spi.model.index.contributor.ModelIndexerWriterContributor;
import com.liferay.portal.search.spi.model.index.contributor.helper.IndexerWriterMode;
import com.liferay.portal.search.spi.model.index.contributor.helper.ModelIndexerWriterDocumentHelper;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dnebinger.webstory.model.WebStory",
        service = ModelIndexerWriterContributor.class
)
public class WebStoryModelIndexerWriterContributor implements ModelIndexerWriterContributor<WebStory> {
    @Override
    public void customize(BatchIndexingActionable batchIndexingActionable, ModelIndexerWriterDocumentHelper modelIndexerWriterDocumentHelper) {
        batchIndexingActionable.setAddCriteriaMethod(
                dynamicQuery -> {
                    Property statusProperty = PropertyFactoryUtil.forName("status");

                    Integer[] statuses = {
                            WorkflowConstants.STATUS_APPROVED,
                            WorkflowConstants.STATUS_IN_TRASH
                    };

                    dynamicQuery.add(statusProperty.in(statuses));
                });
        batchIndexingActionable.setPerformActionMethod(
                (WebStory story) -> {
                    Document document =
                            modelIndexerWriterDocumentHelper.getDocument(story);

                    batchIndexingActionable.addDocuments(document);
                });
    }

    @Override
    public BatchIndexingActionable getBatchIndexingActionable() {
        return _dynamicQueryBatchIndexingActionableFactory.
                getBatchIndexingActionable(
                        _webStoryLocalService.getIndexableActionableDynamicQuery());
    }

    @Override
    public IndexerWriterMode getIndexerWriterMode(WebStory baseModel) {
        int status = baseModel.getStatus();

        if ((status == WorkflowConstants.STATUS_APPROVED) ||
                (status == WorkflowConstants.STATUS_IN_TRASH) ||
                (status == WorkflowConstants.STATUS_DRAFT)) {

            return IndexerWriterMode.UPDATE;
        }

        return IndexerWriterMode.DELETE;
    }

    @Override
    public long getCompanyId(WebStory baseModel) {
        return baseModel.getCompanyId();
    }

    @Reference
    private WebStoryLocalService _webStoryLocalService;

    @Reference
    private DynamicQueryBatchIndexingActionableFactory
            _dynamicQueryBatchIndexingActionableFactory;
}
