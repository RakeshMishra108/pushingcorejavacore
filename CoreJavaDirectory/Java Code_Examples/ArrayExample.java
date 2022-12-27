
public class ArrayExample {

	public static void main(String[] args) {
		String[] fruits = {"Mango", "Apple", "Orange", "Watermelon", "Pineapple"};
		/*int size = fruits.length;
		for(int index = 0;index < size; index++) {
			String fruit = fruits[index];
			System.out.println(fruit.toUpperCase());
		}*/
		
		for(String fr : fruits) {//Applicable only for arrays and collections
			System.out.println(fr.toUpperCase());
		}

	}

}
