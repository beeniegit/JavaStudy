package com.example.JavaStudy.Hoonie;

public class Condition {
	private String name;
	private int age;
	
	// getter setter
	public void setAge(int age) {
		this.age = returnAge(age);
	}
	
	private int returnAge(int age) {
		// 삼항 연산자
		return (age >= 0 & age <= 130) ? age : null;
	}
	
	
}
