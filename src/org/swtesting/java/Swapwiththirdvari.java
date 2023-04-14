package org.swtesting.java;

public class Swapwiththirdvari {
// swapping of two variable value without using third variable
	public void swap1(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a);

		System.out.println("b="+b);
	}
	public void swap2(int c,int d) {
		int e;
	    e=c;
	    c=d;
	    d=e;
		System.out.println("c="+c);
		System.out.println("d="+d);
	}

	public static void main(String[] args) {
		System.out.println("program start");
		System.out.println("with using two variable");
		Swapwiththirdvari obj=new Swapwiththirdvari();
		obj.swap1(50,75);
		System.out.println("with using third variable");
		obj.swap2(100,300);
		System.out.println("program end");
		
		

	}

}
