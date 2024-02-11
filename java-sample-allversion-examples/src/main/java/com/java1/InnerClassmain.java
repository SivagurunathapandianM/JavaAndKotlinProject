package com.java1;

public class InnerClassmain {
	
	public static void main(String[] args) {
		OuterClassExampleForInnerClassfeature myOuter = new OuterClassExampleForInnerClassfeature();
	    
		OuterClassExampleForInnerClassfeature.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	    
	    OuterClassExampleForInnerClassfeature.InnerClassstatic  myInnerStatic = new OuterClassExampleForInnerClassfeature.InnerClassstatic();
	    System.out.println(myInner.y);
	    
	    OuterClassExampleForInnerClassfeature.InnerClassmethod myInnerMethod = myOuter.new InnerClassmethod();
	    System.out.println(myInnerMethod.myInnerMethod());
	  }

}
