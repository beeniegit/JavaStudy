package com.example.JavaStudy.Beenie;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Food {
	
	private String name;
	private List<FoodType> type; 
}
