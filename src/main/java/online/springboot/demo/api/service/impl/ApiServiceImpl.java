package online.springboot.demo.api.service.impl;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import online.springboot.demo.api.service.ApiService;

@Service
public class ApiServiceImpl implements ApiService{
	
	private static String serverUrl = "http://localhost:3333/api/index?name=qwe";
	
	private final Logger logger =  LoggerFactory.getLogger(ApiServiceImpl.class);
	
	@HystrixCommand(fallbackMethod = "onError",
			commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
	public String find(String params) {
		
		CloseableHttpClient httpClient = null;
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).build();
		httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
		HttpGet getMethod = new HttpGet(serverUrl);	
		String result = "";
		try {
			CloseableHttpResponse response = httpClient.execute(getMethod);
			result = EntityUtils.toString(response.getEntity(), "UTF-8");
			System.out.println("接口返回信息："+result);
		} catch (Exception e) {
			logger.error("http connect exception");
			return "接口获取失败";
		}
		return result;
	}

	public String onError(String name) {
		logger.warn("接口调用超时");
		return "false,"+name;
	}
}
