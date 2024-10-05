package com.example.JavaStudy.Hoonie.Reference;

// [상속 == Extends] : 클래스의 속성과 메서드를 물려받아 사용하는 것

// [클래스]
public class SampleExtendClass extends SampleSuperClass {
	
	// [속성]
	// private : 이 Class 내에서만 사용 가능
	private String 개인문자;
	
	// [메서드]
	// [초기화 메서드] : 인스턴스 생성 시점에 기능을 수행함
	public SampleExtendClass(String 비밀문자, int 비밀숫자, String 보호문자, int 보호숫자, String 개인문자) {
		// ** 상속받은 Class 가 Mapping 하는 변수는 무조건 Mapping 해야 한다 **
		// super : 상속받은 Class의 Mapping 작업을 수행함
		super(비밀문자, 비밀숫자, 보호문자, 보호숫자);
		
		this.개인문자 = 개인문자;
	}
	
	// [메서드] : 인스턴스를 생성해야만 이 Class 바깥에서 사용할 수 있음
	public void Test() {
		// 상속받은 private 속성은 사용할 수 없다
//		System.out.println(비밀문자);
		
		// 상속받은 public 속성은 사용할 수 있다
		System.out.println(공개문자);
		
		// 상속받은 protected 속성은 사용할 수 있다
		System.out.println(보호문자);
		
		// 상속받은 private 메서드는 사용할 수 없다
//		비밀메서드();
		
		// 상속받은 public 메서드는 사용할 수 있다
		공개메서드();
		
		// 상속받은 proteced 메서드는 사용할 수 있다
		보호메서드();
	}
	
	// private 속성을 반환할 때는 get 메서드를 만든다
	public String get개인문자() {
		return this.개인문자;
	}
	
	// private 속성을 수정할 때는 set 메서드를 만든다
	public void set개인문자(String 개인문자) {
		this.개인문자 = 개인문자;
	}
	
}
