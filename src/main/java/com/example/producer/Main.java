package com.example.producer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");


        ProducerMessage producerMessage = context.getBean(ProducerMessage.class);
        producerMessage.Producer();
    }
}
