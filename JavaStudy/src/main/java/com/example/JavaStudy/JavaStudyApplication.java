// 패키지 : 주소
package com.example.JavaStudy;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Beenie.ClassRunrun;
import com.example.JavaStudy.Hoonie.Worker;

@SpringBootApplication
// 클래스 : 코드를 적는 곳
public class JavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		
		hoonie();
		beenie();
	}
	
	private static void hoonie() {
		
		List<String> 출력문자모음 = new ArrayList<>();
		출력문자모음.add("오늘은 24년 10월 14일입니다.");
		출력문자모음.add("형이 시간이 부족해서 과외를 하기가 어렵습니다.");
		출력문자모음.add("동생의 생일은 약 2주가 지났습니다.");
		출력문자모음.add("형의 생일은 약 1주가 지났습니다.");
		출력문자모음.add("Java는 쉽고도 어려운 언어입니다.");
		출력문자모음.add("저는 지금 배도 고프고 피곤합니다.");
		
		for (String 출력문자 : 출력문자모음) {
			Thread thread = new Thread(new Worker(출력문자));
			//thread.start();
		}
		
	}
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드)
	private static void beenie() {
		
		List<String> 기습숭배 = new ArrayList<>();
		기습숭배.add("역시 대상혁");
		기습숭배.add("새삼 대단한 대상혁");
		
		for (String Faker : 기습숭배) {
			Thread thread = new Thread(new ClassRunrun(Faker));
			thread.start();
		}

	}

}
