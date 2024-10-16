package com.example.JavaStudy.Beenie;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class 응원가박스 {
	private List<String> 메세지리스트 = new ArrayList<>();
	
	private static AtomicInteger counter = new AtomicInteger(0);
	
	public 응원가박스() {
		this.메세지리스트.add("삼성의 승리 위하여 외쳐라 최강 삼성");
		this.메세지리스트.add("언제나 우린 함께 하리 우리는 삼성 라이온즈");
		this.메세지리스트.add("들리는가 우리의 목소리 보이는가 우리의 모습");
		this.메세지리스트.add("대구의 자랑! 대구의 자존심! 언제나 함께 하리라");
		this.메세지리스트.add("함께가자! 라이온즈!");
		
		
	}
	
	public String 리턴메세지() {
		// compareAndSet : 값을 비교해서, 일치하면 다른 값으로 바꿈
		counter.compareAndSet(4, 0);
		
		// getAndIncrement : 현재 값을 반환하고, +1
		return this.메세지리스트.get(counter.getAndIncrement());
	}
		
	

}
