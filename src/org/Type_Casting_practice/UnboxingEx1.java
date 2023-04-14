package org.Type_Casting_practice;

public class UnboxingEx1 {

	public static void main(String[] args) {
		Integer objA =10;                //implicit
		Integer objB = new Integer(20);  //explicit

		int x =objA.intValue();
		int y =objB.intValue();

		int I1 = objA.intValue();
		int I2 = objB.intValue();
		System.out.println("I1= "+I1);
		System.out.println("I2= "+I2);
		System.out.println();

		float f1 = objA.floatValue(); //explicit
		float f2 = objB.intValue();   //explicit
		System.out.println("f1= "+f1);
		System.out.println("f2= "+f2);
		System.out.println();

		long L1 =objA.longValue(); //implicit
		long L2 = objB.intValue(); //implicit
		System.out.println("L1= "+L1);
		System.out.println("L2= "+L2);
		System.out.println();

		double d1 =45.87; 
		int i= (int)d1;     //narrowing
		System.out.println("d1= "+i);

		double d2 = objB.intValue();
		System.out.println("d2= "+d2);
	}

}
