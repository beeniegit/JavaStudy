package Sample;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Teams {
	
	private String name;
	private String country;
	private List<Person> members;
	
}
