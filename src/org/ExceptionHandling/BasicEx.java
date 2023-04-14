package org.ExceptionHandling;

public class BasicEx {
	
	public int Division(int a,int b) {
		System.out.println("---Division Start---");
		int div=0;
		try {
			System.out.println("inside try block");
			div= a/b;
			System.out.println("after division");
		}catch (ArithmeticException e) {
			
			System.out.println("Inside catch block");
			e.printStackTrace();
		}
		System.out.println("after printing exception");
		System.out.println("division= "+div);
		System.out.println("Division end");
		
		return div;
	}

	public static void main(String[] args) {
		BasicEx obj = new BasicEx();
		obj.Division(10,0);
		
	}

}
