// 패키지 : 주소
package com.example.JavaStudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.JavaStudy.Daily.*;
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
		Class1_2 instance1 = new Class1_2("허수", 24); // 인스턴스로 클래스 구현
		instance1.print();
		
		Class1_3 instance2 = new Class1_3(); // 인스턴스로 클래스 구현
		instance2.rapid();
		
		Class2_2 instance3 = new Class2_2("리그 오브 레전드", "발로란트", "AOS, FPS "); // 인스턴스로 클래스 구현
		instance3.ineedtosay();
		
		Class2_3 instance4 = new Class2_3(); // 인스턴스로 클래스 구현
		instance4.Faker();
		
	}

}
