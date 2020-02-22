package edu.ait.config.cloudconfigclient.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/*
this is 2. approach to get configuration from config server
"test-service" is a prefix of properties file in cloud server
the fields in the class must be same as properties field in properties files.
e.g. test-service.dummyProperties1=value

if you want to refresh Configuration Data
 - include the Actuator starter in pom.xml
   spring-boot-starter-actuator
 - add a special @RefreshScope annotation
 - enable the /refresh endpoint for the application in the bootstrap.properties
   managements.endpoints.web.exposure.include=refresh
*/

@ConfigurationProperties("test-service")
@RefreshScope
@Component
public class Configuration {
    private String dummyProperties1;
    private String dummyProperties2;

    public String getDummyProperties1() {
        return dummyProperties1;
    }

    public void setDummyProperties1(final String dummyProperties1) {
        this.dummyProperties1 = dummyProperties1;
    }

    public String getDummyProperties2() {
        return dummyProperties2;
    }

    public void setDummyProperties2(final String dummyProperties2) {
        this.dummyProperties2 = dummyProperties2;
    }
}
