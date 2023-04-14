package org.swtesting.java;

public class MultiplecopiesEx1 {
	int a=10;      //global variable
	short b=50;     
	
	public static void main(String[] args) {
		
		System.out.println("***for obj***");
		MultiplecopiesEx1 obj=new MultiplecopiesEx1();
		System.out.println("obj="+obj.a);
		System.out.println("obj="+obj.b);
		System.out.println();
		System.out.println();
		
		System.out.println("***for obj1***");
		System.out.println("obj1="+obj.a);
		System.out.println("obj1="+obj.b);
		
		obj.a=800;
		obj.b=-80;
		
		System.out.println("after updating value");
		System.out.println("obj1="+obj.a);
		System.out.println("obj1="+obj.b);
		System.out.println();
		
		
		obj.a=50;
		obj.b=5000;
		
		System.out.println("Again updating value");
		System.out.println("obj2="+obj.a);
		System.out.println("obj2="+obj.b);
		System.out.println();
		
		System.out.println("program end");
		
	}
}
