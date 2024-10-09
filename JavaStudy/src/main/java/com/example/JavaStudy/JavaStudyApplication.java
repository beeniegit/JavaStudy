// 패키지 : 주소
package com.example.JavaStudy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Beenie.Food;
import com.example.JavaStudy.Beenie.FoodType;
import com.example.JavaStudy.Beenie.Foods;
import com.example.JavaStudy.Daily.ClassImplement;
import com.example.JavaStudy.Daily.ClassSuper;

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
		List<Person> slMembers = new ArrayList<>();
		totMembers.add(new Person("구자욱", 31, 5, "좌익수"));
		totMembers.add(new Person("김재윤", 34, 62, "마무리"));		

		// ssg 랜더스 선수 리스트
		List<Person> ssgMembers = new ArrayList<>();
		totMembers.add(new Person("추신수", 42, 0, "진영"));
		totMembers.add(new Person("조병현", 21, 18, "마무리"));
		
		// 프로야구 팀 리스트
		List<Teams> baseballTeams = new ArrayList<>();
		baseballTeams.add(new Teams("삼성 라이온즈", "대한민국", slMembers));
		baseballTeams.add(new Teams("신세계 랜더스", "대한민국", ssgMembers));
		
		// 야구 인스턴스
		Sports baseball = new Sports("야구", 9, 180, baseballTeams);
		
		// 스포츠 맵
		Map<String, Sports> sports = new HashMap<>();
		sports.put("축구", football);
		sports.put("야구", baseball);
		
		// TEST
		Sports 꺼낸야구 = sports.get("야구");

		System.out.println(sports.get("축구").getTeams().get(0).getMembers().get(0).getName());
                           // List<Teams>
										 // Teams
												// List<Person>
		                                                    // Person
					Sports 꺼낸축구 = sports.get("축구");                             // String (name)
							List<Teams> 꺼낸팀리스트 = 꺼낸축구.getTeams();
										Teams 꺼낸팀 = 꺼낸팀리스트.get(0);
												List<Person> 꺼낸사람리스트 = 꺼낸팀.getMembers();
															Person 꺼낸사람 = 꺼낸사람리스트.get(0);
																	String 꺼낸이름 = 꺼낸사람.getName();
		 System.out.println(꺼낸이름);
		
	}
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드
	
	// 1. 상속, 구현 : Daily
	// 2. 음식 Map (식사, 디저트)
	private static void beenie() {
		
		ClassImplement 인턴1 = new ClassImplement();
		인턴1.케일();
		
		ClassSuper 인턴2 = new ClassSuper("카사딘", 16);
		인턴2.쇼앤프루브();
		
		//고기요리 리스트
		List<Foods> meat = new ArrayList<>();
		meat.add(new Foods("스테이크", "따듯함", "고소함"));
		meat.add(new Foods("육개장", "뜨거움", "얼큰함"));

		// 면요리 리스트
		List<Foods> noodle = new ArrayList<>();
		noodle.add(new Foods("라면", "따듯함", "자극적"));
		noodle.add(new Foods("냉우동", "시원함", "감칠맛"));
		
		List<FoodType> typemain = new ArrayList<>();
		typemain.add(new FoodType("고기", meat));
		typemain.add(new FoodType("면", noodle));
		
		Food main = new Food("메인요리", typemain);
		
		List<Foods> 아이스크림 = new ArrayList<>();
		아이스크림.add(new Foods("요거트맛", "차가움", "상큼함"));
		아이스크림.add(new Foods("민트초코", "차가움", "치약"));
		
		List<FoodType> 디저트 = new ArrayList<>();
		디저트.add(new FoodType());
		
		Food desert = new Food("디저트", 디저트);
		
		Map<String, Food> 음식 = new HashMap<>();
		음식.put("축구", main);
		음식.put("야구", desert);
		
		
		
		
		
		
		
	}

}
