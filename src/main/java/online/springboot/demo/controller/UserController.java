package online.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import online.springboot.demo.common.entity.JsonResponse;
import online.springboot.demo.configuration.RabbitMqConfig;
import online.springboot.demo.service.user.entity.WebsiteUser;

@Controller
public class UserController {

	private final Logger logging = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private RabbitTemplate rabbittemplate;
	
	@Autowired
    private ObjectMapper objectMapper;

	
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
	
	@ResponseBody
	@RequestMapping(value="/user/register/send", method=RequestMethod.GET)
	public String sendMq(@RequestParam("val") String value) {
		rabbittemplate.setMessageConverter(new Jackson2JsonMessageConverter());
		rabbittemplate.setExchange(env.getProperty(RabbitMqConfig.TOPIC_EXCHANGE));
		Message msg;
		try {
			msg = MessageBuilder.withBody(objectMapper.writeValueAsBytes(value)).build();
		} catch (JsonProcessingException e) {
			return "fail";
		}
		rabbittemplate.convertAndSend(RabbitMqConfig.TOPIC_QUEUE_ONE, msg);
		return "ok";
	}
}
