package com.dnebinger.webstory.service.internal.search.index.contributor;

import com.dnebinger.webstory.model.WebStory;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dnebinger.webstory.model.WebStory",
        service = ModelDocumentContributor.class
)
public class WebStoryModelDocumentContributor implements ModelDocumentContributor<WebStory> {
    @Override
    public void contribute(Document document, WebStory baseModel) {
        document.addText(Field.TITLE, baseModel.getTitle());
        document.addText(Field.CONTENT, baseModel.getBlurb());
        document.addKeyword(Field.URL, baseModel.getUrl());
    }
}
