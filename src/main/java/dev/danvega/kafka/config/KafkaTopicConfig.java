package dev.danvega.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic alirezaTopic() {
        return TopicBuilder.name("alirezaTopic")
                .build();
    }

    @Bean
    public NewTopic alirezaJsonTopic() {
        return TopicBuilder.name("alirezaTopic_json")
                .build();
    }

}
