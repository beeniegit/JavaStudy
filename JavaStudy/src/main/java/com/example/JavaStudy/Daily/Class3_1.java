package com.example.JavaStudy.Daily;
// 클래스
public class Class3_1 {
	// 속성
	protected String Zeus;
	protected String Oner;
	// 초기화 메서드 : 인스턴스 생성시에 기능함
	public Class3_1(String zeus, String oner) {
		this.Zeus = zeus;
		this.Oner = oner;
	}
	// get : 속성 값 받기
	public String getZeus() {
		return Zeus;
	}
	// get : 속성 값 받기
	public String getOner() {
		return Oner;
	}
	// set :  속성 값 수정하기
	public void setZeus(String zeus) {
		this.Zeus = zeus;
	}
	// set :  속성 값 수정하기
	public void setOner(String oner) {
		this.Oner = oner;
	}
	

}
