package com.java.commonConcepts;

public class MultiThreadingPriorities {

	
	public static void main( String[] args )
    {
       System.out.println( "Thread Run" );
       ThreadAAATest threadA = new ThreadAAATest();
       ThreadBBBTest threadb = new ThreadBBBTest();
       ThreadCCCTest threadc = new ThreadCCCTest();
       threadA.setPriority(Thread.MAX_PRIORITY);
       threadb.setPriority(Thread.NORM_PRIORITY);
       threadc.setPriority(Thread.MIN_PRIORITY);
       
       threadA.start();
       threadb.start();

       threadc.start();
        //new ThreadATest().run();
        //new ThreadBTest().run();
        //new ThreadCTest().run();
    }

}


class ThreadAAATest extends Thread{
	 public void run() {
		 
		 for(int i=1; i<=5; i++) {
			
			 System.out.println( "\t Thread A : i = "+i); 
			 System.out.println("ThreadId::"+Thread.currentThread().getId()+"\tThreadName::"+Thread.currentThread().getName()+"\tThreadPriority::"+Thread.currentThread().getPriority());
			 
		 }
		 
	
	 System.out.println("Return From Thread A");
	 }	
}

class ThreadBBBTest extends Thread{
	
	 public void run() {
		 for(int j=1; j<=5; j++) {
			 System.out.println( "\t Thread B : j = "+j); 
			 System.out.println("ThreadId::"+Thread.currentThread().getId()+"\tThreadName::"+Thread.currentThread().getName()+"\tThreadPriority::"+Thread.currentThread().getPriority());
		 }
		 System.out.println("Return From Thread B");
		
	 }

	
}
class ThreadCCCTest extends Thread{
	
	public void run() {
		 for(int k=1; k<=5; k++) {
			 System.out.println( "\t Thread C : k = "+k); 
			 System.out.println("ThreadId::"+Thread.currentThread().getId()+"\tThreadName::"+Thread.currentThread().getName()+"\tThreadPriority::"+Thread.currentThread().getPriority());
			 }
		 
		 System.out.println("Return From Thread C");
		 }	

}
