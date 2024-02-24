package com.tanzeel.mongodbtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class MongoDbTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbTutorialApplication.class, args);
    }

}
