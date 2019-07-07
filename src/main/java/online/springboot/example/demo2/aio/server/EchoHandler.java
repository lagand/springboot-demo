package online.springboot.example.demo2.aio.server;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class EchoHandler implements CompletionHandler<Integer, ByteBuffer>{
	
	private AsynchronousSocketChannel clientChannel;

	public void completed(Integer result, ByteBuffer attachment) {
		// TODO Auto-generated method stub
		
	}

	public void failed(Throwable exc, ByteBuffer attachment) {
		// TODO Auto-generated method stub
		
	}
	
	

}
