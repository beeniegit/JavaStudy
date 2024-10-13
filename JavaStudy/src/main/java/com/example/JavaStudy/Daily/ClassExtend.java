package com.example.JavaStudy.Daily;

public class ClassExtend {
	
	protected String Champ;
	protected Integer Level;
	
	public ClassExtend(String champ, int level) {
		this.Champ = champ;
		this.Level = level;
	}
	
	 public void setLevel(int level) {
	        this.Level = level;
	    }
	 
	 public void printer() {
	        if (this.Level != null) {
	            System.out.println(Level + "레벨 " + Champ + " 은 벌레컷");
	        } else {
	            System.out.println("유효하지 않은 레벨입니다.");
	        }
		}	
	
}
