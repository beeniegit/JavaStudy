// 패키지 : 주소
package com.example.JavaStudy.Beenie;
import lombok.Getter;
import lombok.Setter;
// lombok을 import해 작업 간소화
@Getter // 속성의 값을 가져오는 역할
@Setter // 속성의 값을 수정하는 역할
// 클래스 : 코드를 적는 곳
// implements로 인터페이스 상속받기
public class DK implements DKinterface {
	// 속성 : 데이터
	private String Team;
	private String Member;
	private String Leader;
	
	//메서드 : 기능을 함
	//초기화 메서드 : 클래스랑 동일 이름, 인스턴스 생성시에 기능함
	public DK(String Team, String member, String leader) {
		this.Team = Team; // this로 값 입력
		this.Member = member; // this로 값 입력
		this.Leader = leader; // this로 값 입력		 
	}
	
	public void 아무거나(String team, String member, String leader) {
		this.Team = team; // this로 값 입력
		this.Member = member; // this로 값 입력
		this.Leader = leader; // this로 값 입력	
	}
	//메서드 : 기능을 함
	public void Class1() {
		System.out.println("저희 딮기는요 팀명은 " + Team + "고요 멤버는 " + Member + "이 있고요 주장은 " + Leader + "랍니다 딮기많응~");
	}

}
