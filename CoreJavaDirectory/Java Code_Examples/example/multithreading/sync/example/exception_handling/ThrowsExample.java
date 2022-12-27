package example.multithreading.sync.example.exception_handling;

public class ThrowsExample {
	
	private static void doSomething() throws RuntimeException {
		
	}
	
	private static void create() throws  Exception{
		//This method wants to tell compiler that it may throw an exception: Exception but
		//not willing to handle it; rather its caller must handle it.
	}
	private static void make() {
		//This method calls create()
		//create(); This gives an error because exception is still not yet handled
		try {
			create(); //Here the exception is handled
		}
		catch(Exception ex) {
			System.out.println("Handled...");
		}		
	}
	
	private static void prepare() throws Exception{//Here the exception is not handled
		//Rather it is delegated to its caller
		create();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking make()
		make();//Since make() has already handled the exception, main() is not required to handle it
		//Invoking prepare()
		//prepare(); //Since prepare() has not handled the exception, main() must handle it or can further
		//delegate it
		try {
			prepare();
		}
		catch(Exception ex) {
			System.out.println("Caught");
		}
		
		doSomething();

	}

}






