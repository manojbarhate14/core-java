package org.OOPs_interface_practice;

interface F1{    //if you know all method are abstracts, so no need to write abstract keyword explicitly

	int a=15,b=10;
	int sum=a+b;
	int sub=a-b;
	
	// In interface by default everything is public

	 void addition ();
	 void subtraction ();	
	
}
interface f2 {
	void test();
	void test1();
}

public class Ex1 implements F1,f2{ 
	//by using interface we can achieve multiple inheritance
	//interface represent IS A relationship

	public static void main(String[] args) {
		Ex1 obj=new Ex1();
		obj.addition();
		obj.subtraction();
		obj.test();
		obj.test1();
	}
	public void addition() {
		System.out.println(sum);		
	}
	public void subtraction() {
		System.out.println(sub);
	}
	public void test() {
		System.out.println("manoj");
	}
	public void test1() {
		System.out.println("barhate");
	}
}
//interface don't have constructor
