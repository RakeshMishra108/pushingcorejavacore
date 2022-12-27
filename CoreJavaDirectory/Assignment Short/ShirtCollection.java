package Ass4;

public class ShirtCollection {
	public static Shirt shirts [];

	
	

	public static void setShirts(Shirt [] sh) {
		
		shirts=sh;
		
	}
	public static int getShirtCount(String type) {
		
		int cnt=0;
		for(Shirt sh:shirts) {
			String t=sh.getType() ;
			if(t.equals(type))
				cnt++;
		}
		return cnt;
		
	}
	public static boolean isShirtAvailable(Shirt shirt) {
		boolean r=false;
		for(int index=0;index < shirts.length ; index++) {
			
			if(shirts[index].equals(shirt))
				r=true;
		}
		
		return r;
		
	}
}

		


