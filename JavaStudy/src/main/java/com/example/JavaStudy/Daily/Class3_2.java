package com.example.JavaStudy.Daily;
// extends 로 상속(물려)받기
public class Class3_2 extends Class3_1 {
	// 초기화 메서드 : 인스턴스 생성시에 기능함
	public Class3_2(String zeus, String oner) {
		super(zeus, oner); // super 로 상속받은 속성 매핑
	}
	// 메서드
	public void hi() {
		System.out.println("물떠와라 " + Zeus + "\n니가해 " + Oner);
	}

}
