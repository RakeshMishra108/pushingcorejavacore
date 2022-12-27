package assignment_3_rahul_sir;

public class CityProcessor {

//	public static float getAvgPopulation(City [] );
//	public static String[] getBigCityNames(City []);
	
	public static void checkCity(City city[], String name)
	{
		String[] cityname = new String[city.length];
		int[] citypop = new int[city.length];
//		for(City c : city) {
//			System.out.println(c.getName());
//			if(c.getName().equals(name)) {
//				
//				System.out.println(name+" "+c.getPopulation());
//			}
//			else
//				System.out.println("city not found");
//		}
		for(int i=0; i<city.length; i++)
		{
		cityname[i] = city[i].getName();
		System.out.println(cityname[i]);
		}
		for(int i=0; i<city.length; i++)
		{
		citypop[i] = city[i].getPopulation();
		}
//		for(City c: city)
//			System.out.println(c.getName());
		for(int i=0;i<city.length;i++) {
			if(cityname[i].equals(name))
			{
				
				System.out.println(name+citypop[i]);
			}
		}
		
		
		
	}

}
