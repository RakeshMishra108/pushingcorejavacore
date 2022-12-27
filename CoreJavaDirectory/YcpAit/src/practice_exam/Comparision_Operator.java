package practice_exam;

public class Comparision_Operator {

	public static void main(String[] args) {
		int a=12,b=34,c=43;
		
		int r=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Maximum integer : "+r);

	}

}
