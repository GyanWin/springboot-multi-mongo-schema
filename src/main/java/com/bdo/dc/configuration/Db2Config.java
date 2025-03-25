package com.bdo.dc.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.bdo.dc.db2.repositories"},
mongoTemplateRef = Db2Config.MONGO_TEMPLATE)
public class Db2Config {
	protected static final String MONGO_TEMPLATE = "newdb2MongoTemplate";
}
