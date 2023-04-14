package org.keyword;

public class This_pract {
	int a;
	public This_pract(int a) {
		this.a=a;
	}
	void show() {
		int a=20;
		System.out.println("show method");
		System.out.println(this.a);
	}
	void system() {
		int a=25;
		System.out.println("System method");
		System.out.println("a="+a);
	}
	public This_pract() {
		System.out.println("This class");
	}

	public static void main(String[] args) {
		This_pract obj=new This_pract(100);
	//	System.out.println(obj);
		obj.show();
		obj.system();

	}
}
//this keyword is a ref variable that refer to the current  class object
//this keyword refer to the current object inside a method or constructor 
//this keyword use for differentiate global or local variable


