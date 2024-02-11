package com.java.commonConcepts;

class PassByValue {
	
	private String attribute;

	public PassByValue (String a){
		this.attribute = a;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
 }

public class FooPassByValue{
public static void main(String[] args){
	PassByValue f = new PassByValue("f");
	System.out.println(f.getAttribute());
    changeReference(f); // It won't change the reference!
    System.out.println(f.getAttribute());
    modifyReference(f); // It will change the object that the reference variable "f" refers to!
    System.out.println(f.getAttribute());
    
       outer_loop:
    	for(int i=0; i<10;i++) {
    		System.out.println("i="+i);
    		int j;
    		inner_loop_for:
    			for(j=i; j<5; j++) {
    				System.out.println("j="+j);
    				if(j == 5) {
    				break inner_loop_for;
    				}
    			}
    	}
}
public static void changeReference(PassByValue a) {
	PassByValue b = new PassByValue("b");
    a = b;
}

public static void modifyReference(PassByValue c	) {
    c.setAttribute("c");
}
}



