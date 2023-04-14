package org.keyword;

class B
{
	int a=20;
	void show () 
	{
		int a=35;
		
		System.out.println("hello super class");
		System.out.println("a= "+a);
	}
}
	
	public class Superkeyword extends B {
		int a=10;
		void show() 
		{
			super.show();
			System.out.println("hello child class");
			System.out.println("sub class= "+a);
			System.out.println("sub class= "+super.a);
		}

	public static void main(String[] args) {
		Superkeyword obj=new Superkeyword();
		obj.show();
	}

}
//super keyword is a ref variable that refer to the parent class object
//super keyword it use to differentiate the member of super class- 
// from the member of sub class if the name of both variable or method are same.

//In constructor super() keyword by default are there
