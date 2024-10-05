// 패키지 : 주소
package com.example.JavaStudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Daily.Class3_2;
import com.example.JavaStudy.Daily.Class3_3;
import com.example.JavaStudy.Daily.Class3_4;
import com.example.JavaStudy.Daily.Enum3;

@SpringBootApplication
// 클래스 : 코드를 적는 곳
public class JavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		
		hoonie();
		beenie();
	}
	
	private static void hoonie() {
		
		/*
		 * 0. Beenie 패키지 만들기
		 * 
		 * 1. 클래스, 인스턴스, 메서드, 속성, 인터페이스, 상속, 구현 수행하기
		 * (주석으로 설명도 다 남기기)
		 * 
		 * 2. 터미널에서 아래의 명령어로 git 등록하기
		 * > git add .
		 * > git commit -m "241001 - 기본 자바 구조 학습"
		 * > git push
		 * 
		 */
		
	}
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드)
	private static void beenie() {
		
		Class3_2 Instance3_1 = new Class3_2("최우제", "문현준");
		Instance3_1.hi(); // 인스턴스 만들어서 메서드 작동
		
		Class3_3 Instance3_2 = new Class3_3();
		Instance3_2.Keria(); // 인스턴스 만들어서 메서드 작동
		
		Class3_4 Instance3_3 = new Class3_4();
		Instance3_3.SearchTeam("T1"); // 인스턴스 만들어서 메서드 작동
		
		Class3_4 Instance3_4 = new Class3_4();
		Instance3_4.SearchLeader("Peanut"); // 인스턴스 만들어서 메서드 작동
		
		Enum3 Today = Enum3.주말;
		
		if (Today == Enum3.주중) {
			System.out.println("오늘은 학교 가야함ㅠㅠ");
		}
		else {
			System.out.println("오늘은 학교 안감^^");
		}
		
	}

}
