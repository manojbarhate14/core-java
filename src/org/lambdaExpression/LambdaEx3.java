package org.lambdaExpression;

interface if5{
	public int addition (int a, int b);
	public int lengthofstring(String str);

}
public class LambdaEx3 	{

	public static void main(String[] args) {

		if5 i= new if5() {

			public int addition(int a, int b) {

				return a+b;
			}

			public int lengthofstring(String str) {	

				return str.length();
			}

		};
		System.out.println("sum ="+i.addition(25, 20));
		System.out.println("length of string= "+i.lengthofstring("manoj"));
	}

}
