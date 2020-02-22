package edu.ait.config.cloudconfigclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ait.config.cloudconfigclient.bean.TestParam;
import edu.ait.config.cloudconfigclient.configuration.Configuration;

@RestController
@RequestMapping("/api/v1")
public class TestParamController {

    // 1. approach to get the configuration from config server
    // use @Value annotation
    /*
     * @Value("${test-service.dummyProperties1}") private String param1;
     * @Value("${test-service.dummyProperties2}") private String param2;
     */

    @Autowired
    private Configuration configuration;

    @GetMapping("get-param")
    public TestParam getTestParamsFromConfigServer() {
        // for 1. approach
        //return new TestParam(param1, param2);
        return new TestParam(configuration.getDummyProperties1(), configuration.getDummyProperties2());
    }
}
