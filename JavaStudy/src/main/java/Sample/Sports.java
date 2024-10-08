package Sample;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Sports {
	
	private String name;
	private int team_member_count;
	private int runtime;
	private List<Teams> teams;
	
}
