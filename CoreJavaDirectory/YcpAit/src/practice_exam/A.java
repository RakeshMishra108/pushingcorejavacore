package practice_exam;


	public class A  
	{  
	    static int m=100;//static variable 
	   
	     void method()  
	    {    
	    	 int n=90;//local variable
	        System.out.println("Addition : "+ (m+n));
	        System.out.println("Addition : "+ (n));
	        System.out.println("Addition : "+ (m));
	        System.out.println("####################################22");
	    }  
	    
		public static void main(String args[])  
	    {  
	    
	        int data=50;//instance variable
	        System.out.println("Addition : "+ (data));
	        System.out.println("Addition : "+ (m));
	        System.out.println("Addition : "+ (m+data));
	        System.out.println("####################################11");
	    	A var=new A();
	    	var.method();
	    	var.method2();
	    }	
	    
	   
		Void method2() {
	    	A var=new A();
	    	var.method();
	    	System.out.println(" numbers : " + m);
//	    	System.out.println(" numbers : " + n);
//	    	System.out.println(" numbers : " + data);
			return null;                                                   // Why i needed to add returrn type in this method ?
	    	
	    }
	     
	}//end of class 


