package com.example.JavaStudy.Hoonie;

public class Worker implements Runnable {
	
	private String 출력문자 = "Hello, World!";
	
	// @NoArgsConstructor
	public Worker() {
		
	}
	
	// @AllArgsConstructor
	public Worker(String 출력문자) {
		this.출력문자 = 출력문자;
	}
	
	// @Override
	public void run() {
		for (int i = 1; i <= 10000; i ++) {
			System.out.println("[" + i + "번째 출력] " + 출력문자);
		}
	}
}
