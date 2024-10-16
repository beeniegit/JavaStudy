package com.example.JavaStudy.Beenie;

public class 응원가스레드 implements Runnable {
	
private String 메세지;
	
	public 응원가스레드(String 메세지) {
		this.메세지 = 메세지;
	}
	
	// @Override
	public void run() {
		System.out.println(메세지);
	}

}
