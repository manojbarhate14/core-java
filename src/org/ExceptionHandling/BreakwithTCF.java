package org.ExceptionHandling;

public class BreakwithTCF {

	public static void main(String[] args) {
		System.out.println("**program start**");
		try {
			System.out.println("inside try block");
			for (int i=0; i<=10; i++) {
				if(i==8) {
					i=i/0;
					break;
				}
				System.out.println("i= "+i);
			}
			System.out.println("try complete");
		}catch(ArithmeticException e) {
			System.out.println("inside Arithmetic exception");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("inside catch");
		}finally {
			System.out.println("inside FINALLY");
			System.out.println("1");
			System.out.println("2");
		}
		System.out.println("***program end***");
		
	}

}
