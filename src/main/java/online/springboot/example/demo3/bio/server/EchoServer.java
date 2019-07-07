package online.springboot.example.demo3.bio.server;

import java.net.ServerSocket;

import io.netty.channel.unix.Socket;

public class EchoServer {

	public static void main(String[] args) {
		
	}
}


class Echoserverhandler implements AutoCloseable{
	
	private ServerSocket serverSocket;
	
	public Echoserverhandler() throws Exception{
		 
		this.serverSocket = new ServerSocket(8080);
		System.out.println("echo server has been start ...");
		this.clientConnect();
	}
	
	private void clientConnect() throws Exception{
		boolean serverFlag = true;
		while(serverFlag) {
			//Socket client = this.serverSocket.accept();
			
		}
	}

	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}