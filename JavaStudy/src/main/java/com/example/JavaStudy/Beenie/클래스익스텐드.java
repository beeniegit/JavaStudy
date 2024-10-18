package com.example.JavaStudy.Beenie;

public class 클래스익스텐드 extends 클래스수퍼 {
	
	private String 티어;
	
	public 클래스익스텐드(String 보상, String 티어) {
		super(보상);
		this.티어 = 티어;
	}
	
	public void 메서드() {
		System.out.println(super.보상);
	}

}
