// 패키지 : 주소
package com.example.JavaStudy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaStudy.Beenie.FearX;
import com.example.JavaStudy.Daily.ClassImplement;
import com.example.JavaStudy.Daily.ClassSuper;
import com.example.JavaStudy.Hoonie.Movie;

@SpringBootApplication
// 클래스 : 코드를 적는 곳
public class JavaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
		
		hoonie();
		beenie();
	}
	
	private static void hoonie() {
		
		Map<String, Movie> movies = processCSV("C:/Users/HP/git/JavaStudy/JavaStudy/src/main/resources/Movies.csv");
		//System.out.println(movies.get("마션").get평점());
		//System.out.println(movies.get("7번방의 선물").get감독());

		
	}
	
    public static Map<String, Movie> processCSV(String filePath) {
    	
    	Map<String, Movie> movies = new HashMap<>();
    	
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

            	// 배열
                String[] data = line.split(", ");
                
//                String 제목 = data[0];
//                String 장르 = data[1];
//                String 발행일 = data[2];
//                String 감독 = data[3];
//                int 평점 = Integer.parseInt(data[4]);      
//                Movie movie = new Movie(장르, 발행일, 감독, 평점);
//                movies.put(제목, movie);
                
                movies.put(data[0], new Movie(data[1], data[2], data[3], Integer.parseInt(data[4])));
               
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return movies;
        
    }
    
	
	// 정적(Static) 메서드 : 인스턴스 없이도 사용가능한 메서드)
	private static void beenie() {
		
		ClassSuper 인턴1 = new ClassSuper("피카츄", 28);
		인턴1.도민준();
		
		ClassImplement 인턴2 = new ClassImplement();
		인턴2.아잉();
		
		ClassImplement 인턴3 = new ClassImplement();
		인턴3.printer();
		
		Map<String, FearX> BNK = processSV("C:/Users/HP/git/JavaStudy/JavaStudy/src/main/resources/FearX.csv");
		System.out.println(BNK.get("Clear").getYear());

	}
	
	public static Map<String, FearX> processSV(String filePath) {
    	
    	Map<String, FearX> BNK = new HashMap<>();
    	
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            while ((line = br.readLine()) != null) {

            	// 배열
                String[] data = line.split(",");
                
                 //String Name = data[0];
                 //String Birth = data[1];
                 //String Position = data[2];
                 //String Champ = data[3];
                 //int Year = Integer.parseInt(data[4]);      
                 //FearX fearx = new FearX(Name, Birth, Position, Champ, Year);
                 //BNK.put(Name, fearx);
                 
                 BNK.put(data[0], new FearX(data[0], data[1], data[2], data[3], Integer.parseInt(data[4])));
                 
                 
                
                
               
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return BNK;
        
	}
}
