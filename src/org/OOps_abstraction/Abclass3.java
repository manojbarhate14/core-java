package org.OOps_abstraction;

abstract class Absc1{
	
	int i=10,f=25;
	
	//only declaration means incomplete	
	
	abstract public void addition();
	abstract public void subtraction();
	abstract public void multiplication();
	abstract public void division();
	abstract public void math();
}
abstract public class Abclass3 extends Absc1 {
	
	public static void main(String[] args) {
		System.out.println("Abclass3");
		
	}


}
