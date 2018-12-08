package com.zkm.eurekafeignclient.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zkm.eurekafeignclient.config.FeignConfig;

@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {

	@GetMapping(value = "/helloWorld/test1")
	String helloWorldFromEurekaClient(@RequestParam(value = "name") String name);

}
