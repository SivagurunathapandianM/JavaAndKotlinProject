package com.java.commonConcepts;

public class OperatorInstanceofExample {
	
	public static void main(String args[])
	{  
		Printable p=new BOperatoInstanceOf();  
		Call c=new Call();  
		c.invoke(p);  
	}  
}

interface Printable{
	
}  
class AOperatorInstanceOf implements Printable
{  
	public void a()
	{
		System.out.println("a method");
    }  
}  
class BOperatoInstanceOf implements Printable
{  
  public void b()
   {
	  System.out.println("b method");
   }  
}  
  
class Call
{  
    void invoke(Printable p)
    {//upcasting  
    		if(p instanceof AOperatorInstanceOf)
    		{  
    			AOperatorInstanceOf a=(AOperatorInstanceOf)p;//Downcasting   
    			a.a();  
    		}  
    		if(p instanceof BOperatoInstanceOf)
    		{  
    			BOperatoInstanceOf b=(BOperatoInstanceOf)p;//Downcasting   
    			b.b();  
            }  
    }  
}//end of Call class  
  