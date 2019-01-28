package com.app.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;

@SpringBootApplication(scanBasePackages = {"com.app"})
@EnableJms
public class MyConfigQueue {

    @Bean
    public ConnectionFactory getConnectionFactory(){
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory();
        ((ActiveMQConnectionFactory) connectionFactory).
                setBrokerURL("tcp://localhost:61616");
        return connectionFactory;
    }

    @Bean(name = "myQueueFactory")
    public JmsListenerContainerFactory queueFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();// lambda function
        factory.setConnectionFactory(getConnectionFactory());
        return factory;
    }

    @Bean
    public Destination getQueue(){
        return new ActiveMQQueue("applicationQueue1");
    }





}
