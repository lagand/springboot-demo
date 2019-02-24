package online.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import online.springboot.demo.common.entity.JsonResponse;
import online.springboot.demo.service.user.entity.WebsiteUser;

@Controller
public class UserController {

	private final Logger logging = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/register.html")
	public String register() {
		return "register";
	}
	
	@ResponseBody
	@RequestMapping(value="/user/register.html", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JsonResponse<Object> submit(WebsiteUser user){
		
		logging.info(user.getLoginname()+"   "+user.getPassword());
		return new JsonResponse<Object>(true, "123");
	}
}
