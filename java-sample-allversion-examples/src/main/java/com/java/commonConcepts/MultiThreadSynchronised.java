package com.java.commonConcepts;

public class MultiThreadSynchronised {

	public static void main( String[] args )
    {
	   Pyramid pobj = new Pyramid();
	   A threadA = new A(pobj);
	   B threadB = new B(pobj);
	   threadA.start();
	   threadB.start();
	   
    }
}

class A extends Thread{
	
	Pyramid p;
	A(Pyramid p){
		this.p =p;
	}
	public void run() {
		p.draw_pyramid('*');
	}
	
}

class B extends Thread {
	Pyramid p;
	B(Pyramid p){
		this.p =p;
	}
	public void run() {
		p.draw_pyramid('#');
	}
}

class Pyramid{
     synchronized void draw_pyramid(char ch){
		for(int i=0; i<10;i+=2) {
			for (int k=10-i;k>0;k-=2) {
				System.out.println("");
			}
			for(int j=0;j<=i;j++) {
				System.out.println(ch);
			}
			//System.out.println();
		}
	}
}