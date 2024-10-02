package com.example.JavaStudy.Hoonie;

// [클래스]
public class SampleSuperClass {
	
	// [속성]
	// public : 이 Class 바깥에서 사용할 수 있음
	public String 공개문자 = "Hello, World!";
	public int 공개숫자 = 18;
	
	// private : 이 Class 바깥에서 사용할 수 없음
	private String 비밀문자;
	private int 비밀숫자;
	
	// protected : 이 Class를 상속받은 Class에서 사용할 수 있음
	protected String 보호문자;
	protected int 보호숫자;
	
	// [메서드]
	// [초기화 메서드] : Instance 생성 시점에 기능을 수행함
	public SampleSuperClass(String 비밀문자, int 비밀숫자, String 보호문자, int 보호숫자) {
		this.비밀문자 = 비밀문자;
		this.비밀숫자 = 비밀숫자;
		this.보호문자 = 보호문자;
		this.보호숫자 = 보호숫자;
	}
	
	// public : 이 Class 바깥에서 사용할 수 있음
	public void 공개메서드() {
		System.out.println("공개 메서드 실행");
	}
	
	// private : 이 Class 바깥에서 사용할 수 없음
	private void 비밀메서드() {
		System.out.println("비밀 메서드 실행");
	}
	
	// protected : 이 Class를 상속받은 Class에서 사용할 수 있음
	protected void 보호메서드() {
		System.out.println("보호 메서드 실행");
	}
	
}
