package practice_exam;

public class Class_TransferStatement {

	public static void main(String[] args) {
		int num=2;
		for(int i=1;i<=15;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(num*i);
		}

	}

}
