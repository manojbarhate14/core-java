package org.OOPs_inheritance_practice;

class A{
	public void test() {
		System.out.println("Manoj");
	}
}
class B extends A{
	public void test1() {
		System.out.println("Patil");
	}
}
public class Hierarchical extends A {
	public void test3() {
		System.out.println("Nashik");
	}

	public static void main(String[] args) {
		Hierarchical obj=new Hierarchical();
		obj.test();
		obj.test3();
		B obj1=new B();
		obj1.test();
		obj1.test1();
		

	}

}
//in inheritance we can not inherit constructor or private variable
// in java multilevel and hybrid Inheritance not allow


//      A
//    /   \
//  B       C    
