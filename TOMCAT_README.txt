


1. META-INF/context.xml

<?xml version="1.0" encoding="UTF-8" ?>

<Context>
    <Resource
        name="myDS"
        auth="Container"
        type="javax.sql.DataSource"
        maxActive="100"
        maxIdle="30"
        maxWait="10000"
        driverClassName = "com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/terminator?autoReconnect=true"
        username="root"
        password="11111111" />
</Context>

В приложении: @Resource(name="myDS") private DataSource ds;

2. tomcat/conf/context.xml
     <?xml version='1.0' encoding='utf-8'?>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<!-- The contents of this file will be loaded for each web application -->
<Context>

    <!-- Default set of monitored resources. If one of these changes, the    -->
    <!-- web application will be reloaded.                                   -->
    <WatchedResource>WEB-INF/web.xml</WatchedResource>
    <WatchedResource>${catalina.base}/conf/web.xml</WatchedResource>

    <!-- Uncomment this to disable session persistence across Tomcat restarts -->
    <!--
    <Manager pathname="" />
    -->

    <!-- Uncomment this to enable Comet connection tacking (provides events
         on session expiration as well as webapp lifecycle) -->
    <!--
    <Valve className="org.apache.catalina.valves.CometConnectionManagerValve" />
    -->
    <Resource
        name="myDS2"
        auth="Container"
        type="javax.sql.DataSource"
        maxActive="100"
        maxIdle="30"
        maxWait="10000"
        driverClassName = "com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/denis"
        username="root"
        password="11111111" 
        digest="MD5"
/>            
</Context>
В приложении: @Resource(name="myDS2") private DataSource ds;

3. META-INF/context.xml 
<?xml version="1.0" encoding="UTF-8" ?>

<Context>
    <Resource
        name="myDS"
        auth="Container"
        type="javax.sql.DataSource"
        maxActive="100"
        maxIdle="30"
        maxWait="10000"
        driverClassName = "com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/terminator?autoReconnect=true"
        username="root"
        password="11111111" />

    <Realm className="org.apache.catalina.realm.DataSourceRealm"
           dataSourceName="myDS2"
           localDataSource="true"
           userTable="users"
           userNameCol="login"
           userCredCol="pass"
           userRoleTable="users"
           roleNameCol="role"

    />


</Context>

Нужна схема с табличкой users; 


4. web.xml for security

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">


    <servlet>
        <servlet-name>MyServlet</servlet-name>
        <servlet-class>com.app.MyServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>MyServlet</servlet-name>
        <url-pattern>/MyServlet</url-pattern>
    </servlet-mapping>
    <servlet>
        <servlet-name>LogoutServlet</servlet-name>
        <servlet-class>com.app.LogoutServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>LogoutServlet</servlet-name>
        <url-pattern>/LogoutServlet</url-pattern>
    </servlet-mapping>



    <security-constraint>
        <display-name>Constraint1</display-name>
        <web-resource-collection>
            <web-resource-name>MyServlet</web-resource-name>
            <description/>
            <url-pattern>/MyServlet</url-pattern>
        </web-resource-collection>
        <auth-constraint>
            <description/>
            <role-name>user</role-name>
        </auth-constraint>
    </security-constraint>
    <login-config>
        <auth-method>FORM</auth-method>
        <form-login-config>
            <form-login-page>/login.html</form-login-page>
            <form-error-page>/error-login.html</form-error-page>
        </form-login-config>
    </login-config>
    <security-role>
        <description/>
        <role-name>user</role-name>
    </security-role>
    
    
</web-app>


 
4. JNDI names

<Environment name="serverUrl" value="https://localhost:8443"
     type="java.lang.String" override="false"/>


"java:comp/env/serverUrl".


