package com.example.JavaStudy.Hoonie;

public class SampleExtendClass extends SampleSuperClass {
	private String name;
	private int age;
	
	public SampleExtendClass(String type, String name, int age) {
		super(type);
		this.name = name;
		this.age = age;
	}
	
	// super 개념 설명
	public void sample() {
		System.out.println(super.type);
	}
}
