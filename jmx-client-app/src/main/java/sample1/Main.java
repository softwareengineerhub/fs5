package sample1;

import sun.management.ConnectorAddressLink;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

public class Main {

    public static void main(String[] args) throws Exception {
        //MBeanServer server = null;

        String jmxHost = ConnectorAddressLink.importFrom(12380);
        System.out.println("jmxHost=" + jmxHost);

        JMXServiceURL serviceURL = new JMXServiceURL(jmxHost);
        JMXConnector connector = JMXConnectorFactory.connect(serviceURL);
        MBeanServerConnection server = connector.getMBeanServerConnection();



        //key
        ObjectName objectName = new ObjectName("spring.application:type=JMSContainer,name=jmsQueueContainer");

        //getter
        Object concurrentConsumers =  server.getAttribute(objectName, "ConcurrentConsumers");
        Object maxConcurrentConsumers =  server.getAttribute(objectName, "MaxConcurrentConsumers");

        System.out.println("min="+concurrentConsumers);
        System.out.println("max="+maxConcurrentConsumers);
        //----------------------

        //setter
        Attribute attributeConcurrentConsumers = new Attribute("ConcurrentConsumers",200);
        server.setAttribute(objectName, attributeConcurrentConsumers);

        Attribute attributeMaxConcurrentConsumers = new Attribute("MaxConcurrentConsumers",200);
        server.setAttribute(objectName, attributeMaxConcurrentConsumers);

        //stop()
        server.invoke(objectName, "start", new Object[0], new String[0]);
        //void stop(int t)
        //server.invoke(objectName, "stop", new Object[]{10}, new String[]{"int"});
    }
}
