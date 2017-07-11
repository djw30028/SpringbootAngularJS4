package com.djw.app.report.controller;

/**
 * <b>WebRestController</b>
 * 
 * @author wei.wang@adp.com
 * Jul 10, 2017
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello World from Restful API for AngularJS 4";
	}
}
