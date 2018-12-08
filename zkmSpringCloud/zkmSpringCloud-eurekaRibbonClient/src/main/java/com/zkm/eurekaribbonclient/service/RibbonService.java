package com.zkm.eurekaribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

	@Autowired
	private RestTemplate restTemplate;

	public String getHelloWorld(String name) {
		return restTemplate.getForObject(
				"http://eureka-client/helloWorld/test1?name=" + name,
				String.class);
	}
}
