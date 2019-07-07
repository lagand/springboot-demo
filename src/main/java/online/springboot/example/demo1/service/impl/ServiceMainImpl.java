package online.springboot.example.demo1.service.impl;

import org.springframework.stereotype.Service;

import online.springboot.example.demo1.service.ServiceMain;

@Service("serviceMain")
public class ServiceMainImpl implements ServiceMain{

	public String findA(String string) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "A";
	}

	public String findB(String string) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "B";
	}

	public String findC(String string) {
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "C";
	}

	public String findD(String string) {
		try {
			Thread.sleep(1600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "D";
	}

	public String findE(String string) {
		try {
			Thread.sleep(1900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "E";
	}

}
