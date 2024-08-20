package com.ecom.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${msg}")
	private String msg;
	
	@GetMapping("/welcome")
	public String getMsg() {
		return msg;
	}
	
}
