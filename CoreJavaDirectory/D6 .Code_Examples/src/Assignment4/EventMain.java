package Assignment4;

public class EventMain {

	public static void main(String[] args) {
		Event E = new Event();
		Event NE = new OvernightEvent(4,5000,5,3000);
		Event DE = new OnedayEvent(4,2000,2);
		
		System.out.println("Basefare --> "+E.getTotalFare());
		System.out.println("Over Night Event --> : "+NE.getTotalFare());
		System.out.println("One Day Event -- > : "+DE.getTotalFare());
		
	}

}
