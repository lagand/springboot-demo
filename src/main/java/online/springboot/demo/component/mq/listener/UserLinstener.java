package online.springboot.demo.component.mq.listener;

import java.io.UnsupportedEncodingException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import online.springboot.demo.configuration.RabbitMqConfig;

@Component
public class UserLinstener {

	@Autowired
	private ObjectMapper objectMapper;
	
	@RabbitListener(queues = RabbitMqConfig.TOPIC_QUEUE_ONE)
	public void consumeMessage(@Payload byte[] message) {
		System.out.println("触发消费了。。。");
		try {
			String resultString = new String(message, "utf-8");
			System.out.println(resultString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
