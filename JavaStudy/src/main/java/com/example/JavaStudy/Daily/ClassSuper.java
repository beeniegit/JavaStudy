package com.example.JavaStudy.Daily;

public class ClassSuper extends ClassExtend {
	
	public ClassSuper(String champ, int level) {
		super(champ, level);
		this.setLevel(level);
	}
	
	private Integer returnLevel(int level) {
		// 삼항 연산자
		return (level >= 1 && level <= 18) ? level : null;
	}
	@Override
	public void setLevel(int level) {
		this.Level = returnLevel(level);
	}
	
	
}
