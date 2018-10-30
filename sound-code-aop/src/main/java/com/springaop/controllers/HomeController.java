package com.springaop.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:wjy
 * @Date: 2018/10/30.
 */
@RestController
public class HomeController {

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/value")
	public void add(){

	}
}
