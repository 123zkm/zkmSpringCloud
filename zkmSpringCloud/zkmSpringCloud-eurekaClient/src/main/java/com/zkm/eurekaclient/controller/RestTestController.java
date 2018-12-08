package com.zkm.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("rest")
public class RestTestController {

	@RequestMapping("testRest")
	public String testRest(){
		RestTemplate restTemplate= new RestTemplate();
		return restTemplate.getForObject("https://www.baidu.com/", String.class);
	}
	
}
