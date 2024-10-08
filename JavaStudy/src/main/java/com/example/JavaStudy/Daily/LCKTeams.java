package com.example.JavaStudy.Daily;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class LCKTeams {
	private String name;
	private String country;
	private List<LCKPlayer> members;

}
