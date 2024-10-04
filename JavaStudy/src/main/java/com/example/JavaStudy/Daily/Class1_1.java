package com.example.JavaStudy.Daily;
// 클래스
public class Class1_1 {
	// 속성
	protected String Name;
	protected int Age;
	// 초기화 메서드 = 인스턴스 생성시에 기능함
	public Class1_1(String name, int age) {
		this.Name = name; // this = 초기화하는 대상 확실시
		this.Age = age; // this = 초기화하는 대상 확실시
	}
	// get = 속성 값 얻어내기
	public String getName() {
		return Name;
	}
	// get = 속성 값 얻어내기
	public int getage() {
		return Age;
	}
	// set = 속성 값 수정하기
	public void setName(String name) {
		this.Name = name;
	}
	// set = 속성 값 수정하기
	public void setAge(int age) {
		this.Age = age;
	}

}
