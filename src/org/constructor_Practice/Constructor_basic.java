package org.constructor_Practice;

public class Constructor_basic {
	public Constructor_basic()
	{
		System.out.println("default constructor");
	}
	
	public Constructor_basic(int a)      //Parameterized constructor
	{   
		System.out.println("Parameterised constructor= "+a);
	}
	
	public void addition(int a) 
	{
		System.out.println("method arguments= "+a);
	}

	public static void main(String[] args) {
		System.out.println("*****Program start****");
		Constructor_basic obj=new Constructor_basic(10);
		Constructor_basic obj1=new Constructor_basic();
		obj.addition(20);
		System.out.println("****program end****");
	
	}

}
