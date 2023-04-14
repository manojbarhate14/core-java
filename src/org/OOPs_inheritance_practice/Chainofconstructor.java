package org.OOPs_inheritance_practice;

class Parent1{
	public Parent1()  // By default hidden
	{
	//	super(); //by default hidden
		System.out.println("Parent1");
	}

	int a=10, b=20;

	public int addition() 
	{
		System.out.println("Addition");
		return a+b;
	}
}

public class Chainofconstructor extends Parent1 {
	public Chainofconstructor () // By default hidden
	{  
		//super();      // By default hidden
		System.out.println("Chainofconstructor");
	}

	public static void main(String[] args) {

		System.out.println("program start");
		Chainofconstructor obj =new Chainofconstructor();
		System.out.println("program end");

	}

}
//inheritance happen through chain as constructor.
//***imp note***
//this. =>to call global variable of same class
//this() =>to call constructor of same class
//super. =>to call global variable of same class
//super() =>to call the parent class constructor.
//each constructor call its parent class constructor by using super() statement this is by default hidden
//you can write either this() or super()
//because this() and super() should be first statement of constructor
