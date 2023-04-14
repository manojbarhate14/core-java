package org.Type_Casting_practice;

public class Narrowing_Pract {
	public static void main(String[] args) {
		byte b =120;
		short s=b;           //implicit type casting 
	  //short s =(short)b;   //explicit type casting
		
		System.out.println("b ="+b);
		System.out.println("a ="+s);
		
		short s1=10;
		byte b1=(byte)s1;
		System.out.println("s1 ="+s1);
		System.out.println("b1 ="+b1);
		
		short s2=130;
		byte b2 =(byte)s2;
		System.out.println("s2 ="+s2);
		System.out.println("b2 ="+b2);
	}

}
