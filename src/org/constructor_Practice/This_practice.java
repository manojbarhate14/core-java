package org.constructor_Practice;

public class This_practice {
	public This_practice() {
		this(55.99f,700);
		System.out.println("default Const");
	}
	public This_practice(int a,int b) {
		
		System.out.println("para int const");
		
	}
	public This_practice(float a,double b) {
		//this(25);                  //this statement must be the first statement
		System.out.println("para float const");
		
	}
	public This_practice(int b, float a) {
		//this(45.5f);
		System.out.println("para int & float const");
		
	}
	public This_practice(float b,int a) {
		//this(50,66.3f);
		System.out.println("para float & int..");
	}

	public static void main(String[] args) {
		This_practice obj=new This_practice();
		
	}
	//    ***imp note***
	//this. =>to call global variable of same class
	//this() =>to call constructor of same class
	//super. =>to call global variable of same class
	//super() =>to call constructor of same class

}
