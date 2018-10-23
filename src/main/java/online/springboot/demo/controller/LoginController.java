package online.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import online.springboot.demo.common.entity.JsonResponse;
import online.springboot.demo.service.website.WebsiteUserService;

@Controller
public class LoginController {
	
	@Autowired
	private WebsiteUserService websiteUserService;
	
	private final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("/login.html")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login/confirm.html", method=RequestMethod.POST)
	public @ResponseBody JsonResponse<Object> validating(@RequestParam(value="user_name") String name,
			@RequestParam(value="ps", required=false) String password){
		
		Boolean result = websiteUserService.validating(name, password);
		if(result){
			logger.info("user name {} login success!", name);
			return new JsonResponse<Object>(true, "login success!");
		} else {
			logger.info("user name {} login fail!", name);
			return new JsonResponse<Object>(false, "login fail!");
		}
	}
}
