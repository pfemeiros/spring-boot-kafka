package br.com.pfemeiros.springbootkafka.controller;

import br.com.pfemeiros.springbootkafka.kafka.MessageProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessageController {

    private final MessageProducer producer;

    public MessageController(MessageProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public void sendMessage(@RequestParam String message) {
        producer.writeMessage(message);
    }

}
