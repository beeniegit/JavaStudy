package com.example.JavaStudy.Hoonie;

import java.util.HashMap;
import java.util.Map;

public class FamilyDictionary implements Dictionary{
	// Map : 키와 값으로 이루어진 데이터 묶음
	private Map<String, Integer> FamilyMap = new HashMap<>();
	
	public FamilyDictionary() {
		// entry : 맵에 집어넣은 1개의 데이터 쌍 (키, 값)
		FamilyMap.put("김영기", 57);
		FamilyMap.put("김양희", 56);
		FamilyMap.put("김도훈", 29);
		FamilyMap.put("김도빈", 18);
	}
	
	public void SearchName(String name) {
		// for 반복문 : () 안의 조건에 맞을 때까지 반복되는 반복문
		// Map.entrySet() : entry 들을 리스트로 뽑아주는 역할
        for (Map.Entry<String, Integer> entry : FamilyMap.entrySet()) {
            if (entry.getKey().equals(name)) {
            	
            	String 이름 = entry.getKey();
            	int 나이 = entry.getValue();
         
                System.out.println("[가족구성원] 이름:" + 이름 + ", 나이:" + 나이);
            }
        }
	}
	
	public void SearchAge(int age) {
		
		// for 반복문 : () 안의 조건에 맞을 때까지 반복되는 반복문
		// Map.entrySet() : entry 들을 리스트로 뽑아주는 역할
        for (Map.Entry<String, Integer> entry : FamilyMap.entrySet()) {
            if (entry.getValue().equals(age)) {
            	
            	String 이름 = entry.getKey();
            	int 나이 = entry.getValue();
         
                System.out.println("[가족구성원] 이름:" + 이름 + ", 나이:" + 나이);
            }
        }
		
	}
}

