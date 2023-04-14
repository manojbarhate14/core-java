package org.swtesting.java;

public class MethodEx1 {
	                           //whenever you want to call any non static data from static block then you need object.
	int aa=10;               //global variable 
	static int bb=500;
	
	static MethodEx1 obj=new MethodEx1();
	
	public void additionoftwonumbers (){
	System.out.println("gobal aa="+aa);     //no need of obj bcz this is non static data yo can call them directly
	int a=10;
	int b=20;
	int sum=a+b;
	
	System.out.println("sum="+sum);
	
	}
	
	public static void main(String [] args) {

		System.out.println("global obj="+obj.aa);
	}
}
