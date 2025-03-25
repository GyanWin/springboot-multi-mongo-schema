package com.bdo.dc.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.bdo.dc.db1.repositories"},
mongoTemplateRef = Db1Config.MONGO_TEMPLATE)
public class Db1Config {
	 protected static final String MONGO_TEMPLATE = "newdb1MongoTemplate";
}
