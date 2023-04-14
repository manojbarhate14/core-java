package org.OOPs_inheritance_practice;
class parents2{
	public void test() {
		System.out.println("Manoj");
	}
}
class parents3 extends parents2{
	public void test1() {
		System.out.println("Patil");
	}
}

public class Multi_level extends parents3  {
	public void test2() {
		System.out.println("nashik");
	}

	public static void main(String[] args) {
		Multi_level obj=new Multi_level();
		obj.test();
		obj.test1();
		obj.test2();
		System.out.println();

	}

}
//in inheritance we can not inherit constructor or private variable
//in java multilevel and hybrid Inheritance are not support