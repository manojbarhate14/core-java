package org.swtesting.java;

public class StaticEx1 {
	static int aa=500;
	static int bb=-1000;

	public static void main(String[] args) {
		System.out.println("theier are three method for call static data by object,class name,own name");
		System.out.println();
		
		System.out.println("***By using object***");
		StaticEx1 obj1=new StaticEx1();
		System.out.println("aa="+obj1.aa);
		System.out.println("bb="+obj1.bb);
		System.out.println();
		
	    aa=100;
		bb=800;
		System.out.println("updating value");
		
		System.out.println("***By using class name***"); //this is java standard
	//	StaticEx1 obj2=new StaticEx1();
		System.out.println("aa="+StaticEx1.aa);
		System.out.println("bb="+StaticEx1.bb);
		System.out.println();
		
		System.out.println("***by using direct theier name ");
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
		System.out.println();
		System.out.println("program end");
		
	

	}

}
