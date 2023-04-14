package org.assignment_practice;

class A{
	public void helloA() {
		System.out.println("Hello A");
	}
}

class B extends A{
	public void helloB() {
		System.out.println("Hello B");
	}
}
class C extends B {
	public void helloC() {
		System.out.println("hello C");
	}
}

public class InterviewQue {

	public static void main(String[] args) {
		B b= new B();
		A a = new A();
		A aa= new B();
//		B bb= new A();     why?
		C c= new C();
		c.helloA();
		c.helloB();
		c.helloC();
		
	//	C ccc= new B();     wehy??
		B cc= new C();
		cc.helloA();
		cc.helloB();

		
		
		b.helloA();
		b.helloB();
		a.helloA();
	//	a.helloB();
		aa.helloA();
	//	aa.helloB();
		

	}

}
