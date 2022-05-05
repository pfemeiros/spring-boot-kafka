package br.com.pfemeiros.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    private final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @KafkaListener(
            topics = "message_topic",
            groupId = "groupid")
    public void consumeMessage(
            @Header(KafkaHeaders.GROUP_ID) String groupId,
            @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) String partition,
            @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
            String message) {
        log.info("Message received: {}", message);
        log.info("Topic received: {}", topic);
        log.info("Partition: {}", partition);
        log.info("Key: {}", key);
    }

}
