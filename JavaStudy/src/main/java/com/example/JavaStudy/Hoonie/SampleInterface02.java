package com.example.JavaStudy.Hoonie;

// [인터페이스] : 클래스가 지켜야 할 약속/규정

public interface SampleInterface02 {
	
	// [속성]
	// 인터페이스의 속성은 반드시 public & final 이다. (수정할 수 없다)
	String 공개문자02 = "공개문자02";
	
	// [메서드]
	// 추상 메서드는 바디가 없으므로, 반드시 구현해야 한다.
	void 추상메서드02();
	
	// 기본 메서드는 바디가 있고, 반드시 구현할 필요가 없다.
	default void 기본메서드02() {
		System.out.println("기본메서드02 실행");
	}
	
}
