package com.java.commonConcepts;

public class MultiThreadingYieldStopSleep {
		
		public static void main( String[] args )
	    {
	        System.out.println( "Thread Run" );
	        new ThreadAATest().start();
	        new ThreadBBTest().start();
	        new ThreadCCTest().start();
	        
	        //new ThreadATest().run();
	        //new ThreadBTest().run();
	        //new ThreadCTest().run();
	    }
	 
		
	}
	class ThreadAATest extends Thread{
		 public void run() {
			 
			 for(int i=1; i<=5; i++) {
				 if(i==1) { yield();}
				 System.out.println( "\t Thread A : i = "+i); 
			 }
		
		 System.out.println("Return From Thread A");
		 }	
	}

	class ThreadBBTest extends Thread{
		
		 public void run() {
			 for(int j=1; j<=5; j++) {
				 System.out.println( "\t Thread B : j = "+j); 
				 if(j == 3) {stop();}
			 }
			 System.out.println("Return From Thread B");
			
		 }

		
	}
	class ThreadCCTest extends Thread{
		
		public void run() {
			 for(int k=1; k<=5; k++) {
				 System.out.println( "\t Thread C : k = "+k); 
				 if(k==1) {
					 try {
						sleep(1000); 
					 }
				 catch(Exception e) {
					 
				 }
				 }
			 }
			 System.out.println("Return From Thread C");
			 }	
		
	}


