package com.example.producer;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue aa(){
        return new Queue("aa");
    }

    @Bean
    public Queue bb(){
        return new Queue("bb");
    }

//    @Bean
//    DirectExchange directExchange(){
//        return new DirectExchange("directExchange");
//    }

//    @Bean
//    TopicExchange topicExchange(){
//        return new TopicExchange("topicExchange");
//    }
//
    @Bean
    FanoutExchange fanoutExchange(){
        return new FanoutExchange("fanout");
    }

    //扇形
    @Bean
    Binding bingdingExchangeMessage1(Queue aa, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(aa).to(fanoutExchange);
    }

    @Bean
    Binding bingdingExchangeMessage2(Queue bb, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(bb).to(fanoutExchange);
    }

/*
主题
    @Bean
    Binding bingdingExchangeMessage3(Queue queue1, TopicExchange topicExchange){
        return BindingBuilder.bind(queue1).to(directExchange).with("aa.#");
    }
*/
    /*
直连
    @Bean
    Binding bingdingExchangeMessage3(Queue queue1, DirectExchange directExchange){
        return BindingBuilder.bind(queue1).to(directExchange).with("1");
    }
*/
    
}
