package org.Type_Casting_practice;
class A2{
	public void test0() {
		System.out.println("test0");
	}
}
class B2 extends A2{
	public void test1() {
		System.out.println("test1");
	}
}
class C2 extends B2{
	public void test2() {
		System.out.println("test2");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		C2 c=new C2();
		A2 a=(A2) c;   //upcasting
		B2 b=(B2) a;  // //downcasting
		C2 c1=(C2) a; //downcasting
		
		a.test0();
		System.out.println("--------------");
		b.test0();
		b.test1();
		System.out.println("---------------");
		c1.test0();
		c1.test1();
		c1.test2();
	}

}
