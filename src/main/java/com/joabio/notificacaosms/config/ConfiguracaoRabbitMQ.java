package com.joabio.notificacaosms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoRabbitMQ {

    public static final String QUEUE_NAME = "ticket_queue";

    @Bean
    public Queue ticketQueue() {
        return new Queue(QUEUE_NAME, false);
    }
     
    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }

}