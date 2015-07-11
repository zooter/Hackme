package com.praxify.hack.DAO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig  {

@Bean
public SimpleMongoDbFactory mongoDbFactory() throws Exception {
return new SimpleMongoDbFactory(new MongoClient("192.168.1.163", 27017), "patientDetails");
}
@Bean
public MongoTemplate mongoTemplate() throws Exception {
MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
return mongoTemplate;

}
}