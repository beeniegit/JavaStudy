package com.example.JavaStudy.Hoonie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {
	private String 장르;
	private String 발행일;
	private String 감독;
	private int 평점;
}
