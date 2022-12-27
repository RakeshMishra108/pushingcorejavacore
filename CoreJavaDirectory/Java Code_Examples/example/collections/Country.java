package example.collections;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String code;
	private String name;
	private List<State> allStates;
	public Country() {
		// TODO Auto-generated constructor stub
		code = "IND";
		name = "India";
		allStates = new ArrayList<State>();
		//Adding States into the List: allStates
		State s1 = new State();
		State s2 = new State("GJ", "Gujrat", "Gandhinagar");
		State s3 = new State("KA", "Karnataka", "Bengaluru");
		allStates.add(s1);
		allStates.add(s2);
		allStates.add(s3);
	}
	public Country(String code, String name, List<State> allStates) {
		this.code = code;
		this.name = name;
		this.allStates = allStates;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getAllStates() {
		return allStates;
	}
	public void setAllStates(List<State> allStates) {
		this.allStates = allStates;
	}

}



