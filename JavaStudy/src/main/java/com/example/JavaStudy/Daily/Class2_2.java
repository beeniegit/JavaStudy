package com.example.JavaStudy.Daily;
// 클래스
// extends 로 클래스 상속받기 (하나의 클래스만 상속가능)
public class Class2_2 extends Class2_1 {
	// 속성
	private String Type;
	// 초기화 메서드 = 인스턴스 생성 시점에 기능하는 메서드 
	public Class2_2(String lol, String val, String type) {
		super(lol, val); // super 로 부모 클래스의 속성 매핑
		this.Type = type; // this 로 대상 확실시
	}
	// 메서드
	// get 으로 속성 값 받아내기
	public String getType() {
		return Type;
	}
	// 메서드
	// set 으로 속성 값 수정하기
	public void setType(String type) {
		this.Type = type;
	}
	// 메서드
	public void ineedtosay() {
		System.out.println("저는 "+ LOL + "랑 " + VAL + "란 게임을 좋아합니다 각각 " + Type + "장르의 게임입니다");
	}
		

}
