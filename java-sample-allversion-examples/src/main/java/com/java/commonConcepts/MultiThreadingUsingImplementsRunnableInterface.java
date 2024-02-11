package com.java.commonConcepts;

public class MultiThreadingUsingImplementsRunnableInterface {

	public static void main( String[] args )
    {
		RunnableTest runnableInterface = new RunnableTest();
		Thread threadX= new Thread(runnableInterface);
		threadX.start();
        //runnableInterface.run();
    }

}

class RunnableTest implements Runnable{
	
	@Override
	public void run() {
	
		for(int i=1;i<=10; i++) {
			System.out.println("\tThreadX" +i);
		}
		System.out.println("End of the thread");
	}
	
}
