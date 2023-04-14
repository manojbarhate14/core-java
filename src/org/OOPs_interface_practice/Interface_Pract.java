package org.OOPs_interface_practice;

interface F4{
	public void addition();
	public void subtraction();
}
abstract class A1{
	abstract public void multiplication();
	abstract public void division();
}

public class Interface_Pract extends A1 implements F4, Interface_ex {
// we can use extends one class and implement one or more 
//	interface at the same time in one class
	public static void main(String[] args) {
	}

	
	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}
}
//interface don't have constructor
