package com.example.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class ConsumerMessage implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("我消费的消息是：" + new String(message.getBody()));
    }
}
