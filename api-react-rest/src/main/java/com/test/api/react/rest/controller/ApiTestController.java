package com.test.api.react.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.react.rest.pojo.TestDataPojo;

@RestController
public class ApiTestController {

	@RequestMapping(value="testData", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TestDataPojo>> getTestData() {
		List<TestDataPojo> tests = new ArrayList<>();
		TestDataPojo testDataPojo = new TestDataPojo();
		testDataPojo.setEmail("test@test.fr");
		testDataPojo.setId(1);
		tests.add(testDataPojo);
		return new ResponseEntity<List<TestDataPojo>>(tests, HttpStatus.OK);
	}
	
	@RequestMapping(value="testData/{id}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestDataPojo> getTestData(@PathVariable String id) {
		TestDataPojo testDataPojo = new TestDataPojo();
		testDataPojo.setEmail("test@test.fr");
		testDataPojo.setId(1);
		return new ResponseEntity<TestDataPojo>(testDataPojo, HttpStatus.OK);
	}

	
}
