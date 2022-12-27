package daily_practice;

public class GenericExamole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adder<String> strAdder=new StringAdder();
		Adder<Integer> intAdder=new IntegerAdder();
		
		String finalString =strAdder.doAdders("Hii","hello");
	 Integer finalInteger= intAdder.doAdd(23, 34)	;
	 
	 System.out.println("");
	}

}
