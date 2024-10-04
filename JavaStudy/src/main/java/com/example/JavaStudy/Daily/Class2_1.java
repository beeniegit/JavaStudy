package com.example.JavaStudy.Daily;
// 클래스
public class Class2_1 {
	// 속성
	protected String LOL;
	protected String VAL;
	// 초기화 메서드 = 인스턴스 생성 시점에 기능하는 메서드 
	public Class2_1(String lol, String val) {
		this.LOL = lol; // this 로 대상 확실시
		this.VAL = val; // this 로 대상 확실시
		
	}
	// get 으로 속성 값 받아내기
	public String getLOL() {
		return LOL;
	}
	// set 으로 속성 값 수정하기
	public void setLOL(String lol) {
		this.LOL = lol;
	}
	// get 으로 속성 값 받아내기
	public String getVAL() {
		return VAL;
	}
	// set 으로 속성 값 수정하기
	public void setVAL(String val) {
		this.VAL = val;
	}

}
