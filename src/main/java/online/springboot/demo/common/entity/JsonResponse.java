package online.springboot.demo.common.entity;

import java.util.HashMap;

public class JsonResponse<Object> extends HashMap<String, Object>{

	public Boolean isOK;
	public Object message;
	
	
	public JsonResponse(boolean b, Object msg) {
		this.isOK = b;
		this.message = msg;
	}
}
