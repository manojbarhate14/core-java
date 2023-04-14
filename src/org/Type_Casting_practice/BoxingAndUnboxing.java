package org.Type_Casting_practice;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		int a=10;
//		Integer obj=new Integer(10);  implicit
//		Integer obj1=new Integer(a);  explicit
		
		Integer obj=10;   //implicit
		Integer obj1=a;   //implicit
	
		
		System.out.println("obj= "+obj);   
		System.out.println("obj1= "+obj1);

	}

}
