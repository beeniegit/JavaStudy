package com.example.JavaStudy.Daily;
// 인터페이스 = 클래스가 지켜야 할 규칙
public interface Interface1 {
	// 추상 메서드 = 몸통 없이도 쓸 수 있음, 반드시 구현해야 함
	void rapid();
	
	// 기본 메서드 = 몸통이 있음, 반드시 구현할 필요는 없음
	default void prove() {
		System.out.println("hi");
	}

}
