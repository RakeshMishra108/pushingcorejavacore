package example.collections;

import java.util.ArrayList;
import java.util.List;

public class CountryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a country : india
		Country india = new Country();
		
		//Creating a country australia
		//Need to create a list of Australian States
		State ausState1 = new State("NSW", "New South Wales", "Sydney");
		State ausState2 = new State("VIC", "Victoria", "Melbourne");
		List<State> australianStates = new ArrayList<State>();
		australianStates.add(ausState1);
		australianStates.add(ausState2);
		
		Country australia = new Country("AUS", "Australia", australianStates);
		
		//--------------Displaying country data--------------
		String name = india.getName();
		List<State> indianStates =  india.getAllStates();//Retrieving the list of State of india
		System.out.println("Country: " + name);
		System.out.println("List of state names: ");
		for(State st : indianStates) {
			String stateName = st.getName();
			System.out.println(stateName);
		}

	}

}
