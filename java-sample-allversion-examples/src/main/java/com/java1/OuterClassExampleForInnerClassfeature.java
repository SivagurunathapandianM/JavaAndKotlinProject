package com.java1;

public class OuterClassExampleForInnerClassfeature {
	
	 int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	  
	  private class InnerClassprivate {
		    int y = 5;
		  }
	  
	  static class InnerClassstatic {
		    int y = 5;
		  }
	  
	  class InnerClassmethod {
		    public int myInnerMethod() {
		      return x;
		    }
		  }
	  
	  

}
