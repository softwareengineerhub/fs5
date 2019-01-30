package com.app.feed.config;

import com.app.feed.listener.DataConsumer;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.jms.ConnectionFactory;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(scanBasePackages = {"com.app.feed"})
@EnableJms
@EnableMBeanExport
@EnableScheduling
public class ApplicationConfig {

    @Bean
    public ConnectionFactory getConnectionFactory(){
        return new ActiveMQConnectionFactory();
    }

    /*

    @Bean
    public ConnectionFactory getConnectionFactory(){
        ConnectionFactory connectionFactory =
                new ActiveMQConnectionFactory();
        ((ActiveMQConnectionFactory) connectionFactory).
                setBrokerURL("tcp://localhost:61616");
        return connectionFactory;
    }

     */


    @Bean
    public DefaultMessageListenerContainer jmsMessageListenerContainer() {
        DefaultMessageListenerContainer factory = new DefaultMessageListenerContainer();
        int lower = 1;
        int upper = 10;
        factory.setConcurrency(lower + "-" + upper);
        //factory.setConcurrentConsumers(lower);
        //factory.setMaxConcurrentConsumers(upper);
        //factory.setMaxConcurrentConsumers(1000);
        factory.setIdleConsumerLimit(1000);
        factory.setIdleTaskExecutionLimit(60*60);

        factory.setConnectionFactory(getConnectionFactory());
        factory.setDestinationName("myQueue");
        factory.setAutoStartup(true);
        factory.setMessageListener(new DataConsumer());
        return factory;
    }


    @Bean
    public MBeanExporter jmx() {
        MBeanExporter exporter = new MBeanExporter();
        Map<String, Object> map = new HashMap();
        //   map.put("spring.application:type=JMSContainer,name=testQueueContainer", jmsListenerContainerFactory());
        map.put("spring.application:type=JMSContainer,name=jmsQueueContainer", jmsMessageListenerContainer());
        exporter.setBeans(map);

        MethodNameBasedMBeanInfoAssembler assembler = new MethodNameBasedMBeanInfoAssembler();
        assembler.setManagedMethods(
                "setMaxConcurrentConsumers",
                "getMaxConcurrentConsumers",
                "setConcurrentConsumers",
                "getConcurrentConsumers",
                "start",
                "stop",
                "isRunning");



        exporter.setAssembler(assembler);
        return exporter;
    }

}
