package br.com.pfemeiros.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private Logger log = LoggerFactory.getLogger(MessageProducer.class);
    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "message_topic";

    public MessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void writeMessage(String message) {
        // Envia mensagem para o topico
        kafkaTemplate.send(TOPIC, "chave", message);
        log.info("Message sent: " + message);
    }

}
