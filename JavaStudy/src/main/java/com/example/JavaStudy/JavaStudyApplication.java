// 패키지 : 주소
package com.example.JavaStudy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Daily.ClassImplement;
import com.example.JavaStudy.Daily.ClassSuper;
import com.example.JavaStudy.Daily.Esports;
import com.example.JavaStudy.Daily.LCKPlayer;
import com.example.JavaStudy.Daily.LCKTeams;

import Sample.Person;
import Sample.Sports;
import Sample.Teams;

@SpringBootApplication
// 클래스 : 코드를 적는 곳
public class JavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		
		hoonie();
		beenie();
	}
	
	private static void hoonie() {
		
		// 리스트 : [같은 규격]의 데이터의 [순서] 집합
		// 맵 : [같은 규격]의 [키]와 [값]의 쌍으로 이루어진 데이터의 집합
		
		// 토트넘 선수 리스트
		List<Person> totMembers = new ArrayList<>();
		totMembers.add(new Person("손흥민", 32, 7, "좌윙"));
		totMembers.add(new Person("메디슨", 28, 10, "공미"));

		// 아스날 선수 리스트
		List<Person> arsMembers = new ArrayList<>();
		arsMembers.add(new Person("외데고르", 25, 8, "공미"));
		arsMembers.add(new Person("싸카", 23, 7, "우윙"));
		
		// 축구 팀 리스트
		List<Teams> footballTeams = new ArrayList<>();
		footballTeams.add(new Teams("토트넘", "영국", totMembers));
		footballTeams.add(new Teams("아스날", "영국", arsMembers));
		
		// 축구 인스턴스
		Sports football = new Sports("축구", 11, 90, footballTeams);
		
		// 삼성 라이온즈 선수 리스트
		List<Person> smMembers = new ArrayList<>();
		totMembers.add(new Person("구자욱", 31, 5, "좌익수"));
		totMembers.add(new Person("김재윤", 34, 62, "마무리"));		

		// ssg 랜더스 선수 리스트
		List<Person> ssgMembers = new ArrayList<>();
		totMembers.add(new Person("추신수", 42, 0, "진영"));
		totMembers.add(new Person("조병현", 21, 18, "마무리"));
		
		// 프로야구 팀 리스트
		List<Teams> baseballTeams = new ArrayList<>();
		baseballTeams.add(new Teams("삼성 라이온즈", "대한민국", smMembers));
		baseballTeams.add(new Teams("신세계 랜더스", "대한민국", ssgMembers));
		
		// 야구 인스턴스
		Sports baseball = new Sports("야구", 9, 180, baseballTeams);
		
		// 스포츠 맵
		Map<String, Sports> sports = new HashMap<>();
		sports.put("축구", football);
		sports.put("야구", baseball);
		
		// TEST
		Sports 꺼낸야구 = sports.get("야구");

		//System.out.println(sports.get("축구").getTeams().get(0).getMembers().get(0).getName());
                           // List<Teams>
										 // Teams
												// List<Person>
		                                                    // Person
					Sports 꺼낸축구 = sports.get("축구");                                                             // String (name)
							List<Teams> 꺼낸팀리스트 = 꺼낸축구.getTeams();
										Teams 꺼낸팀 = 꺼낸팀리스트.get(0);
												List<Person> 꺼낸사람리스트 = 꺼낸팀.getMembers();
															Person 꺼낸사람 = 꺼낸사람리스트.get(0);
																	String 꺼낸이름 = 꺼낸사람.getName();
		//System.out.println(꺼낸이름);
		
	}
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드
	private static void beenie() {
		
		// T1 선수단
		List<LCKPlayer> T1member = new ArrayList<>();
		T1member.add(new LCKPlayer("대상혁", 28, "Mid Laner"));
		T1member.add(new LCKPlayer("이민형", 22, "AD Carry"));

		// 젠지 선수단
		List<LCKPlayer> GENmember = new ArrayList<>();
		GENmember.add(new LCKPlayer("정지훈", 23, "Mid Laner"));
		GENmember.add(new LCKPlayer("신창섭", 19, "GOD"));
		
		// LCK 팀 리스트
		List<LCKTeams> LCKTeam = new ArrayList<>();
		LCKTeam.add(new LCKTeams("T1", "Korea Republic", T1member));
		LCKTeam.add(new LCKTeams("Gen.G Esports", "Korea Republic", GENmember));
		
		Esports LoL = new Esports("LoL Esport", 5, "Destroy_enemy's_nexus", LCKTeam);
		
		Map<String, Esports> esports = new HashMap<>();
		esports.put("롤 이스포츠", LoL);
		
		System.out.println(esports.get("롤 이스포츠").getTeams().get(0).getMembers().get(0).getName());
		
		ClassSuper Instance1 = new ClassSuper("부산", "돼지국밥");
		Instance1.BiteYourself();
		
		ClassImplement Instance2 = new ClassImplement();
		Instance2.Neto();
		
		
	}

}
