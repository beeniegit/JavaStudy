package com.example.JavaStudy.Hoonie;

// [구현 == implements] : 인터페이스의 규칙을 지키며 클래스를 만드는 것
// 여러개의 인터페이스를 동시에 구현할 수 있음

// [클래스]
public class SampleImplementClass implements SampleInterface01, SampleInterface02 {
	
	// 추상 메서드는 반드시 구현해야 한다
	public void 추상메서드01() {
		System.out.println("추상메서드01 구현");
	}
	
	// 추상 메서드는 반드시 구현해야 한다
	public void 추상메서드02() {
		System.out.println("추상메서드02 구현");
	}
	
	// @Override : 같은 이름의 메서드를 수정/대체
	@Override
	public void 기본메서드01() {
		System.out.println("기본메서드01 수정.. 이름 : " + 공개문자01 + " : " + 공개문자02);
	}
	
}
