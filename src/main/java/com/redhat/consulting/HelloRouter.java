package com.redhat.consulting;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer://hello?fixedRate=true&period=5000").log("Hello!");
    }
}
