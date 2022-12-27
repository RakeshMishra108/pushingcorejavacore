package Assignment3;

public class CityProcessor {
	public static float getAvgpopulation(City city[]) {
		int size = city.length;
		float sum = 0, avg = 0;
		for(City population:city) {
			int pop = population.getPopulation();
			sum = sum + pop;
			avg = sum / size;
		}
		return avg;
	}
	public static String[] getBigCityNames(City city[]) {
		int size = city.length;
		String[] name = new String[size];
		int index = 0;
		for(City nam:city) {
			if(nam.getPopulation()>4000000) {
				name[index] = nam.getName();
			}index++;
		}
		return name;
	}
}