package org.constructor_Practice;

public class Globalvariable_Ex2 {
	int a;      //global variable declaration
	int x;
	static int b;
	public Globalvariable_Ex2(int a, int x,int b)  //parameterized const.
	{
		System.out.println("local a="+a);
		System.out.println("global a="+x);
		System.out.println("global a="+b);
		System.out.println("Beforer initialized global variable value");
		System.out.println(" a="+this.a);
		System.out.println(" a="+this.x);
		System.out.println(" a="+this.b);
		
		this.a=a; //initialized global variable with local variable
		this.x=x;
		
		Globalvariable_Ex2.b=b; //static variable
		
		System.out.println("after initialized global variable");
		System.out.println(" a="+this.a);
		System.out.println(" a="+this.x);
		System.out.println(" a="+this.b);
				
	}

	public static void main(String[] args) {
		Globalvariable_Ex2 obj=new Globalvariable_Ex2(20 ,30,40);
		
	/*	System.out.println(+obj.a);
		System.out.println(+obj.x);
		System.out.println(+Globalvariable_Ex2.b);*/

	}

}
