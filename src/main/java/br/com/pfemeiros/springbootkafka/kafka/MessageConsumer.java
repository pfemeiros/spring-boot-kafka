package br.com.pfemeiros.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    private final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @KafkaListener(topics = "message_topic", groupId = "groupid")
    public void consumeMessage(String message) {
        // Consome a mensagem e regra de negocio...
        log.info("Message received: " + message);
    }

}
