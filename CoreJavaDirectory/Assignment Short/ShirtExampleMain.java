package Ass4;

public class ShirtExampleMain {

	public static void main(String[] args) {
		Shirt [] sh= {  new Shirt("peter england","Blue","checks"),
						new Shirt("Allensolly","white","plain"),
						new Shirt("peter england","Blue","plain")};
		
		ShirtCollection.setShirts(sh);
		int cnt=ShirtCollection.getShirtCount("checks");
		if(cnt==0)
		{
			System.out.println("These type of shirts are not availbale ");
		}
		else 
		{
		System.out.println("Available shirts of these patterns are :"+cnt);	
		}
		Shirt s=new Shirt("Allensolly","white","plain");
		boolean b=ShirtCollection.isShirtAvailable(s);
		System.out.println("Shirt is available :" +b);
		}

	}


