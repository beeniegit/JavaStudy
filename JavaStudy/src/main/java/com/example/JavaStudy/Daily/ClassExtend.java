package com.example.JavaStudy.Daily;

public class ClassExtend {
	
	protected String City;
	protected String Food;
	
	public ClassExtend(String city, String food) {
		this.Food = food;
		this.City = city;
	}
	public String getCity() {
		return City;
	}
	
	public String getFood() {
		return Food;
	}
	
	public void setCity(String city) {
		this.City = city;
	}
	
	public void setFood(String food) {
		this.Food = food;
	}

}
