package com.test.api.react.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.test.api.react.security.configuration.WebSecurityConfig;

@Configuration
@Import({
	SwaggerConfiguration.class,
	WebSecurityConfig.class
})
@ComponentScan(basePackages = {
		"com.test.api.react.rest.controller"
})
public class RestConfiguration {

	
	
}
