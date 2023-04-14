package org.OOPs_inheritance_practice;
class parents1{
	public void test1()
	{
		System.out.println("Manoj");
	}
}
public class Single_level extends parents1 {

	public void test2() {
		System.out.println("Barhate");
	}

	public static void main(String[] args) {
		Single_level obj =new Single_level();
		obj.test1();
		obj.test2();
	}

}
//in inheritance we can not inherit constructor or private variable
//in java multilevel and hybrid Inheritance not allow