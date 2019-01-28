package com.app.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;

@SpringBootApplication(scanBasePackages = {"com.app.publisher"})
public class Producer2Config {

    @Bean
    public ConnectionFactory getConnectionFactory() {
        ActiveMQConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://localhost:61616");
        return connectionFactory;
    }

    @Bean
    public Destination getQueue() {
        return new ActiveMQQueue("applicationQueue1");
    }

    @Bean
    public JmsTemplate getJmsTemplate(){
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setConnectionFactory(getConnectionFactory());
        jmsTemplate.setDefaultDestination(getQueue());
        return jmsTemplate;
    }
}