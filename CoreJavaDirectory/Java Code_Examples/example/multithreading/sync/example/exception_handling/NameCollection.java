package example.multithreading.sync.example.exception_handling;

public class NameCollection {
	private static String[] names = {"Akshay", "Hritik", "Deepika", "Katrina", "Ranveer"};
	
	public static int getPosition(String name)  throws NameNotFoundException{
		int position = -1;
		int size = names.length;
		for(int index = 0; index < size; index++) {
			String availableName = names[index];
			if(availableName.equals(name)) {
				position = index;
				break;
			}
		}
		if(position == -1) {
			//Raise NameNotFoundException
			NameNotFoundException nx = 
					new NameNotFoundException("Unable to find this name", name);
			throw nx;
		}
		return position;
	}

}




