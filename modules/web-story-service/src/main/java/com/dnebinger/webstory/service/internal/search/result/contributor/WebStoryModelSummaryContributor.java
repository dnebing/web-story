package com.dnebinger.webstory.service.internal.search.result.contributor;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.search.spi.model.result.contributor.ModelSummaryContributor;
import org.osgi.service.component.annotations.Component;

import java.util.Locale;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dnebinger.webstory.model.WebStory",
        service = ModelSummaryContributor.class
)
public class WebStoryModelSummaryContributor implements ModelSummaryContributor {

    @Override
    public Summary getSummary(
            Document document, Locale locale, String snippet) {

        String prefix = Field.SNIPPET + StringPool.UNDERLINE;

        Summary summary = new Summary(
                document.get(prefix + Field.TITLE, Field.TITLE),
                document.get(prefix + Field.CONTENT, Field.CONTENT));

        summary.setMaxContentLength(200);

        return summary;
    }
}
