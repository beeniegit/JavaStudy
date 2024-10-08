package com.example.JavaStudy.Daily;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
	
public class Esports {
	private String name;
	private int team_member_count;
	private String howtowin;
	private List<LCKTeams> teams;

}
