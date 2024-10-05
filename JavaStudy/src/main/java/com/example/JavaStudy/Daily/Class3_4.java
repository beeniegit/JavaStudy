package com.example.JavaStudy.Daily;
// 써야하는 기능은 import
import java.util.HashMap;
import java.util.Map;
//implements 로 인터페이스 구현
public class Class3_4 implements Interface3_2 {
	// Map : 키와 값으로 이루어진 데이터 묶음
	private Map<String, String> LCKMap = new HashMap<>();
	
	public Class3_4() {
		
		LCKMap.put("T1", "Faker"); // entry : 맵에 집어놓은 데이터 한묶음 (키, 값) 
		LCKMap.put("HLE", "Peanut"); // entry : 맵에 집어놓은 데이터 한묶음 (키, 값)
		LCKMap.put("GEN", "Lehends"); // entry : 맵에 집어놓은 데이터 한묶음 (키, 값)
	}
	
	
	public void SearchTeam(String team) {
		// for 반복문 : () 안의 조건에 해당될 때까지 반복
		// Map.entrySet() : entry 들을 리스트로 뽑아주는 역할
			for (Map.Entry<String, String> entry : LCKMap.entrySet()) {
				if (entry.getKey().equals(team)) {
		            	
					String 팀 = entry.getKey();
					String 주장 = entry.getValue();
		         
		            System.out.println("팀:" + 팀 + ", 주장:" + 주장);
		            }
		        }
			}
	
	public void SearchLeader(String leader) {
		
		// for 반복문 : () 안의 조건에 해당될 때까지 반복
		// Map.entrySet() : entry 들을 리스트로 뽑아주는 역할
        for (Map.Entry<String, String> entry : LCKMap.entrySet()) {
            if (entry.getValue().equals(leader)) {
            	
            	String 팀 = entry.getKey();
            	String 주장 = entry.getValue();
         
                System.out.println("팀 : " + 팀 + ", 주장 : " + 주장);
            }
        }
		
	}

}
