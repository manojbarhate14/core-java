package org.constructor_Practice;

public class GlobalVariableParaconst {
	
	int a;                                  // global variable
	
	public GlobalVariableParaconst  (int b) //parameterized constructor
	{
	System.out.println("Local Variable b="+b);
	System.out.println("Global variable a="+a);
	
	a=b;
		System.out.println("After initialising global a="+a);
		System.out.println("Para constructor");
	}

	public static void main(String[] args) {
		GlobalVariableParaconst obj=new GlobalVariableParaconst(10);
		
		
	

	}

}
