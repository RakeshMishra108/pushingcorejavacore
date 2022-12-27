package Arrays;

public class Arrays {
	private static double[] getSquareRoots(int[] numValues) {//creating primitive data type arrays //dynamic array creation
		int size = numValues.length;
		double[] squareRoots = new double[size];
		int index = 0;
		for(int num:numValues) {
			double sqRoot = Math.sqrt(num);
			squareRoots[index] = sqRoot;
			index++;
		}
		return squareRoots;
	}
	private static void printSum(int[] numValues) {//passing array as parameter
		int sum = 0;
		for(int num:numValues) {
			sum += num;
		}
		System.out.println("Sum : "+sum);
	}
	public static void main(String[] args) {//can be typed as String args[]
		//Every Array in java is an object
		int arr[] = new int[5];
		int arr1[] = {23,23,24};//syntax type 1
		int[] arr2 = {22,22,22};//syntax type 2 //references in stack and values in heap
		System.out.println("Array size : "+arr1.length);
		printSum(arr2);
		getSquareRoots(arr1);
		double roots[] = getSquareRoots(arr1);
		for(double root:roots) {
			System.out.print(root+" ");
		}
		String fruits[] = {"mango","apple","orange","banana"};
		for(String fr:fruits) {//simple syntax for printing array,any other modification requires original for loop syntax
			System.out.print(fr.toUpperCase()+" ");
		}
	}
}
