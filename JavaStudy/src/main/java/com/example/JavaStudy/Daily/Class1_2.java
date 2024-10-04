package com.example.JavaStudy.Daily;
// extends 로 클래스 상속(물려)받기 (한 클래스만 상속 받을 수 있음)
public class Class1_2 extends Class1_1 {
	// 클래스
	public Class1_2(String name, int age) {
		super(name, age); // super 로 상속받은 메서드의 속성 값 매핑
	}
	// 메서드
	public void print() {
		System.out.println("Hi, my name is " + Name + ", and my age is " + Age);
	}

}
