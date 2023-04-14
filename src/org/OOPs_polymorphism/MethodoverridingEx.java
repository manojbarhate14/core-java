package org.OOPs_polymorphism;
class ArithmeticOperation //this is parent class
{
	public void addition(int a, int b) {
		int sum =a+b;
		System.out.println("from parent class");
		System.out.println("sum= "+sum);		
	}
	public void subtraction(int a,int b) {
		int sum=a-b;
		System.out.println("from parent class ");
		System.out.println("sum= "+sum);
	}
}

public class MethodoverridingEx extends ArithmeticOperation {  // this is child class
	public void addition(int a,int b) 
	{
		int sum=a-b;
		System.out.println("from child class");
		System.out.println("sum= "+sum);
	}
	
	public static void main (String[] args) {
		
		MethodoverridingEx obj=new MethodoverridingEx();
		obj.addition(10, 20);
		obj.subtraction(50,35);
	}
}
//In method overriding call only sub class(child class) method
//method overriding is example of run time polymorphisms

