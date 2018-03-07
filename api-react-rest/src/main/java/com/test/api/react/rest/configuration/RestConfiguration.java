package com.test.api.react.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
	SwaggerConfiguration.class
})
@ComponentScan(basePackages = {
		"com.test.api.react.rest.controller"
})
public class RestConfiguration {

	
	
}
