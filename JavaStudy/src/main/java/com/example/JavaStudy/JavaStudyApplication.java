// 패키지 : 주소
package com.example.JavaStudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Beenie.클래스수퍼;
import com.example.JavaStudy.Daily.수퍼;
import com.example.JavaStudy.Daily.임플리멘트;
import com.example.JavaStudy.Hoonie.SampleExtendClass;
import com.example.JavaStudy.Hoonie.SampleSuperClass;

@SpringBootApplication
// 클래스 : 코드를 적는 곳
public class JavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		
		hoonie();
		beenie();
	}
	
	private static void hoonie() {
		
		// SampleExtendClass(super = SampleSuperClass)
		
		SampleExtendClass sampleOne = new SampleExtendClass("사람", "김도훈", 29);
		
		SampleSuperClass sampleTwo = new SampleExtendClass("사람", "김도훈", 29);
		sampleTwo.makeSound();
		// sampleTwo.sample();
		
	}
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드)
	private static void beenie() {
		수퍼 맥도날드 = new 수퍼(1, 2);
		맥도날드.오잉();
		
		임플리멘트 롯데리아 = new 임플리멘트();
		롯데리아.아잉();
		
	}

}
