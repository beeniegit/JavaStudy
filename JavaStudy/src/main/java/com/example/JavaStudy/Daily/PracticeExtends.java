package com.example.JavaStudy.Daily;
// 클래스
public class PracticeExtends {
	// 속성
	protected int Grade;
	protected int Room;
	// 초기화 메서드 : 인스턴스 생성시에 기능함
	public PracticeExtends(int grade, int room) {
		this.Grade = grade;
		this.Room = room;
	}
	// get : 속성 값 받기
	public int getGrade() {
		return Grade;
	}
	 // get : 속성 값 받기
	public int getRoom() {
		return Room;
	}
	// set : 속성 값 수정하기
	public void setGrade(int grade) {
		this.Grade = grade;
	}
	// set : 속성 값 수정하기
	public void setRoom(int room) {
		this.Room = room;
	}
	
	

}
