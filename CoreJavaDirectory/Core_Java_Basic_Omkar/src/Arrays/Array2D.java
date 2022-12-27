package Arrays;

public class Array2D {

	public static void main(String[] args) {
		//2D array can be called array of array
		int matrix[][] = {
				{1,2,3,4,5},
				{4,5,6},
				{7,8,9,11,23,1,4,5,6}
		};
		int rows = matrix.length;// matrix.length refers to no. of rows
		int columns = matrix[2].length;// matrix[0].length refers column
		System.out.println(rows);
		System.out.println(columns);
	}

}
