package org.OOps_abstraction;

abstract class Ex1{

	int i=10, f=25;

	public void addition ()
	{
		int sum =i+f;
		System.out.println("Addition ="+sum);
	}
	public Ex1()
	{
		super();
	}
}

public class Abclass extends Ex1 {
	
	public static void main(String[] args) {
		Abclass obj =new Abclass();
		obj.addition();
		
	}

}
