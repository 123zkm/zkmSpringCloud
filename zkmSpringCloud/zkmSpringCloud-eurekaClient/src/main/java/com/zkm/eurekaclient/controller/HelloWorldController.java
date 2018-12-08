package com.zkm.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloWorld")
public class HelloWorldController {

	@Value("${server.port}")
	String port;
	
	@RequestMapping("test1")
	public String test1(@RequestParam String name){
		
		return "HelloWorld "+name+",I am from port "+port;
	}
	
}
