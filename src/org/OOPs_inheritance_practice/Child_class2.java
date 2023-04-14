package org.OOPs_inheritance_practice;

class Parent3
{
	short s=100;
	int i=50;


	public Parent3 (int a) //para constr
	{   int v=0;

	System.out.println("this is parent constructor");
	}
}

public class Child_class2 extends Parent3{
	public Child_class2()  //this is default constructor
	{
		super(10);
		System.out.println("parent s="+super.i);
	}

	public static void main(String[] args) {
		Child_class2 obj =new Child_class2();
		System.out.println("s="+obj.s);


	}

}
//java says=>suppose you are creating any type of const in your class--
//then is not my responsibility to create a const
//super. =>to call global variable of same class
//super() =>to call constructor of same class