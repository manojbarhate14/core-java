package org.Type_Casting_practice;
class A1{
	public void test() {
		System.out.println("test");
	}
}
class B1 extends A1{
	public void test1() {
		System.out.println("test1");
	}
}
class C1 extends B1{
	public void test2() {
		System.out.println("test2");
	}
}

public class Upcasting_Implicit {

	public static void main(String[] args) {
		C1 c=new C1();
		c.test();  //Implicit upcasting
		c.test1();
		c.test2();
		System.out.println("-----------------");
		B1 b=new B1();
		b.test();
		b.test1();
	//	a.test2();    no access
		System.out.println("------------------");
		A1 a=new A1();
		a.test();
//		a.test1();   no access
//		a.test2();
	}

}
