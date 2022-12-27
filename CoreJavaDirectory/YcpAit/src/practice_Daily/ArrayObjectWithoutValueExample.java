package practice_Daily;

public class ArrayObjectWithoutValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String technologies[] = new String[5];
		technologies[0] = "Spring Framework";
		technologies[1] = "React";
		technologies[3] = "Angular";
		
		for(String tech : technologies) {
			if(tech != null)
				System.out.println(tech);
		}

	}

}
