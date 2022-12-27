package re_practice;

public class ProgramAssignmentExample {

	public static void main(String[] args) {
		
		//int ratePerPlate, int plateCount, int bill, int discount
		 ProgramAssignment pr=new  ProgramAssignment();
		 
		pr.setPlateCount(56);
		pr.setRatePerPlate(600);
		
		 
		 
		 System.out.println("Bill :"+pr.getBill()+"Discounted Bill : "+pr.getDiscount()+"Rate "+pr.getPlateCount());
		  

	}

}
