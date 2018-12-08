package com.zkm.eurekafeignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zkm.eurekafeignclient.service.FeignService;

@RestController
@RequestMapping("/feign")
public class FeignController {

	@Autowired
	private FeignService feignService;
	
	@RequestMapping("/helloWorldFeign")
	public String helloWorldFeign(@RequestParam(required=false,defaultValue="zkmFeign") String name){
		
		return feignService.helloWorldFeign(name);
	}
	
}
