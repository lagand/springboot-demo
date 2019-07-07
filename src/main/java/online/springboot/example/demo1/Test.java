//package online.springboot.example.demo1;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.FutureTask;
//
//import online.springboot.example.demo1.service.ServiceMain;
//import online.springboot.example.demo1.service.impl.ServiceMainImpl;
//
//public class Test {
//	
//	private static ExecutorService pool = Executors.newFixedThreadPool(5);
//
//	public static void main(String[] args) {
//		final ServiceMain serviceMain = new ServiceMainImpl();
//		
//		final String s1 = "";
//		final String s2 = "";
//		final String s3 = "";
//		final String s4 = "";
//		final String s5 = "";
//		
//		Callable callable1 = new Callable<String>() {
//			public String call() throws Exception {
//				s1 = serviceMain.findA("");
//				return serviceMain.findA("");
//			}
//		};
//		Callable callable2 = new Callable<String>() {
//			public String call() throws Exception {
//				return serviceMain.findB("");
//			}
//		};
//		Callable callable3 = new Callable<String>() {
//			public String call() throws Exception {
//				return serviceMain.findC("");
//			}
//		};
//		Callable callable4 = new Callable<String>() {
//			public String call() throws Exception {
//				return serviceMain.findD("");
//			}
//		};
//		Callable callable5 = new Callable<String>() {
//			public String call() throws Exception {
//				return serviceMain.findE("");
//			}
//		};
//		pool.execute(new FutureTask<String>(callable1));
//		pool.execute(new FutureTask<String>(callable2));
//		pool.execute(new FutureTask<String>(callable3));
//		pool.execute(new FutureTask<String>(callable4));
//		pool.execute(new FutureTask<String>(callable5));
//		FutureTask<String> task1 = new FutureTask<String>(callable1);
//		pool.submit(task1);
//	}
//	
//	
//	public long sequence(ServiceMain serviceMain) {
//		long startTime = System.currentTimeMillis();
//		String s1 = serviceMain.findA("");
//		String s2 = serviceMain.findB("");
//		String s3 = serviceMain.findC("");
//		String s4 = serviceMain.findD("");
//		String s5 = serviceMain.findE("");
//		
//		System.out.println(s1+s2+s3+s4+s5);
//		long endTime = System.currentTimeMillis();
//		System.out.println("spend time "+(endTime-startTime));
//		return endTime-startTime;
//	}
//}
