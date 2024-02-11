package com.java.commonConcepts;

public class AbstractClass {
	public static void main(String args[]){  
		AAbstractClass a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
		}

}

//Creating interface that has 4 methods  
interface AAbstractClass{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  

abstract class BAbstractClass implements AAbstractClass{ 
	public void c(){System.out.println("I am C");}  
}

class M extends BAbstractClass{

	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
}