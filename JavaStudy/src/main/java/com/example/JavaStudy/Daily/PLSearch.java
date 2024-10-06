package com.example.JavaStudy.Daily;
import java.util.HashMap;
import java.util.Map;
//implements 로 인터페이스 구현 요구
public class PLSearch implements PLInterface {
	// 맵 : (키, 값)으로 이루어진 데이터 묶음
	private Map<String, String> PLMap = new HashMap<>();
	
	public PLSearch() {
		// entry : 맵에 집어넣은 데이터 묶음
		PLMap.put("Spurs", "Son");
		PLMap.put("Man City", "Walker");
	}
	
	public void SearchTeam(String team) {
		// for 반복문 : () 안의 조건에 해당 될 때까지 반복
		// Map.entrySet() : entry 들을 리스트로 뽑아줌
		for (Map.Entry<String, String> entry : PLMap.entrySet()) {
			if (entry.getKey().equals(team)) {
				
				String 팀 = entry.getKey();
				String 주장 = entry.getValue();
				
				System.out.println("팀 :" + 팀 + ", 주장 :" + 주장);
			}
		}
	}
	public void SearchLeader(String leader) {
		// for 반복문 : () 안의 조건에 해당 될 때까지 반복
				// Map.entrySet() : entry 들을 리스트로 뽑아줌
		for (Map.Entry<String, String> entry : PLMap.entrySet()) {
			if (entry.getValue().equals(leader)) {
				
				String 팀 = entry.getKey();
				String 주장 = entry.getValue();
				
				System.out.println("팀 :" + 팀 + ", 주장 :" + 주장);
			}
		}
	}
	
	

}
