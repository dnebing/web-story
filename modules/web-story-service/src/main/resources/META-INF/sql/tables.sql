create table WS_WebStory (
	mvccVersion LONG default 0 not null,
	uuid_ VARCHAR(75) null,
	webStoryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	lastPublishDate DATE null,
	title VARCHAR(75) null,
	blurb VARCHAR(75) null,
	url VARCHAR(75) null,
	urlTitle VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);