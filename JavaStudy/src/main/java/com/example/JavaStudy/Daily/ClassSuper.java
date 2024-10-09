package com.example.JavaStudy.Daily;

public class ClassSuper extends ClassExtend {
	
	public ClassSuper(String champ, int level) {
		super(level, champ);
	}
	
	public void 쇼앤프루브() {
		System.out.println(Level + "레벨 " + Champ + "앞에서는 소용없지");
	}

}
