package com.zkm.eurekafeignclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {

	@Autowired
	private EurekaClientFeign eurekaClientFeign;

	public String helloWorldFeign(String name) {
		return eurekaClientFeign.helloWorldFromEurekaClient(name);
	}
}
