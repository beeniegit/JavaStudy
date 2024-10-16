package com.example.JavaStudy.Hoonie;

// Thread : Runnable 인터페이스를 구현
public class PrinterThread implements Runnable {
	
	private String message;
	
	public PrinterThread(String message) {
		this.message = message;
	}
	
	// @Override
	public void run() {
		System.out.println("[가족 구성원의 이름] : " + message);
	}
	
}
