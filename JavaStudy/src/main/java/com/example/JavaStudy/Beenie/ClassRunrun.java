package com.example.JavaStudy.Beenie;

public class ClassRunrun implements Runnable {
	
	private String Faker = "대상혁";
	
	public ClassRunrun() {
		
	}
	
	public ClassRunrun(String Faker) {
		this.Faker = Faker;
	}
	
	public void run() {
		for (int i = 1; i <= 507; i ++) {
			System.out.println("[" + i + "번째 출력] " + Faker);
	}
	}
	
}
