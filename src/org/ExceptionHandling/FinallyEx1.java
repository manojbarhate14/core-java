package org.ExceptionHandling;

public class FinallyEx1 {

	public static void main(String[] args) {
		System.out.println("**program start**");
		try {
			System.out.println("inside try block");
			int div=10/0;
			System.out.println("division= "+div);
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("inside finally");
		}
				
		System.out.println("**program end**");
	}
}
