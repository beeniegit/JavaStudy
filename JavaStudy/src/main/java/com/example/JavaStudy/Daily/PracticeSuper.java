package com.example.JavaStudy.Daily;
// extends 로 상속받기
public class PracticeSuper extends PracticeExtends {
	
	// 초기화 메서드 : 인스턴스 생성시에 기능함
	public PracticeSuper(int grade, int room) {
		super(grade, room); // super : 상속받은 클래스의 속성 값 매핑
	}
	// 메서드
	public void printer() {
		System.out.println("저는 " + Grade + "학년 " + Room + "반 입니다.");
	}

}
