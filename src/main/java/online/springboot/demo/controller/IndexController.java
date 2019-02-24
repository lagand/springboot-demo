package online.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import online.springboot.demo.api.service.ApiService;

@RestController
public class IndexController {
	
	@Autowired
	private ApiService ApiService;

	@RequestMapping(value="/")
	public String index() {
		//return "index";
		return "login";
	}
	
	@RequestMapping("/getApi")
	public String get() {
		String result = ApiService.find("");
		return result;
	}
}
