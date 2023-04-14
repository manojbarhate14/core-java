package org.Type_Casting_practice;

class A{
	public void test0() {
		System.out.println("test0");
	}
}
class B extends A{
	public void test1() {
		System.out.println("test1");
	}
}
class C extends B{
	public void test2() {
		System.out.println("test2");
	}
}

public class Upcasting_Explicit {

	public static void main(String[] args) {
		C c = new C();
		c.test0();
		c.test1();
		c.test2();
		System.out.println("---------------------");
	//	B a=new B();
		B b =(B) c;  //Explicit upcasting
		b.test0();
		b.test1();
//  	b.test2();   //no access
		System.out.println("--------------");
//		A a =new A();
		A a =(A) c;
		a.test0();
//		b.test1();   //no access
//  	b.test2();   //no access
	}

}
