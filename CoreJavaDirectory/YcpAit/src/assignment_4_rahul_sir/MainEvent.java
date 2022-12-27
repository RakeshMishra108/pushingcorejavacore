package assignment_4_rahul_sir;

public class MainEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Event E=new Event();
//		public OvernightEvent(int eventId, String eventName, 
//     float baseFare,int days,int ratePerDay,int roomCount,int farePerRoom) 
		OvernightEvent ON =new OvernightEvent(23,"RockThe",10000f,4,5000,5,9000);
		
//   public OnedayEvent(int eventId, String eventName, float baseFare,int hours,int ratePerHour,int extraHours)
		OnedayEvent OD= new OnedayEvent(43,"RushikeshParte",10000f,4,2000,2);
		System.out.println("Over Night  : "+ON.getTotalFare());
		System.out.println("Over Day   : "+OD.getTotalFare());
	
	}
}
