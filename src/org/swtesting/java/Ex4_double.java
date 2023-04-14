package org.swtesting.java;

public class Ex4_double {
	//creat different method use of all eight datypes
	public double addition()
	{
		double d=500;
		return d;
	}

	public static void main(String[] args) {
		System.out.println("program start");
		
		Ex4_double obj=new Ex4_double();
		double d=obj.addition();
		System.out.println("double="+d);
		
		System.out.println("program end");

	}

}
