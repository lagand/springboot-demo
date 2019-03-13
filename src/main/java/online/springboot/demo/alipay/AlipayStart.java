package online.springboot.demo.alipay;

import org.omg.PortableServer.ServantActivator;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;

public class AlipayStart {

	public static void main(String[] args) {
		AlipayStart alipayStart = new AlipayStart();
		alipayStart.start();
	}
	
	
	public void start() {
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key","RSA2");
		AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
		request.setBizContent("{" +
		"\"out_trade_no\":\"20150320010101001\"," +
		"\"trade_no\":\"2014112611001004680 073956707\"," +
		"\"org_pid\":\"2088101117952222\"" +
		"  }");
		AlipayTradeQueryResponse response = null;
		try {
			response = alipayClient.execute(request);
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
	}
}
