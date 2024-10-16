package com.example.JavaStudy.Hoonie;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MessageBox {

	private List<String> messageList = new ArrayList<>();
	
	// static : 내용을 Class 에 직접 저장한다 (Instance 가 아니라..)
	// AutomicInteger
	private static AtomicInteger counter = new AtomicInteger(0);
	
	public MessageBox() {
		this.messageList.add("김영기");
		this.messageList.add("김양희");
		this.messageList.add("김도훈");
		this.messageList.add("김도빈");
	}
	
	public String returnMessage() {
		// compareAndSet : 값을 비교해서, 일치하면 다른 값으로 바꿈
		counter.compareAndSet(4, 0);
		
		// getAndIncrement : 현재 값을 반환하고, +1
		return this.messageList.get(counter.getAndIncrement());
	}
	
}
