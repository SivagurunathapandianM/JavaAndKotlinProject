package com.java.commonConcepts;

public class MultiThreadingUsingExtendThreadClass {
	
	public static void main( String[] args )
    {
        System.out.println( "Thread Run" );
        new ThreadATest().start();
        new ThreadBTest().start();
        new ThreadCTest().start();
        
        //new ThreadATest().run();
        //new ThreadBTest().run();
        //new ThreadCTest().run();
    }
 
	
}
class ThreadATest extends Thread{
	 public void run() {
	 for(int j=1; j<=5; j++) {
		 System.out.println( "\t Thread A : j = "+j); 
		 try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 }
	 System.out.println("Return From Thread A");
	 }	
}

class ThreadBTest extends Thread{
	
	 public void run() {
		 for(int i=1; i<=5; i++) {
			 System.out.println( "\t Thread B : i = "+i); 
			 try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 System.out.println("Return From Thread B");
		
	 }

	
}
class ThreadCTest extends Thread{
	
	public void run() {
		 for(int k=1; k<=5; k++) {
			 System.out.println( "\t Thread C : k = "+k); 
			 try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println("Return From Thread C");
		 }	
	
}
