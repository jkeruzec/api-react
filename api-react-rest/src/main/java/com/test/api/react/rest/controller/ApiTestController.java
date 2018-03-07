package com.test.api.react.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.react.rest.pojo.TestDataPojo;

@RestController
public class ApiTestController {

	@RequestMapping(value="testData", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestDataPojo> getTestData() {
		TestDataPojo testDataPojo = new TestDataPojo();
		testDataPojo.setMessage("Hello World!");
		return new ResponseEntity<TestDataPojo>(testDataPojo, HttpStatus.OK);
	}

	
}
