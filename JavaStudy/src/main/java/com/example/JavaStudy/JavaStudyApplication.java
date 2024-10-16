 // 패키지 : 주소
package com.example.JavaStudy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Beenie.응원가박스;
import com.example.JavaStudy.Beenie.응원가스레드;
import com.example.JavaStudy.Daily.클래스수퍼;
import com.example.JavaStudy.Daily.클래스임플리멘트;
import com.example.JavaStudy.Hoonie.MessageBox;
import com.example.JavaStudy.Hoonie.PrinterThread;

@SpringBootApplication
// 클래스 : 코드를 적는 곳
public class JavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		
		hoonie();
		beenie();
	}
	
	private static void hoonie() {
		
		MessageBox box = new MessageBox();
		
		for (int i=1; i<=20; i++) {
			Thread t = new Thread(new PrinterThread(box.returnMessage()));
			//t.start();
		}

	}
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드)
	private static void beenie() {
		
		
		응원가박스 박스 = new 응원가박스();
		
		for (int i=1; i<=400; i++) {
			Thread t = new Thread(new 응원가스레드(박스.리턴메세지()));
			t.start();
		}
		
		클래스임플리멘트 인스턴스1 = new 클래스임플리멘트();
		인스턴스1.분데스();
		
		클래스수퍼 인스턴스2 = new 클래스수퍼("김도빈", 17);
		인스턴스2.프린터기();


	}

}
