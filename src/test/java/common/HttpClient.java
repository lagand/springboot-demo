package common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpClient {
	
	public static void main(String[] args) {
		
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(8);
		
		for(int i=0;i<500;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			fixedThreadPool.submit(new Runnable() {
				
				public void run() {
					String result = commit();
					String arr[] = result.split(",");
					System.out.println(arr[0]);
				}
			});
		}
		
		System.out.println(commit());
	}
	
	private static String commit() {
		CloseableHttpClient httpClient = null;
		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).build();
		httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
		HttpGet getMethod = new HttpGet("http://localhost:8080/getApi");	
		String result = "";
		try {
			CloseableHttpResponse response = httpClient.execute(getMethod);
			result = EntityUtils.toString(response.getEntity(), "UTF-8");
		} catch (Exception e) {
			return "false, client fail";
		}
		return result;
	}
}
