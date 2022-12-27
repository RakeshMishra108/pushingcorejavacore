package ExceptionHandling;

public class NameCollection {
	private static String[] names = {"Akshay","Hritik","Deepika","Katrina","Ranveer"};
	public static int getPosition(String name) throws NameNotFoundException {
			int position = -1;
			for(int i=0;i<names.length;i++) {
				String availableName = names[i];
				if(availableName.equals(name)) {
					position = i;
					break;
				}
			}
			if(position == -1) {
				//Raise NameNotFoundException
				NameNotFoundException nx = new NameNotFoundException("Unable to find this name ",name);
				throw nx;
			}
				
			return position;
	}
}
