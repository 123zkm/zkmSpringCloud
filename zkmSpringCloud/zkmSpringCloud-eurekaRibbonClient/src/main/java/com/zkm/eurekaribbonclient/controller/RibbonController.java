package com.zkm.eurekaribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zkm.eurekaribbonclient.service.RibbonService;

@RestController
@RequestMapping("ribbon")
public class RibbonController {

	@Autowired
	private RibbonService ribbonService;

	@RequestMapping("ribbonTest")
	public String ribbonTest(
			@RequestParam(required = false, defaultValue = "zkm") String name) {
		return ribbonService.getHelloWorld(name);
	}
}
