package org.OOPs_inheritance_practice;

class Vehicle{
	int a=10, b=20;

	public int addition() 
	{
		return a+b;
	}
}

public class Car_Ex1 extends Vehicle{
	//copy of parent class non static [global variable and method]

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		int sum=obj.addition();
		System.out.println("sum= "+sum);
	}

}

// Inheritance create IS-A relationship for ex.  Car IS A Vehicle
//in this relationship two class tightly coupled create blood relationship
//inheritance happen through chain as constructor.
//in inheritance we can not inherit constructor or private variable
