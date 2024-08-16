package com.example.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducerMessage {
//    private final RabbitTemplate template;
//
//    @Autowired
//    public ProducerMessage(RabbitTemplate template) {
//        this.template = template;
//    }

    private final RabbitTemplate template;

    public ProducerMessage(RabbitTemplate template) {
        this.template = template;
    }

    public void Producer(){
        for(int i=1; i<10; i++){
            System.out.println(i);
            template.convertAndSend("fanout",null,"aaaaaaaaa");
        }
    }


}
