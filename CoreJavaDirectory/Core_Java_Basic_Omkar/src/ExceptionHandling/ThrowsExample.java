package ExceptionHandling;

public class ThrowsExample {
	private static void doSomething() throws RuntimeException{
		
	}
	private static void create() throws Exception{
		//this method wants to the compiler that it may throw an exception : Exception
		//but not willing to handle it;rather its caller must handle it.
		
	}
	private static void make() {
		//this method calls create
		//create(); //this gives an error because exception is still not yet handled
		try {
			create();
		}
		catch(Exception ex) {
			System.out.println("handled.....");
		}
	}
	
	private static void prepare() throws Exception{//here the exception is not handle
		//rather it is delegated to its caller
		create();
	}
	public static void main(String[] args){//try not to throw exception to main() method 
		//invoking make
		make();//Since make() has already handled the exception,main() is not required to handle it
		//invoking prepare();
		//prepare();//Since prepare() has not handled the exception ,main() must handle it or can further throws
		try{
			prepare();
		}
		catch(Exception ex) {
			
		}
		
		doSomething();//unchecked exception
	}

}
