package org.OOPs_Encapsulation;

public class Getter_method {
	private int a =10;
	private int b= 20;

	public int getA()          //getter method
	{
		return a;
	}
	public int getB()         //getter method
	{
		return b;
	}
	public void test() 
	{
		System.out.println("test method from ex1");
	}

	public static void main(String[] args) {
		Getter_method obj=new Getter_method();
		System.out.println("a= "+obj.getA());
		System.out.println("b= "+obj.getB());
		obj.test();

	}

}
