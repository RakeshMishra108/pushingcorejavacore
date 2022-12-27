package example.multithreading;

public class CurrentThreadExample {

	public static void main(String[] args) {
		System.out.println("Demonstrating currentThread()");
		//Obtaining a handle to the currently running thread: Main Thread
		Thread mainThread = Thread.currentThread();
		String mainThreadName = mainThread.getName();
		int mainThreadPriority = mainThread.getPriority();
		System.out.println("Main thread name = " + mainThreadName);
		System.out.println("Main thread priority = " + mainThreadPriority);
		//Stopping this main thread abruptly
		mainThread.stop();
		System.out.println("This message will not get printed");

	}

}
