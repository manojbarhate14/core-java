package org.OOPs_inheritance_practice;

class Parent4{
	short s;
	int i;
	
	public Parent4(short s, int i) {
		this.s=s;    ////this. =>to call global variable of same class
		this.i=i;
		System.out.println("parent class= "+s);
		System.out.println("parent class= "+i);

	}
}
public class Child_class3 extends Parent4 {
	
	public Child_class3(short s, int i)  //para constructor
	{	
		super(s,i);   //by default hidden
		System.out.println("Parent i= "+super.i);
		System.out.println("Parent s= "+super.s);
	}

	public static void main(String[] args) {
		Child_class3 obj=new Child_class3((short)50,30);
	}
}
//super. =>to call global variable of same class

