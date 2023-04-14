package org.OOps_abstraction;
abstract class Abclassss
{
	int i=10 , f=55;
	public void addition() 
	{
		int sum=i+f;
		System.out.println("addition= "+sum);
	}
	
	public  Abclassss()
	{
		super();
	}
}

public class AbstractionPract extends Abclassss  
{
	public AbstractionPract() 
	{
		super();
	}

	public static void main(String[] args) {
//Abclassss obj =new Abclassss(); //we can't create object of abstract class
		
		System.out.println("");
		AbstractionPract obj =new AbstractionPract();
		obj.addition();
		
	
	}

}
